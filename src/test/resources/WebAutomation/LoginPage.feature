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

  @InvalidCredentials @TC03_to_TC10
    Scenario Outline: Login with invalid credentials
      When User enters username as "<username>" and password as "<password>"
      Then User should be able to see a error message "<error_message>"

      Examples:
        | test_case | test_case_name                                                 | username         | password        | error_message                                                |
        | TC03      | Login with registered username but the password is unregistred | standard_user    | secret_sauce123 | Error Password doesn't match                                 |
        | TC04      | Login with registered username but the password is blank       | standard_user    |                 | Error Mandatory Checking When Password Not Filled            |
        | TC05      | Login with unregistered username and registered password       | standard_user123 | secret_sauce    | Error Username doesn't match                                 |
        | TC06      | Login with blank username and registered password              |                  | secret_sauce    | Error Mandatory Checking When Username Not Filled            |
        | TC07      | Login with unregistered username and password                  | standard_user123 | secret_sauce123 | Error Username doesn't match                                 |
        | TC08      | Login with unregistered username and blank password            | standard_user123 |                 | Error Mandatory Checking When Password Not Filled            |
        | TC09      | Login with blank username and unregistered password            |                  | secret_sauce123 | Error Mandatory Checking When Username Not Filled            |
        | TC10      | Login with blank username and password                         |                  |                 | Error Mandatory Checking When Username & Password Not Filled |

