package com.serenity.template.web.stepdefinitions;

import com.serenity.template.web.questions.*;
import com.serenity.template.web.tasks.*;
import io.cucumber.java.en.And;
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

    @When("I delete a product in the cart")
    public void test4() {
        OnStage.withCurrentActor(DeleteFromCart.inPage());
    }

    @Then("I validate the deleted product")
    public void test5() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CheckProductInCart.isNotVisible()));
    }

    @And("I fill the purchase form")
    public void test6() {
        OnStage.withCurrentActor(FillCartForm.inPage());
    }

    @Then("I validate the confirmation modal")
    public void test7() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateModal.inPage()));
    }

    @And("I send the purchase form without data")
    public void test8() {
        OnStage.withCurrentActor(SendFormWithoutData.inPage());
    }

    @Then("I validate the alert")
    public void test9() {
    }

    @And("I go to the cart after the purchase")
    public void test10() {
        OnStage.withCurrentActor(GoToCartAfterPurchase.inPage());
    }

    @Then("I validate the empty cart")
    public void test11() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CheckEmptyCartAfterPurchase.isNotVisible()));
    }
    @When("I add some products to cart")
    public void test12() {
        OnStage.withCurrentActor(AddSomeProductsToCart.inPage());
    }


}
