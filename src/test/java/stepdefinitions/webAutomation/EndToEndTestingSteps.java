package stepdefinitions.webAutomation;

import io.cucumber.java.en.*;
import org.checkerframework.checker.units.qual.C;

public class EndToEndTestingSteps {

    LoginSteps loginSteps = new LoginSteps();
    DashboardPageSteps dashboardPageSteps = new DashboardPageSteps();
    CartPageSteps cartPageSteps = new CartPageSteps();
    CheckoutSteps checkoutSteps = new CheckoutSteps();
    MenuPageSteps menuPageSteps = new MenuPageSteps();
    @When("User open the swag labs browser")
    public void openTheSwagLabs() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User verification the login page")
    public void verificationLoginPage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User enter valid username and password")
    public void enterUsernameAndPassword() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User navigating to dashboard page")
    public void navigatedToDashboardPage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User has on dashboard page")
    public void hasOnDashboardPaga() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks the Add to Cart button for the {string}")
    public void AddProductToCart(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("There is {int} number of the cart icon")
    public void checkingCartIconsNumber(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User has add one item to cart and cart icon showing {int}")
    public void hasAddedOneItemToCart(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User click cart icon")
    public void clickCartIcon() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user is navigated to the cart page which contains one product that has been added")
    public void navigateToCartPageWhichContainOneItem() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User has been navigated to the cart page, which contains one product")
    public void hasNavigateToCartPageWhichContainOneItem() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User click continue shopping button")
    public void clickContinueShoppingButton() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user navigate to dashboard page and adding four other product")
    public void navigateToDashboardAndAddingOtherItem() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The number of Icon cart change to {int}")
    public void checkTheCartIconNumbersAfterAddOtherItems(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User has add four other product and the cart number was {int}")
    public void hasAddingOtherItemAndCartNumberIs5(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User checking the cart list and clicks on checkout button")
    public void user_checking_the_cart_list_and_clicks_on_checkout_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The user is navigated to the checkout page")
    public void the_user_is_navigated_to_the_checkout_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("there is a field to enter checkout information")
    public void there_is_a_field_to_enter_checkout_information() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User has on checkout page")
    public void user_has_on_checkout_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User fill the checkout information and click continue button")
    public void user_fill_the_checkout_information_and_click_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User navigate to checkout overview page and click finish button")
    public void user_navigate_to_checkout_overview_page_and_click_finish_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User is navigated to checkout complete")
    public void user_is_navigated_to_checkout_complete() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User has been navigated to the checkout compelete page")
    public void user_has_been_navigated_to_the_checkout_compelete_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User click Back home button")
    public void user_click_back_home_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user logs out of the application")
    public void user_logs_out_of_the_application() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user has been navigate to SwagLab Login page")
    public void user_has_been_navigate_to_swag_lab_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
