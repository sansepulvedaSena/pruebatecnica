package com.serenity.template.web.interactions;

import com.serenity.template.web.userinterfaces.Cart;
import com.serenity.template.web.userinterfaces.Landing;
import com.serenity.template.web.utils.GenericUtils;
import com.serenity.template.web.utils.SerenitySession;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class ValuesSumatory implements Interaction {
    private int value = 0;

    @Override
    public <T extends Actor> void performAs(T actor) {
        GenericUtils.waitSeconds(4);
        for (int i = 0; i < 3; i++) {
            actor.attemptsTo(
                    Click.on(Landing.PRODUCT),
                    WaitUntil.the(Cart.PRODUCT_VALUE, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds());
            String valueText = Cart.PRODUCT_VALUE.resolveFor(actor).getText().replace("$", "").replace("*includes tax", "").replace(" ", "");
            actor.attemptsTo(Click.on(Cart.ADD_PRODUCT));
            GenericUtils.waitSeconds(1);
            actor.attemptsTo(
                    Switch.toAlert().andAccept(),
                    Click.on(Landing.HOME),
                    WaitUntil.the(Landing.PRODUCT, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds());
            value += Integer.parseInt(valueText);
        }
        SerenitySession.set("total", value);

    }

    public static ValuesSumatory inPage() {
        return Tasks.instrumented(ValuesSumatory.class);
    }
}
