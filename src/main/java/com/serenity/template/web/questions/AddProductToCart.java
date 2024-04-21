package com.serenity.template.web.questions;

import com.serenity.template.web.userinterfaces.InCart;
import com.serenity.template.web.utils.SerenitySession;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;


public class AddProductToCart implements Question<Boolean> {

    public static AddProductToCart validateInPage() {
        return new AddProductToCart();
    }

    @Subject("Validate the product in the cart")
    @Override
    public Boolean answeredBy(Actor actor) {
        return InCart.PRODUCT_TITLE.resolveFor(actor).getText().equals(SerenitySession.get("product"));
    }
}
