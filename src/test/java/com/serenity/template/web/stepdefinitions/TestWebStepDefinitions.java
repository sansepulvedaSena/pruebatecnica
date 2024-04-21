package com.serenity.template.web.stepdefinitions;

import com.serenity.template.web.questions.AddProductToCart;
import com.serenity.template.web.questions.CheckProductInCart;
import com.serenity.template.web.questions.ValidateModal;
import com.serenity.template.web.tasks.AddToCart;
import com.serenity.template.web.tasks.DeleteFromCart;
import com.serenity.template.web.tasks.FillCartForm;
import com.serenity.template.web.tasks.SendFormWithoutData;
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
    //    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateModal.inPage()));
    }

}
