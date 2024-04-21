package com.serenity.template.web.questions;

import com.serenity.template.web.userinterfaces.Cart;
import com.serenity.template.web.utils.SerenitySession;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;


public class ValidateTotalInCart implements Question<Boolean> {


    public static ValidateTotalInCart inPage() {
        return new ValidateTotalInCart();
    }

    @Subject("I validate the sumatory of the values")
    @Override
    public Boolean answeredBy(Actor actor) {
        int total;
        total = Integer.parseInt(Cart.TOTAL_LBL.resolveFor(actor).getText());
    return SerenitySession.get("total").equals(total);
    }
}