Feature: Add a product to the cart
  As a QA tester
  I need to add a product into the cart
  To buy a product

  @AddProduct
  Scenario: Test web page with chrome
    When I add product to cart
    Then I validate the products in the cart

  @DeleteProduct
  Scenario: Delete an Item from cart
    When I delete a product in the cart
    Then I validate the deleted product

  @FillForm
  Scenario: Fill purchase form
    When I add product to cart
    And I fill the purchase form
    Then I validate the confirmation modal

  @FillFormNoData
  Scenario: Fill purchase form without data
    When I add product to cart
    And I send the purchase form without data
    Then I validate the alert

  @EmptyCart
  Scenario: Validate empty cart
    When I add product to cart
    And I fill the purchase form
    And I go to the cart after the purchase
    Then I validate the empty cart

  @focus
  @ValueSumatory
  Scenario: Test web page with chrome
    When I add some products to cart
    Then I validate the sumatory of the values