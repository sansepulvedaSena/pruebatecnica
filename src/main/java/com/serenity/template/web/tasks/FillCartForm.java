package com.serenity.template.web.tasks;

import com.serenity.template.web.userinterfaces.Cart;
import com.serenity.template.web.userinterfaces.InCart;
import com.serenity.template.web.userinterfaces.Landing;
import com.serenity.template.web.userinterfaces.OrderForm;
import com.serenity.template.web.utils.GenericUtils;
import com.serenity.template.web.utils.SerenitySession;
import io.cucumber.java.jv.Lan;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class FillCartForm implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(OrderForm.PLACE_ORDER_BTN),
                Enter.theValue("Santiago").into(OrderForm.INPUT_NAME),
                Enter.theValue("Colombia").into(OrderForm.INPUT_COUNTRY),
                Enter.theValue("Medellín").into(OrderForm.INPUT_CITY),
                Enter.theValue("123412341234").into(OrderForm.INPUT_CREDIT_CARD),
                Enter.theValue("04").into(OrderForm.INPUT_MONTH),
                Enter.theValue("2025").into(OrderForm.INPUT_YEAR),
                Click.on(OrderForm.PURCHASE_BTN)
                );
    }
    public static FillCartForm inPage() {
        return Tasks.instrumented(FillCartForm.class);
    }
}