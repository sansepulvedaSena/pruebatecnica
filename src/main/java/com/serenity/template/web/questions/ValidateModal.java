package com.serenity.template.web.questions;

import com.serenity.template.web.userinterfaces.OrderForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;


public class ValidateModal implements Question<Boolean> {

    public static ValidateModal inPage() {
        return new ValidateModal();
    }

    @Subject("I validate the confirmation modal")
    @Override
    public Boolean answeredBy(Actor actor) {
        return OrderForm.CONFIRMATION_MODAL.resolveFor(actor).isCurrentlyVisible();
    }
}