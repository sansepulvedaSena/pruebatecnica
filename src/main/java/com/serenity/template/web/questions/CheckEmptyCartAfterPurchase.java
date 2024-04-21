package com.serenity.template.web.questions;

import com.serenity.template.web.userinterfaces.Cart;
import com.serenity.template.web.userinterfaces.InCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;


public class CheckEmptyCartAfterPurchase implements Question<Boolean> {

    public static CheckEmptyCartAfterPurchase isNotVisible() {
        return new CheckEmptyCartAfterPurchase();
    }

    @Subject("I validate the empty cart")
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean isProductTitleNotVisible = !InCart.PRODUCT_TITLE.resolveFor(actor).isCurrentlyVisible();
        boolean isTotalLabelNotVisible = !Cart.TOTAL_LBL.resolveFor(actor).isCurrentlyVisible();
        return isProductTitleNotVisible && isTotalLabelNotVisible;
    }
}