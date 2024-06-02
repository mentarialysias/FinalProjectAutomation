@ApiTesting
Feature: Delete Method API Testing for DummyApi.io

  Scenario: Delete user without app-id header
    Given the Delete API endpoint is "/user/60d0fe4f5311236168a109d6"
    When I send a DELETE request without app-id header
    Then the delete response status code should be 403
    And the delete response body should contain "APP_ID_MISSING"

  Scenario: Delete user with invalid app-id header
    Given the Delete API endpoint is "/user/60d0fe4f5311236168a109d6"
    When I send a DELETE request with invalid app-id header
    Then the delete response status code should be 403
    And the delete response body should contain "APP_ID_NOT_EXIST"

  Scenario: Delete user with valid app-id and registered id
    Given the Delete API endpoint is "/user/60d0fe4f5311236168a109d6"
    When I send a DELETE request with valid app-id and registered id
    Then the delete response status code should be 200

  Scenario: Delete user with valid app-id and deleted id
    Given the Delete API endpoint is "/user/60d0fe4f5311236168a109d6"
    When I send a DELETE request with valid app-id and deleted id
    Then the delete response status code should be 404
    And the delete response body should contain "RESOURCE_NOT_FOUND"

  Scenario: Delete user with valid app-id and unregistered id
    Given the Delete API endpoint is "/user/60d0fe4f5311236168a1dddd"
    When I send a DELETE request with valid app-id and unregistered id
    Then the delete response status code should be 404
    And the delete response body should contain "RESOURCE_NOT_FOUND"

  Scenario: Delete user with valid app-id and invalid format id
    Given the Delete API endpoint is "/user/60d0fe4f53112invalid"
    When I send a DELETE request with valid app-id and invalid format id
    Then the delete response status code should be 400
    And the delete response body should contain "PARAMS_NOT_VALID"
