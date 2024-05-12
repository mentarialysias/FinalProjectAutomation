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
    Then User should be able to login successfully and new page open

  @InvalidCredentials @TC03
  Scenario Outline: Login with invalid credentials
    When User enters username as "<username>" and password as "<password>"
    Then User should be able to see a error message "<errorMessage>"

    Examples:
      | username      | password     | errorMessage                 | test case      |
      | standard_user | pasworduser1 | Error Password doesn't match | wrong password |


  @MissingPassword @TC04
  Scenario: Login with blank password
    When User enters username as "standard_user" and password as ""
    Then User should be able to see a error message "Error Mandatory Checking When Password Not Filled"

  @MissingUsername @TC06
  Scenario: Login with blank username
    When User enters username as "" and password as "secret_sauce"
    Then User should be able to see a error message "Error Mandatory Checking When Username Not Filled"

  @MissingUsernamePassword @TC10
  Scenario: Login with blank username and password
    When User enters username as "" and password as ""
    Then User should be able to see a error message "Error Mandatory Checking When Username & Password Not Filled"


