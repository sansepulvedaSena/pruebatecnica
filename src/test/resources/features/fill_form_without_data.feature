Feature: Add a product to the cart
  As a QA tester
  I need to add a product into the cart
  To buy a product

  Scenario: Fill purchase form
    When I add product to cart
    And I send the purchase form without data
    Then I validate the alert