@WebAutomation
Feature: End to End Testing

  @EndToEndTesting @LoginUntilLogoutAfterCheckoutTheItems
  Scenario: User login checkout more than one product successfully
    Given User is on SwagLab Login page
    When User open the swag labs browser
    And User verification the login page
    And User enter valid username and password
    And User navigating to dashboard page
    And User clicks the Add to Cart button for the "Sauce Labs Backpack"
    And There is 1 number of the cart icon
    And User click cart icon
    And user is navigated to the cart page which contains one product that has been added
    And User click continue shopping button
    And user navigate to dashboard page and adding four other product
    And The number of Icon cart change to 5
    And User click cart button and clicks on checkout button
    And The user is navigated to the checkout information page
    And User fill the checkout information and click continue button
    And User navigate to checkout overview page and click finish button
    And User is navigated to checkout complete
    And user logs out of the application
    Then user has been navigate to SwagLab Login page



