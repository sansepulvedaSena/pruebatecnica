package com.serenity.template.web.tasks;

import com.serenity.template.web.userinterfaces.Cart;
import com.serenity.template.web.userinterfaces.InCart;
import com.serenity.template.web.userinterfaces.Landing;
import com.serenity.template.web.utils.GenericUtils;
import com.serenity.template.web.utils.SerenitySession;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AddToCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(Landing.PRODUCT, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(Landing.PRODUCT),
                WaitUntil.the(Cart.PRODUCT_NAME, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds());
        SerenitySession.set("product",Cart.PRODUCT_NAME.resolveFor(actor).getText());
        actor.attemptsTo(Click.on(Cart.ADD_PRODUCT));
        GenericUtils.waitSeconds(1);
        actor.attemptsTo(Switch.toAlert().andAccept(),Click.on(Cart.GO_TO_CART),
                WaitUntil.the(InCart.PRODUCT_TITLE, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds());
    }

    public static AddToCart inPage() {
        return Tasks.instrumented(AddToCart.class);
    }
}
