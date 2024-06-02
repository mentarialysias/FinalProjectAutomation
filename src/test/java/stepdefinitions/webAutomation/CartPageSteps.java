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
    public void wasNavigatedToDashboardPage() {
        loginSteps.userIsOnSwagLabLoginPage();
        loginSteps.enterUsernameAndPassword("standard_user","secret_sauce");
        loginSteps.userNavigateToDashboardPage();
    }

    @Given("User has add item to cart")
    public void userHasAddingProductToCart() {
        objDashboardPage.addItemToCart("Sauce Labs Backpack");
    }

    @When("User click on cart button")
    public void clickCartButton() {
        objDashboardPage.clickOnCartButton();
    }

    @Then("User has navigated to cart page")
    public void navigateToCart() throws InterruptedException {
        Assert.assertTrue(objCartPage.getCartPage());
        Thread.sleep(2000);
    }
    @Then("There is added item")
    public void checkingfirstAddItem() {
        Assert.assertEquals(objCartPage.getItemName(), "Sauce Labs Backpack");
        Assert.assertEquals(objCartPage.getItemPrice(), "$29.99");
        Assert.assertEquals(objCartPage.getItemDesc(), "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.");
    }
    @Then("There is a continue shopping button")
    public void checkingContinueButton() {
        Assert.assertTrue(objCartPage.isCSButtonEnable());
    }

    @Then("There is checkout button")
    public void checkingCheckoutButton() {
        Assert.assertTrue(objCartPage.isCheckoutButtonEnable());
    }

    @Then("User has navigated to cart page that there is one item")
    public void navigateToCartPage() throws InterruptedException {;
        navigateToCart();
        checkingfirstAddItem();
    }
    @Then("There is a continue shopping button and checkout button")
    public void checkingButtonAtCartPage() {
       checkingCheckoutButton();
       checkingContinueButton();
    }

    @Then("User has navigated to dashboard page")
    public void user_has_navigated_to_dashboard_page() {
        loginSteps.userNavigateToDashboardPage();
    }

    @When("User click on continue shopping button")
    public void clickCSButton() {
        objCartPage.clickOnCSButton();
    }


}
