@WebAutomation
Feature: Menu Feature from Swag Labs Application
  Background:
   Given User login successfully and navigated to dashboard page


  @LogoutFromApplication @TC01
  Scenario: User Logout from The Application
    When User clicks on side bar menu
    And User clicks on logout button
    Then User should be able to logout from the web application and display the login page

  @ResetAppState
  Scenario: Reset Application State
    When User clicks the Add to cart button in "Sauce Labs Backpack" item on the dashboard
    And User clicks on side bar menu
    And User clicks on reset app state button
    Then The cart icon not showing any number of items
    And Remove button in product which selected should change to Add to Cart


    @AboutPage
    Scenario: User Navigate to About Page
      When User clicks on side bar menu
      And User clicks on about button
      Then User should be able to navigate to the about page
