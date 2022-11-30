Feature: Checkout

  @Checkout
  Scenario: As a User, I want to checkout Sauce Lab Back Packs with blue color and quantity is 2
    Given User is already on Sauce Labs Apps
    When User choose product
    And User choose color
    And User input quantity
    And User go to my cart page to proceed to checkout
    And User login with correct credentials
    And User fill the shipping address
    And User fill the payment method
    And User place an order
    Then User successfully checkout the goods


