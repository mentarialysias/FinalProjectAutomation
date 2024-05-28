Feature: Logout from Swag Labs Application

  @LogoutFromApplication @TC01
  Scenario: User Logout from The Application
    Given user sudah berada di dashboard
    When User clicks on side bar menu
    And User clicks on logout button
    Then User should be able to logout from the web application and display the login page
