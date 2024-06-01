package stepdefinitions.webAutomation;

import webAutomation.actions.CartPageActions;
import webAutomation.actions.DashboardPageActions;
import webAutomation.actions.LoginPageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CartPageSteps {

    LoginPageActions objLogin = new LoginPageActions();
    DashboardPageActions objDashboardPage = new DashboardPageActions();
    CartPageActions objCartPage = new CartPageActions();
    LoginSteps loginSteps = new LoginSteps();
    CheckoutSteps checkoutSteps = new CheckoutSteps();

    @Then("User has login to swag labs and navigate to dashboard page")
    public void user_has_login_to_swag_labs_and_navigated_to_dashboard_page() {
        loginSteps.userIsOnSwagLabLoginPage();
        loginSteps.enterUsernameAndPassword("standard_user","secret_sauce");
        loginSteps.userNavigateToDashboardPage();
    }

    @Given("User has add item to cart")
    public void user_has_add_item_to_cart() {
        objDashboardPage.addItemToCart();
    }

//    @Then("User should be able to see a error message {string}")
//    public void user_should_be_able_to_see_a_error_message(String errorMessage) {
//        System.out.println(objLogin.getErrorMessage());
//        Assert.assertEquals(errorMessage, objLogin.getErrorMessage());
//    }
    @When("User click on cart button")
    public void user_click_on_cart_button() {
        objDashboardPage.clickOnCartButton();
    }

    @Then("User has navigated to cart page")
    public void user_has_navigated_to_cart_page() throws InterruptedException {
        Assert.assertTrue(objCartPage.getCartPage());
        Thread.sleep(2000);
    }
    @Then("There is added item")
    public void there_is_added_item() {
        Assert.assertEquals(objCartPage.getItemName(), "Sauce Labs Backpack");
        Assert.assertEquals(objCartPage.getItemPrice(), "$29.99");
        Assert.assertEquals(objCartPage.getItemDesc(), "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.");
    }
    @Then("There is a continue shopping button")
    public void there_is_a_continue_shopping_button() {
        Assert.assertTrue(objCartPage.isCSButtonEnable());
    }

    @Then("There is checkout button")
    public void there_is_checkout_button() {
        Assert.assertTrue(objCartPage.isCheckoutButtonEnable());
    }

    @Then("User has navigated to cart page that there is one item")
    public void user_has_navigated_to_cart_page_that_there_is_one_item() throws InterruptedException {;
        user_has_navigated_to_cart_page();
        there_is_added_item();
    }
    @Then("There is a continue shopping button and checkout button")
    public void there_is_a_continue_shopping_button_and_checkout_button() {
        there_is_checkout_button();
        there_is_a_continue_shopping_button();
    }

    @Then("User has navigated to dashboard page")
    public void user_has_navigated_to_dashboard_page() {
        loginSteps.userNavigateToDashboardPage();
    }



}
