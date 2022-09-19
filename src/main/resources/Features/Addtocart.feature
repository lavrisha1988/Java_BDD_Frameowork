Feature: user adds items to cart
  Scenario: user add a seafood pizza to cart
    Given user is on the shop page
    And   user selects the pizza menu and selects seafood option
    Then  user checkouts
