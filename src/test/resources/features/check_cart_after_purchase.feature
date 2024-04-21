Feature: Add a product to the cart
  As a QA tester
  I need to add a product into the cart
  To buy a product

  Scenario: Fill purchase form
    When I add product to cart
    And I fill the purchase form
    And I go to the cart after the purchase
    Then I validate the empty cart