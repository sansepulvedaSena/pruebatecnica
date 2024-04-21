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

public class DeleteFromCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        GenericUtils.waitSeconds(2);
        actor.attemptsTo(
                Click.on(Landing.PRODUCT),
                WaitUntil.the(Cart.PRODUCT_NAME, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds());
        actor.attemptsTo(Click.on(Cart.ADD_PRODUCT));
        GenericUtils.waitSeconds(2);
        actor.attemptsTo(Switch.toAlert().andAccept(),Click.on(Cart.GO_TO_CART),
                WaitUntil.the(InCart.DELETE_PRODUCT, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds());
                actor.attemptsTo(Click.on(InCart.DELETE_PRODUCT));
        GenericUtils.waitSeconds(3);


    }

    public static DeleteFromCart inPage() {
        return Tasks.instrumented(DeleteFromCart.class);
    }
}

