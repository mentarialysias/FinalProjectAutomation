Feature: Login to Swag Labs

  Background:
    Given User is on SwagLab Login page

  @PageVerification @TC01
  Scenario: verifikasi halaman login
    When User has opened swag labs browser
    Then There are fields for inputting username and password
    And There is a Login Button
    And There is a Swag Labs logo name

  @ValidCredentials @TC02
  Scenario: Login with valid credentials
    When User enters username as "standard_user" and password as "secret_sauce"
    Then User should be able to login successfully and navigated to dashboard page

  @RegisteredUsernameWithUnregisteredPassword @TC03
  Scenario: Login with registered username but the password is unregistred
    When User enters username as "standard_user" and password as "pasworduser1"
    Then User should be able to see a error message "Error Password doesn't match"

  @RegisteredUsernameWithMissingPassword @TC04
  Scenario: Login with registered username but the password is blank
    When User enters username as "standard_user" and password as ""
    Then User should be able to see a error message "Error Mandatory Checking When Password Not Filled"

  @UnregisteredUsernameWithRegisteredPassword @TC05
  Scenario: Login with unregistered username and password is registered
    When User enters username as "standard_user123" and password as "secret_sauce"
    Then User should be able to see a error message "Error Username doesn't match"

  @BlankUsernameWithRegisteredPassword @TC06
  Scenario: Login with blank username and password is registered
    When User enters username as "" and password as "secret_sauce"
    Then User should be able to see a error message "Error Mandatory Checking When Username Not Filled"

  @UnregisteredUsernameAndPassword @TC07
  Scenario: Login with unregistered username and password
    When User enters username as "standard_user123" and password as "secret_sauce123"
    Then User should be able to see a error message "Error Username doesn't match"

  @MissingUsernamePassword @TC10
  Scenario: Login with blank username and password
    When User enters username as "" and password as ""
    Then User should be able to see a error message "Error Mandatory Checking When Username & Password Not Filled"


