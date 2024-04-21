package com.serenity.template.web.stepdefinitions;


import com.serenity.template.web.questions.*;
import com.serenity.template.web.tasks.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;


public class TestWebStepDefinitions {

    @When("I add product to cart")
    public void addProductToCart() {
        OnStage.withCurrentActor(AddToCart.inPage());
    }
    @When("I delete a product in the cart")
    public void deleteProductInCart() {
        OnStage.withCurrentActor(DeleteFromCart.inPage());
    }
    @When("I add some products to cart")
    public void addSomeProductsToCart() {
        OnStage.withCurrentActor(AddSomeProductsToCart.inPage());}
    @And("I fill the purchase form")
    public void fillPurchaseForm() {
        OnStage.withCurrentActor(FillCartForm.inPage());
    }
    @And("I send the purchase form without data")
    public void purchaseFormWithNoData() {
        OnStage.withCurrentActor(SendFormWithoutData.inPage());
    }
    @And("I go to the cart after the purchase")
    public void goToCartAfterPurchase() {
        OnStage.withCurrentActor(GoToCartAfterPurchase.inPage());
    }
    @Then("I validate the products in the cart")
    public void validateProductInCart() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AddProductToCart.validateInPage()));
    }
    @Then("I validate the deleted product")
    public void validateDeletedProducts() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CheckProductInCart.isNotVisible()));
    }
    @Then("I validate the confirmation modal")
    public void validateConfirmationModal() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateModal.inPage()));
    }
    @Then("I validate the alert")
    public void validateEmptyFieldsAlert() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateAlertText.is("Please fill out Name and Creditcard.")));
    }
    @Then("I validate the empty cart")
    public void validateEmptyCart() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CheckEmptyCartAfterPurchase.isNotVisible()));
    }
    @Then("I validate the sumatory of the values")
    public void validateSumatoryOfValues() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateTotalInCart.inPage()));
    }






}
