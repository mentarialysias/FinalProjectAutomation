package stepdefinitions.webAutomation;

import webAutomation.actions.CartPageActions;
import webAutomation.actions.CheckoutInfoPageActions;
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
    CheckoutInfoPageActions objcheckoutInfoPageActions = new CheckoutInfoPageActions();

    @Then("User has login to swag labs and navigate to dashboard page")
    public void wasNavigatedToDashboardPage() throws InterruptedException {
        loginSteps.userIsOnSwagLabLoginPage();
        loginSteps.enterUsernameAndPassword("standard_user","secret_sauce");
        loginSteps.userNavigateToDashboardPage();
        Thread.sleep(2000);
    }

    @Given("User has add item to cart")
    public void userHasAddingProductToCart() throws InterruptedException {
        objDashboardPage.addItemToCart("Sauce Labs Backpack");
        Thread.sleep(2000);
    }

    @When("User click on cart button")
    public void clickCartButton() throws InterruptedException {
        objDashboardPage.clickOnCartButton();
        Thread.sleep(2000);
    }

    @Then("User has navigated to cart page")
    public void navigateToCart() throws InterruptedException {
        Assert.assertTrue(objCartPage.getCartPage());
        Thread.sleep(2000);
    }
    @Then("There is added item")
    public void checkingfirstAddItem() throws InterruptedException {
        Assert.assertEquals(objCartPage.getItemName(), "Sauce Labs Backpack");
        Assert.assertEquals(objCartPage.getItemPrice(), "$29.99");
        Assert.assertEquals(objCartPage.getItemDesc(), "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.");
        Thread.sleep(2000);
    }
    @Then("There is a continue shopping button")
    public void checkingContinueButton() throws InterruptedException {
        Assert.assertTrue(objCartPage.isCSButtonEnable());
        Thread.sleep(2000);
    }

    @Then("There is checkout button")
    public void checkingCheckoutButton() throws InterruptedException {
        Assert.assertTrue(objCartPage.isCheckoutButtonEnable());
        Thread.sleep(2000);
    }

    @Then("User has navigated to cart page that there is one item")
    public void navigateToCartPage() throws InterruptedException {;
        navigateToCart();
        checkingfirstAddItem();
        Thread.sleep(2000);
    }
    @Then("There is a continue shopping button and checkout button")
    public void checkingButtonAtCartPage() throws InterruptedException {
        checkingCheckoutButton();
        checkingContinueButton();
        Thread.sleep(2000);
    }

    @Then("User has navigated to dashboard page")
    public void navigateToDashboard() {
        loginSteps.userNavigateToDashboardPage();
    }

    @When("User click on checkout button")
    public void clickCheckout() throws InterruptedException {
        objCartPage.clickOnCheckoutButton();
        Thread.sleep(2000);
    }

    @When("User click on continue shopping button")
    public void clickCSButton() throws InterruptedException {
        objCartPage.clickOnCSButton();
        Thread.sleep(2000);
    }

    @Then("User has navigated to checkout information page")
    public void navigateToCheckoutInformation() throws InterruptedException {
        Assert.assertTrue(objcheckoutInfoPageActions.getCheckoutInfoPage());
        Thread.sleep(2000);
    }


}
