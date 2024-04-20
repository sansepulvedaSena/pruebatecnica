package com.serenity.template.web.tasks;

import com.serenity.template.web.userinterfaces.Landing;
import io.cucumber.java.jv.Lan;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;

public class AddToCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Landing.SELECT_CATEGORY), Click.on(Landing.PRODUCT), Switch.toAlert().andAccept());

    }

    public static AddToCart inPage() {
        return Tasks.instrumented(AddToCart.class);
    }
}
