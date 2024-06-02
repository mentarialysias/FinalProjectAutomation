@WebAutomation
Feature: Check Detail Product Page

  Background:
    Given User is on Detail Product Page of Sauce Labs Backpack

  @PageVerification @TC01
  Scenario: Detail Product Page Varification
    When User has on detail product page
    Then There is back to product button
    And there is the name, image, description and price of the Sauce Labs Backpack product
    And There is Add to cart button


  @AddToCartButton @TC
  Scenario: Check Add to cart button
    When User has on detail product page
    And User click Add to cart button
    Then Add to cart button change to Remove button

  @BackToProductButton @TC
  Scenario: Check Back to Product button
    When User has on detail product page
    And User click Back to product button
    Then User navigate to dashboard page

