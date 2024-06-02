package stepdefinitions.apiTesting;

import apiTesting.utils.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

public class GetApiSteps {
    private String endpoint;
    private Response response;
    private String validAppId = "6631d707a8ec0d1267edb985";
    private String invalidAppId = "666232334appidinvallid2e23";

    @Given("the Get API endpoint is {string}")
    public void the_get_api_endpoint_is(String endpoint) {
        this.endpoint = endpoint;
        RestAssured.baseURI = "https://dummyapi.io/data/v1";
    }

    @When("I send a GET request without app-id header")
    public void i_send_a_get_request_without_app_id_header() {
        response = RestAssured.given().get(endpoint);
        HelperClass.setApiResponse(response);
    }

    @When("I send a GET request with an invalid app-id header")
    public void i_send_a_get_request_with_an_invalid_app_id_header() {
        response = RestAssured.given().header("app-id", invalidAppId).get(endpoint);
        HelperClass.setApiResponse(response);
    }

    @When("I send a GET request with a valid app-id header")
    public void i_send_a_get_request_with_a_valid_app_id_header() {
        response = RestAssured.given().header("app-id", validAppId).get(endpoint);
        HelperClass.setApiResponse(response);
    }

    @Then("the get response status code should be {int}")
    public void the_get_response_status_code_should_be(int statusCode) {
        Assert.assertEquals(response.getStatusCode(), statusCode);
    }

    @Then("the get response should contain {string}")
    public void the_response_should_contain(String expectedMessage) {
        Assert.assertTrue(response.getBody().asString().contains(expectedMessage));
    }
}
