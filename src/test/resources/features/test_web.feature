Feature: Add a product to the cart
  As a QA tester
  I need to add a product into the cart
  To buy a product

  @TW1
  Scenario: Test web page with chrome
    When I add product to cart
    Then I validate the products in the cart