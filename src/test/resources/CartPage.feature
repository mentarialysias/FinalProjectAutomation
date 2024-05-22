Feature: Verification Cart Feature in Swag Labs
  Background:
    Given User has login to swag labs and navigate to dashboard page
    And User has add item to cart

  Scenario: Verification Cart Page when there is one item in the cart
    When User click on cart button
    Then User has navigated to cart page that there is one item
    And There is a continue shopping button and checkout button

  Scenario: Click on checkout button when there is one item
    And User has clicked on cart button and navigated to cart page
    When User click on checkout button
    Then User has navigated to checkout information
    And There is checkout information title
    And There is field firstname, lastname, zipcode