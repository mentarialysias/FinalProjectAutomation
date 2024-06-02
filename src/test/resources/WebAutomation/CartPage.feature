Feature: Verification Cart Feature in Swag Labs
  Background:
    Given User has login to swag labs and navigate to dashboard page

  Scenario: Verification Cart Page when there is one item in the cart
    When User click on cart button
    Then User has navigated to cart page that there is one item
    And There is a continue shopping button and checkout button

  Scenario: Click on checkout button when there is one item
    Given User has clicked on cart button and navigated to cart page
    When User click on checkout button
    Then User has navigated to checkout information page
    And There is checkout information title
    And There is checkout info field

  Scenario: Click on continue shopping button when the cart has item
    Given User has clicked on cart button and navigated to cart page
    When User click on continue shopping button
    Then User has navigated to dashboard page