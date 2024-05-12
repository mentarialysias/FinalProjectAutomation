Feature: Login to Swag Labs

  Background:
    Given User is on SwagLab Login page

  @Interface @TC01
  Scenario: verifikasi halaman login
    When User has opened swag labs browser
    Then There are fields for inputting username and password
    And There is a Login Button
    And There is a Swag Labs logo name

  @ValidCredentials
  Scenario: Login with valid credentials
    When User enters username as "standard_user" and password as "secret_sauce"
    Then User should be able to login successfully and new page open

  @InvalidCredentials
  Scenario Outline: Login with invalid credentials
    When User enters username as "<username>" and password as "<password>"
    Then User should be able to see a error message "<errorMessage>"

    Examples:
      | username 		| password  		| errorMessage        		    	| test case			|
      | standard_user   | secret12$$ 		| Invalid login, please try again   | wrong password	|


  @MissingUsername
  Scenario: Login with blank username
    When User enters username as "" and password as "secret_sauce"
    Then User should be able to see a error message "Epic sadface: Username is required"

  @MissingPassword
  Scenario: Login with blank password
    When User enters username as "standard_user" and password as ""
    Then User should be able to see a error message "Epic sadface: Password is required"

  @MissingUsernamePassword
  Scenario: Login with blank username and password
    When User enters username as "" and password as ""
    Then User should be able to see a error message "Epic sadface: Username is required"


