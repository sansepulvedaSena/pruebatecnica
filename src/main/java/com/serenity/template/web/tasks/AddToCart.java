package com.serenity.template.web.tasks;

import com.serenity.template.web.userinterfaces.Cart;
import com.serenity.template.web.userinterfaces.Landing;
import com.serenity.template.web.utils.GenericUtils;
import io.cucumber.java.jv.Lan;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.Wait;

public class AddToCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Landing.SELECT_CATEGORY), Click.on(Landing.PRODUCT), Click.on(Cart.ADD_PRODUCT));
        GenericUtils.waitSeconds(3);
        actor.attemptsTo(Switch.toAlert().andAccept());
      //  actor.attemptsTo(Click.on(Cart.GO_TO_CART));

    }
    public static AddToCart inPage() {
        return Tasks.instrumented(AddToCart.class);
    }
}
