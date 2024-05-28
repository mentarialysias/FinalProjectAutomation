package stepdefinitions;

import actions.CartPageActions;
import actions.CheckoutInfoPageActions;
import actions.HomePageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckoutSteps {

    HomePageActions objHomePage = new HomePageActions();
    CartPageActions objCartPage = new CartPageActions();

    CheckoutInfoPageActions objCheckoutInfoPage = new CheckoutInfoPageActions();
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

}
