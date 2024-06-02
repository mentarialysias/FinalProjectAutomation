package stepdefinitions.apiTesting;


import apiTesting.utils.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

public class DeleteApiSteps {

    private String endpoint;
    private Response response;
    private String validAppId = "6631d707a8ec0d1267edb985";
    private String invalidAppId = "666232334appidinvallid2e23";

    @Given("the Delete API endpoint is {string}")
    public void the_delete_api_endpoint_is(String endpoint) {
        this.endpoint = endpoint;
        RestAssured.baseURI = "https://dummyapi.io/data/v1";
    }

    @When("I send a DELETE request without app-id header")
    public void i_send_a_delete_request_without_app_id_header() {
        response = RestAssured.given()
                .delete(endpoint);
        HelperClass.setApiResponse(response);
    }

    @When("I send a DELETE request with invalid app-id header")
    public void i_send_a_delete_request_with_invalid_app_id_header() {
        response = RestAssured.given()
                .header("app-id", invalidAppId)
                .delete(endpoint);
        HelperClass.setApiResponse(response);
    }

    @When("I send a DELETE request with valid app-id and registered id")
    public void i_send_a_delete_request_with_valid_app_id_and_registered_id() {
        response = RestAssured.given()
                .header("app-id", validAppId)
                .delete(endpoint);
        HelperClass.setApiResponse(response);
    }

    @When("I send a DELETE request with valid app-id and deleted id")
    public void i_send_a_delete_request_with_valid_app_id_and_deleted_id() {
        // Assuming the user with userIdToDelete has been deleted previously
        response = RestAssured.given()
                .header("app-id", validAppId)
                .delete(endpoint);
        HelperClass.setApiResponse(response);
    }

    @When("I send a DELETE request with valid app-id and unregistered id")
    public void i_send_a_delete_request_with_valid_app_id_and_unregistered_id() {
        String unregisteredUserId = "60d0fe4f5311236168a1dddd";
        response = RestAssured.given()
                .header("app-id", validAppId)
                .delete(endpoint);
        HelperClass.setApiResponse(response);
    }

    @When("I send a DELETE request with valid app-id and invalid format id")
    public void i_send_a_delete_request_with_valid_app_id_and_invalid_format_id() {
        response = RestAssured.given()
                .header("app-id", validAppId)
                .delete(endpoint);

        HelperClass.setApiResponse(response);
    }

    @Then("the delete response status code should be {int}")
    public void the_delete_response_status_code_should_be(int statusCode) {
        Assert.assertEquals(response.getStatusCode(), statusCode);
    }

    @Then("the delete response body should contain {string}")
    public void the_delete_response_should_contain(String expectedMessage) {
        Assert.assertTrue(response.getBody().asString().contains(expectedMessage));
    }
}
