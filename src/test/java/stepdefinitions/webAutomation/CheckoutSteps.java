package stepdefinitions.webAutomation;

import webAutomation.actions.*;
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
    public void navigatedToCartPage() throws InterruptedException {
        objHomePage.clickOnCartButton();
        Assert.assertTrue(objCartPage.getCartPage());
        Thread.sleep(2000);
    }

    @Then("There is checkout information title")
    public void checkingCheckoutInformationTitle() throws InterruptedException {
        Assert.assertEquals(objCheckoutInfoPage.getTitlePage(),"Checkout: Your Information");
        Thread.sleep(2000);
    }
    @Then("There is checkout info field")
    public void checkingCheckoutInformationfield() throws InterruptedException {
        Assert.assertTrue(objCheckoutInfoPage.getCheckoutInfoField());
        Thread.sleep(2000);
    }

    @Given("User has added item to cart")
    public void addedItemToCart() throws InterruptedException {
        loginSteps.userIsOnSwagLabLoginPage();
        loginSteps.enterUsernameAndPassword("standard_user","secret_sauce");
        loginSteps.userNavigateToDashboardPage();
        objHomePage.addItemToCart("Sauce Labs Backpack");
        Thread.sleep(2000);
    }

    @When("User fills in checkout info field with valid data")
    public void fillsCheckoutInformation() throws InterruptedException {
        objCheckoutInfoPage.fillsInCheckoutInfoField("yasmin", "azizah", "40291" );
        Thread.sleep(2000);
    }

    @When("User click on continue button")
    public void clickContinueButton() throws InterruptedException {
        objCheckoutInfoPage.clickOnContinueButton();
        Thread.sleep(2000);
    }

    @Then("User has navigated to checkout overview page")
    public void navigateToCOOverview() throws InterruptedException {
        Assert.assertTrue(objCheckoutOvwPage.getCheckoutOvwPage());
        Thread.sleep(2000);
    }
    @Then("There are card data item with their quantity")
    public void checkingCheckoutData() throws InterruptedException {
        Assert.assertEquals(objCheckoutOvwPage.getItemName(), "Sauce Labs Backpack");
        Assert.assertEquals(objCheckoutOvwPage.getItemQuantity(), "1");
        Thread.sleep(1000);
    }
    @Then("There are information payment, shipping and price")
    public void chekcingInformationOfCost() throws InterruptedException {
        objCheckoutOvwPage.isPaymentInformationCorrect();
        objCheckoutOvwPage.isShippingInformationCorrect();
        objCheckoutOvwPage.isPriceCalculationCorrect();
        Thread.sleep(2000);
    }
    @Then("There is cancel and finish button")
    public void checkingButtonOfCOOverviewPage() throws InterruptedException {
        objCheckoutOvwPage.isCancelButtonEnable();
        objCheckoutOvwPage.isFinishButtonEnable();
        Thread.sleep(2000);
    }

    @Then ("User has navigated to checkout complete page")
    public void navigateToCOCompletePage(){

    }

    @Then ("There is title order completed")
    public boolean checkingTheTitleOfCOCompletePage() throws InterruptedException {
        return objcheckoutCompletePage.isTitleOrderCompletedDisplayed();
    }

    @Then ("There is back home button")
    public boolean checkingBackHomeButtonOfCOCompletePage(){
        return objcheckoutCompletePage.isBackHomeButtonEnabled();
    }

    @When ("User click on finish button")
    public void clickFinishButton(){
        objCheckoutOvwPage.clickOnFinishButton();
    }
}
