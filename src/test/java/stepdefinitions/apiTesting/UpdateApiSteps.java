package stepdefinitions.apiTesting;

import apiTesting.utils.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

public class UpdateApiSteps {

    private String endpoint;
    private Response response;

    @Given("the Update API endpoint is {string}")
    public void the_update_api_endpoint_is(String endpoint) {
        this.endpoint = endpoint;
        RestAssured.baseURI = "https://dummyapi.io/data/v1";
    }

    @When("I send a PUT request with valid title data")
    public void i_send_a_put_request_with_valid_title_data() {
        String requestBody = "{\"title\": \"mrs\"}";
        sendPutRequest(requestBody);
    }

    @When("I send a PUT request with invalid numeric title data")
    public void i_send_a_put_request_with_invalid_numeric_title_data() {
        String requestBody = "{\"title\": 123456}";
        sendPutRequest(requestBody);
    }

    @When("I send a PUT request with invalid short country data")
    public void i_send_a_put_request_with_invalid_short_country_data() {
        String requestBody = "{\n" +
                "  \"location\": {\n" +
                "    \"country\": \"j\"\n" +
                "  }\n" +
                "}";
        sendPutRequest(requestBody);
    }

    @When("I send a PUT request with invalid gender data")
    public void i_send_a_put_request_with_invalid_gender_data() {
        String requestBody = "{\"gender\": \"unknown\"}";
        sendPutRequest(requestBody);
    }

    @When("I send a PUT request with valid email data")
    public void i_send_a_put_request_with_valid_email_data() {
        String requestBody = "{\"email\": \"yasmin@gmail.com\"}";
        sendPutRequest(requestBody);
    }

    @Then("the update response status code should be {int}")
    public void the_update_response_status_code_should_be(int statusCode) {
        Assert.assertEquals(response.getStatusCode(), statusCode);
    }

    private void sendPutRequest(String requestBody) {
        response = RestAssured.given()
                .header("app-id", "662ba92ffc6498c14d22ae13")
                .contentType("application/json")
                .body(requestBody)
                .put(endpoint);

        HelperClass.setApiResponse(response);
    }
}
