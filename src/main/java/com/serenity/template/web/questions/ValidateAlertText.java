package com.serenity.template.web.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.annotations.Subject;
import org.openqa.selenium.Alert;


public class ValidateAlertText implements Question<Boolean> {

    private String expectedText;

    public ValidateAlertText(String expectedText) {
        this.expectedText = expectedText;
    }

    public static ValidateAlertText is(String expectedText) {
        return new ValidateAlertText(expectedText);
    }

    @Subject("Validate alert text")
    @Override
    public Boolean answeredBy(Actor actor) {
        Alert alert = BrowseTheWeb.as(actor).getDriver().switchTo().alert();
        return alert.getText().equals(expectedText);
    }
}