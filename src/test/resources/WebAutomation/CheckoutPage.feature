Feature: Verification Checkout Feature in Swag Labs
  Background:
    Given User has added item to cart
    And User has clicked on cart button and navigated to cart page

  Scenario: Verification checkout information page when there is item in the cart
    When User click on checkout button
    Then User has navigated to checkout information page
    And There is checkout information title
    And There is checkout info field

  Scenario: Verification checkout overview page with filling in all checkout field with valid data
    When User click on checkout button
    And User fills in checkout info field with valid data
    And User click on continue button
    Then User has navigated to checkout overview page
    And There are card data item with their quantity
    And There are information payment, shipping and price
    And There is cancel and finish button

  Scenario: Verification checkout complete page when there is item in cart
    And User click on checkout button
    And User fills in checkout info field with valid data
    When User click on continue button
    And User click on finish button
    Then User has navigated to checkout complete page
    And There is title order completed
    And There is back home button





