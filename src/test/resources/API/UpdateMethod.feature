@ApiTesting
Feature: Update Method API Testing for DummyApi.io

  Scenario: Update user title with valid data
    Given the Update API endpoint is "/user/60d0fe4f5311236168a109ca"
    When I send a PUT request with valid title data
    Then the update response status code should be 200

  Scenario: Update user title with invalid numeric data
    Given the Update API endpoint is "/user/60d0fe4f5311236168a109ca"
    When I send a PUT request with invalid numeric title data
    Then the update response status code should be 400

  Scenario: Update user country with invalid short data
    Given the Update API endpoint is "/user/60d0fe4f5311236168a109ca"
    When I send a PUT request with invalid short country data
    Then the update response status code should be 400

  Scenario: Update user gender with invalid data
    Given the Update API endpoint is "/user/60d0fe4f5311236168a109ca"
    When I send a PUT request with invalid gender data
    Then the update response status code should be 400

  Scenario: Update user email with valid data
    Given the Update API endpoint is "/user/60d0fe4f5311236168a109ca"
    When I send a PUT request with valid email data
    Then the update response status code should be 400
