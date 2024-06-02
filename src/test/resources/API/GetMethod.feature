@ApiTesting
Feature: Get Method API Testing for DummyApi.io

  Scenario: Get user without app-id header
    Given the Get API endpoint is "/user/60d0fe4f5311236168a109cf"
    When I send a GET request without app-id header
    Then the get response status code should be 403
    And the get response should contain "APP_ID_MISSING"

  Scenario: Get user with invalid app-id header
    Given the Get API endpoint is "/user/60d0fe4f5311236168a109cf"
    When I send a GET request with an invalid app-id header
    Then the get response status code should be 403
    And the get response should contain "APP_ID_NOT_EXIST"

  Scenario: Get user with valid app-id and registered id
    Given the Get API endpoint is "/user/60d0fe4f5311236168a109cf"
    When I send a GET request with a valid app-id header
    Then the get response status code should be 200

  Scenario: Get user with valid app-id and unregistered id
    Given the Get API endpoint is "/user/60d0fe4f5311236168a1dddd"
    When I send a GET request with a valid app-id header
    Then the get response status code should be 404
    And the get response should contain "RESOURCE_NOT_FOUND"

  Scenario: Get user with valid app-id and invalid format id
    Given the Get API endpoint is "/user/60d0fe4f53112invalid"
    When I send a GET request with a valid app-id header
    Then the get response status code should be 400
    And the get response should contain "PARAMS_NOT_VALID"
