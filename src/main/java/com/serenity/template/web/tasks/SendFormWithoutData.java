package com.serenity.template.web.tasks;

import com.serenity.template.web.questions.ValidateAlertText;
import com.serenity.template.web.userinterfaces.OrderForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SendFormWithoutData implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(OrderForm.PLACE_ORDER_BTN),
                Click.on(OrderForm.PURCHASE_BTN)
        );
        actor.should(seeThat(ValidateAlertText.is("Please fill out Name and Creditcard.")));
    }
    public static SendFormWithoutData inPage() {
        return Tasks.instrumented(SendFormWithoutData.class);
    }
}