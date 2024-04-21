package com.serenity.template.web.stepdefinitions;

import com.serenity.template.web.questions.AddProductToCart;
import com.serenity.template.web.tasks.AddToCart;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TestWebStepDefinitions {

    @When("I add product to cart")
    public void test2() {
        OnStage.withCurrentActor(AddToCart.inPage());
    }

    //Was able to
    @Then("I validate the products in the cart")
    public void test3() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AddProductToCart.validateInPage()));
    }
}
