package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;

import actions.LoginPageActions;
import utils.HelperClass;
import actions.DashboardPageActions;

public class DetailProductPageSteps {

    LoginSteps loginSteps = new LoginSteps();

    @Given("User is on Detail Product Page of Sauce Labs Backpack")
    public void userIsOnDetailProductPage() throws InterruptedException {
        loginSteps.userIsOnSwagLabLoginPage();
        loginSteps.userHasOpenedSwagLab();
        loginSteps.enterUsernameAndPassword("standard_user","secret_sauce");
        loginSteps.userNavigateToDashboardPage();


        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User has on detail product page")
    public void user_has_on_detail_product_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("There is back to product button")
    public void there_is_back_to_product_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("There are name, picture, description, and price of the product")
    public void there_are_name_picture_description_and_price_of_the_product() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("There is Add to cart button")
    public void there_is_add_to_cart_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
