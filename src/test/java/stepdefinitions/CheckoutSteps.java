package stepdefinitions;

import actions.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckoutSteps {

    DashboardPageActions objHomePage = new DashboardPageActions();
    CartPageActions objCartPage = new CartPageActions();
    CheckoutInfoPageActions ObjCheckoutInfoPage = new CheckoutInfoPageActions();
    CheckoutOvwPageActions objCheckoutOvwPage = new CheckoutOvwPageActions();
    LoginSteps loginSteps = new LoginSteps();
    CheckoutInfoPageActions objCheckoutInfoPage = new CheckoutInfoPageActions();
    CheckoutCompletePageActions objcheckoutCompletePage = new CheckoutCompletePageActions();

    @Given("User has clicked on cart button and navigated to cart page")
    public void user_has_clicked_on_cart_button_and_navigated_to_cart_page() throws InterruptedException {
        objHomePage.clickOnCartButton();
        Assert.assertTrue(objCartPage.getCartPage());
        Thread.sleep(2000);
    }

    @When("User click on checkout button")
    public void user_click_on_checkout_button() {
        objCartPage.clickOnCheckoutButton();
    }

    @When("User click on continue shopping button")
    public void user_click_on_continue_shopping_button() {
        objCartPage.clickOnCSButton();
    }

    @Then("User has navigated to checkout information page")
    public void user_has_navigated_to_checkout_information_page() throws InterruptedException {
        Assert.assertTrue(objCheckoutInfoPage.getCheckoutInfoPage());
        Thread.sleep(2000);
    }
    @Then("There is checkout information title")
    public void there_is_checkout_information_title() {
        Assert.assertEquals(objCheckoutInfoPage.getTitlePage(),"Checkout: Your Information");
    }
    @Then("There is checkout info field")
    public void there_is_checkout_info_field() {
        Assert.assertTrue(objCheckoutInfoPage.getCheckoutInfoField());
    }

    @Given("User has added item to cart")
    public void user_has_added_item_to_cart() {
        loginSteps.user_is_on_swag_lab_login_page();
        loginSteps.user_enters_username_as_and_password_as("standard_user","secret_sauce");
        loginSteps.user_should_be_able_to_login_successfully_and_navigated_to_dashboard_page();
        objHomePage.addItemToCart();
    }

    @When("User fills in checkout info field with valid data")
    public void user_fills_in_checkout_info_field_with_valid_data() {
        objCheckoutInfoPage.fillsInCheckoutInfoField("yasmin", "azizah", "40291" );
    }

    @When("User click on continue button")
    public void user_click_on_continue_button() {
        objCheckoutInfoPage.clickOnContinueButton();
    }

    @Then("User has navigated to checkout overview page")
    public void user_has_navigated_to_checkout_overview_page() throws InterruptedException {
        Assert.assertTrue(objCheckoutInfoPage.getCheckoutInfoPage());
        Thread.sleep(2000);
    }
    @Then("There are card data item with their quantity")
    public void there_are_card_data_item_with_their_quantity() {
        Assert.assertEquals(objCheckoutOvwPage.getItemName(), "Sauce Labs Backpack");
        Assert.assertEquals(objCheckoutOvwPage.getItemQuantity(), "1");
    }
    @Then("There are information payment, shipping and price")
    public void there_are_information_payment_shipping_and_price() {
        objCheckoutOvwPage.isPaymentInformationCorrect();
        objCheckoutOvwPage.isShippingInformationCorrect();
        objCheckoutOvwPage.isPriceCalculationCorrect();
    }
    @Then("There is cancel and finish button")
    public void there_is_cancel_and_finish_button() {
        objCheckoutOvwPage.isCancelButtonEnable();
        objCheckoutOvwPage.isFinishButtonEnable();
    }

    @Then ("User has navigated to checkout complete page")
    public void user_has_navigated_to_checkout_complete_page(){

    }

    @Then ("There is title order completed")
    public boolean there_is_title_order_completed(){
        return objcheckoutCompletePage.isTitleOrderCompletedDisplayed();
    }

    @Then ("There is back home button")
    public boolean there_is_back_home_button(){
        return objcheckoutCompletePage.isBackHomeButtonEnabled();
    }
}
