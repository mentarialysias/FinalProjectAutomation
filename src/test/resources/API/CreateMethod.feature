@ApiTesting
Feature: Create Method API Testing for DummyApi.io

  Scenario: Create user with all fields filled
    Given the Create API endpoint is "/user/create"
    And the request body is a valid user with all fields filled
    When I send a POST request with a valid app-id header
    Then the create response status code should be 200

  Scenario: Create user without mandatory fields
    Given the Create API endpoint is "/user/create"
    And the request body is a user without mandatory fields
    When I send a POST request with a valid app-id header
    Then the create response status code should be 400

  Scenario: Create user with incorrect date format
    Given the Create API endpoint is "/user/create"
    And the request body is a user with an incorrect date format
    When I send a POST request with a valid app-id header
    Then the create response status code should be 400

  Scenario: Create user with incorrect last name format
    Given the Create API endpoint is "/user/create"
    And the request body is a user with an incorrect last name format
    When I send a POST request with a valid app-id header
    Then the create response status code should be 400

  Scenario: Create user with invalid input
    Given the Create API endpoint is "/user/create"
    And the request body is a user with invalid input
    When I send a POST request with a valid app-id header
    Then the create response status code should be 400
