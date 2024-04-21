package com.serenity.template.web.tasks;

import com.serenity.template.web.interactions.ValuesSumatory;
import com.serenity.template.web.userinterfaces.Cart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class AddSomeProductsToCart implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(ValuesSumatory.inPage(),
                Click.on(Cart.GO_TO_CART),
                WaitUntil.the(Cart.TOTAL_LBL, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds());

    }

    public static AddSomeProductsToCart inPage() {
        return Tasks.instrumented(AddSomeProductsToCart.class);
    }
}
