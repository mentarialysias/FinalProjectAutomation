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

    @When("User click on checkout button")
    public void clickCheckout() {
        objCartPage.clickOnCheckoutButton();
    }

    @When("User click on continue shopping button")
    public void clickContinueShopping() {
        objCartPage.clickOnCSButton();
    }

    @Then("User has navigated to checkout information page")
    public void navigateToCheckoutInformation() throws InterruptedException {
        Assert.assertTrue(objCheckoutInfoPage.getCheckoutInfoPage());
        Thread.sleep(2000);
    }
    @Then("There is checkout information title")
    public void checkingCheckoutInformationTitle() {
        Assert.assertEquals(objCheckoutInfoPage.getTitlePage(),"Checkout: Your Information");
    }
    @Then("There is checkout info field")
    public void checkingCheckoutInformationfield() {
        Assert.assertTrue(objCheckoutInfoPage.getCheckoutInfoField());
    }

    @Given("User has added item to cart")
    public void addedItemToCart() {
        loginSteps.userIsOnSwagLabLoginPage();
        loginSteps.enterUsernameAndPassword("standard_user","secret_sauce");
        loginSteps.userNavigateToDashboardPage();
        objHomePage.addItemToCart("Sauce Labs Backpack");
    }

    @When("User fills in checkout info field with valid data")
    public void fillsCheckoutInformation() {
        objCheckoutInfoPage.fillsInCheckoutInfoField("yasmin", "azizah", "40291" );
    }

    @When("User click on continue button")
    public void clickContinueButton() {
        objCheckoutInfoPage.clickOnContinueButton();
    }

    @Then("User has navigated to checkout overview page")
    public void navigateToCOOverview() throws InterruptedException {
        Assert.assertTrue(objCheckoutOvwPage.getCheckoutOvwPage());
        Thread.sleep(2000);
    }
    @Then("There are card data item with their quantity")
    public void checkingCheckoutData() {
        Assert.assertEquals(objCheckoutOvwPage.getItemName(), "Sauce Labs Backpack");
        Assert.assertEquals(objCheckoutOvwPage.getItemQuantity(), "1");
    }
    @Then("There are information payment, shipping and price")
    public void chekcingInformationOfCost() {
        objCheckoutOvwPage.isPaymentInformationCorrect();
        objCheckoutOvwPage.isShippingInformationCorrect();
        objCheckoutOvwPage.isPriceCalculationCorrect();
    }
    @Then("There is cancel and finish button")
    public void checkingButtonOfCOOverviewPage() {
        objCheckoutOvwPage.isCancelButtonEnable();
        objCheckoutOvwPage.isFinishButtonEnable();
    }

    @Then ("User has navigated to checkout complete page")
    public void navigateToCOCompletePage(){

    }

    @Then ("There is title order completed")
    public boolean checkingTheTitleOfCOCompletePage(){
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
