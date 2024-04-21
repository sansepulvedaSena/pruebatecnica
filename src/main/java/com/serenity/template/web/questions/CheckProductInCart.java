package com.serenity.template.web.questions;

import com.serenity.template.web.userinterfaces.InCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;


public class CheckProductInCart implements Question<Boolean> {

    public static CheckProductInCart isNotVisible() {
        return new CheckProductInCart();
    }

    @Subject("Check if the product is not visible")
    @Override
    public Boolean answeredBy(Actor actor) {
        return !InCart.PRODUCT_TITLE.resolveFor(actor).isCurrentlyVisible();
    }
}