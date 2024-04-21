package com.serenity.template.web.tasks;

import com.serenity.template.web.userinterfaces.Cart;
import com.serenity.template.web.userinterfaces.InCart;
import com.serenity.template.web.userinterfaces.Landing;
import com.serenity.template.web.utils.GenericUtils;
import com.serenity.template.web.utils.SerenitySession;
import io.cucumber.java.jv.Lan;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AddSomeProductsToCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i < 3; i++) {
            GenericUtils.waitSeconds(4);
            actor.attemptsTo(
                    Click.on(Landing.PRODUCT),
                    Click.on(Cart.ADD_PRODUCT));
            GenericUtils.waitSeconds(2);
            actor.attemptsTo(Switch.toAlert().andAccept());
            actor.attemptsTo(
                    Click.on(Landing.HOME));
            GenericUtils.waitSeconds(2);
        }
        actor.attemptsTo(Click.on(Cart.GO_TO_CART));
        GenericUtils.waitSeconds(10);
    }

    public static AddSomeProductsToCart inPage() {
        return Tasks.instrumented(AddSomeProductsToCart.class);
    }
}
