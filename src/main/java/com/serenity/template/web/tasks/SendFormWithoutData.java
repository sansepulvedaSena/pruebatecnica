package com.serenity.template.web.tasks;

import com.serenity.template.web.userinterfaces.OrderForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class SendFormWithoutData implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(OrderForm.PLACE_ORDER_BTN),
                Click.on(OrderForm.PURCHASE_BTN)
        );
    }
    public static SendFormWithoutData inPage() {
        return Tasks.instrumented(SendFormWithoutData.class);
    }
}