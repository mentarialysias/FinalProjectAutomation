package stepdefinitions.apiTesting;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import apiTesting.utils.HelperClass;

public class CreateApiSteps {

    private Hooks hooks = new Hooks();

    private String endpoint;
    private Response response;
    private String validAppId = "662715126cae0331efdee794";
    private String requestBody;

    @Given("the Create API endpoint is {string}")
    public void the_create_api_endpoint_is(String endpoint) {
        this.endpoint = endpoint;
        RestAssured.baseURI = "https://dummyapi.io/data/v1";
    }

    @Given("the request body is a valid user with all fields filled")
    public void the_request_body_is_a_valid_user_with_all_fields_filled() {
        requestBody = "{" +
                "\"title\": \"ms\"," +
                "\"firstName\": \"Mentari\"," +
                "\"lastName\": \"Ayu\"," +
                "\"gender\": \"female\"," +
                "\"email\": \"mentari.ayhhhhhhhhhhhuualysiaa11@example.com\"," +
                "\"dateOfBirth\": \"2001-04-26\"," +
                "\"phone\": \"098218240182\"," +
                "\"picture\": \"https://example.com/picture.jpg\"," +
                "\"location\": {" +
                "\"street\": \"321 Carik\"," +
                "\"city\": \"Bandung\"," +
                "\"state\": \"West Java\"," +
                "\"country\": \"ID\"," +
                "\"timezone\": \"+7:00\"" +
                "}" +
                "}";
    }

    @Given("the request body is a user without mandatory fields")
    public void the_request_body_is_a_user_without_mandatory_fields() {
        requestBody = "{" +
                "\"title\": \"ms\"," +
                "\"firstName\": \"\"," +
                "\"lastName\": \"\"," +
                "\"gender\": \"female\"," +
                "\"email\": \"\"," +
                "\"dateOfBirth\": \"2001-04-26\"," +
                "\"phone\": \"098218240182\"," +
                "\"picture\": \"https://example.com/picture.jpg\"," +
                "\"location\": {" +
                "\"street\": \"321 Carik\"," +
                "\"city\": \"Bandung\"," +
                "\"state\": \"West Java\"," +
                "\"country\": \"ID\"," +
                "\"timezone\": \"+7:00\"" +
                "}" +
                "}";
    }

    @Given("the request body is a user with an incorrect date format")
    public void the_request_body_is_a_user_with_an_incorrect_date_format() {
        requestBody = "{" +
                "\"title\": \"ms\"," +
                "\"firstName\": \"Mentari\"," +
                "\"lastName\": \"Ayu\"," +
                "\"gender\": \"female\"," +
                "\"email\": \"mentari12@example.com\"," +
                "\"dateOfBirth\": \"04-26-2001\"," +
                "\"phone\": \"098218240182\"," +
                "\"picture\": \"https://example.com/picture.jpg\"," +
                "\"location\": {" +
                "\"street\": \"321 Carik\"," +
                "\"city\": \"Bandung\"," +
                "\"state\": \"West Java\"," +
                "\"country\": \"ID\"," +
                "\"timezone\": \"+7:00\"" +
                "}" +
                "}";
    }

    @Given("the request body is a user with an incorrect last name format")
    public void the_request_body_is_a_user_with_an_incorrect_last_name_format() {
        requestBody = "{" +
                "\"title\": \"ms\"," +
                "\"firstName\": \"Mentari\"," +
                "\"lastName\": 471," +
                "\"gender\": \"female\"," +
                "\"email\": \"me.ayu@example.com\"," +
                "\"dateOfBirth\": \"2001-04-26\"," +
                "\"phone\": \"098218240182\"," +
                "\"picture\": \"https://example.com/picture.jpg\"," +
                "\"location\": {" +
                "\"street\": \"321 Carik\"," +
                "\"city\": \"Bandung\"," +
                "\"state\": \"West Java\"," +
                "\"country\": \"ID\"," +
                "\"timezone\": \"+7:00\"" +
                "}" +
                "}";
    }

    @Given("the request body is a user with invalid input")
    public void the_request_body_is_a_user_with_invalid_input() {
        requestBody = "{" +
                "\"title\": \"sus\"," +
                "\"firstName\": \"MentariMentariMentariMentariMentariMentariMentariMentariMentari\"," +
                "\"lastName\": \"AyuAlysiaAyuAlysiaAyuAlysiaAyuAlysiaAyuAlysiaAyuAlysia\"," +
                "\"gender\": \"banteng\"," +
                "\"email\": \"mentariexample.com\"," +
                "\"dateOfBirth\": \"20010426\"," +
                "\"phone\": \"0982xxxxxxxxxxxxxx18240182\"," +
                "\"picture\": \"https://example.com/picture\"," +
                "\"location\": {" +
                "\"street\": \"Cari Cari Cari Cari Cari Cari Cari Cari Cari Cari Cari Cari Cari Cari Cari Cari Cari Cari Cari Ca\"," +
                "\"city\": \"Bandung Bandung Bandung Bandung Bandung \"," +
                "\"state\": \"West Java West Java West Java West Java West Java \"," +
                "\"country\": \"Indonesia Indonesia Indonesia Indonesia \"," +
                "\"timezone\": \"+70:00\"" +
                "}" +
                "}";
    }

    @When("I send a POST request with a valid app-id header")
    public void i_send_a_post_request_with_a_valid_app_id_header() {
        response = RestAssured.given()
                .header("app-id", validAppId)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post(endpoint);
        HelperClass.setApiResponse(response);
    }

    @Then("the create response status code should be {int}")
    public void the_create_response_status_code_should_be(int statusCode) {
        Assert.assertEquals(response.getStatusCode(), statusCode);

    }

}
