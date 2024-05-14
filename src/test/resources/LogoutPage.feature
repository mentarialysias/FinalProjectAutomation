Feature: Logout from Swag Labs Application

  @LogoutFromApplication @TC01
  Scenario: User Logout from The Application
    Given User is on SwagLab Login page
    And User enters username as "standard_user" and password as "secret_sauce"
    And User login successfully and navigated to dashboard page
    When User clicks on side bar menu
    And User clicks on logout button
    Then User should be able to logout from the web application and display the login page