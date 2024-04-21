package com.serenity.template.web.tasks;

import com.serenity.template.web.userinterfaces.Cart;
import com.serenity.template.web.userinterfaces.OrderForm;
import com.serenity.template.web.utils.GenericUtils;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class GoToCartAfterPurchase implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        GenericUtils.waitSeconds(2);
        actor.attemptsTo(
                Click.on(OrderForm.CONFIRM_PURCHASE_BTN)
        );
        GenericUtils.waitSeconds(2);
        actor.attemptsTo(
                Click.on(Cart.GO_TO_CART));

    }

    public static GoToCartAfterPurchase inPage() {
        return Tasks.instrumented(GoToCartAfterPurchase.class);
    }
}