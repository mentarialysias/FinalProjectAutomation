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
    public void openTheSwagLabs() throws InterruptedException {
        loginSteps.userHasOpenedSwagLab();
    }

    @When("User verification the login page")
    public void verificationLoginPage() {
        loginSteps.checkingUsernameAndPasswordField();
        loginSteps.checkingLoginButton();
        loginSteps.checkingLogo();
    }

    @When("User enter valid username and password")
    public void enterUsernameAndPassword() {
        loginSteps.enterUsernameAndPassword("standard_user", "secret_sauce");
    }

    @Then("User navigating to dashboard page")
    public void navigatedToDashboardPage() {
        loginSteps.userNavigateToDashboardPage();
    }

    @Given("User has on dashboard page")
    public void hasOnDashboardPaga() throws InterruptedException {
        openTheSwagLabs();
        verificationLoginPage();
        enterUsernameAndPassword();
        navigatedToDashboardPage();
    }

    @When("User clicks the Add to Cart button for the {string}")
    public void addProductToCart(String string) throws InterruptedException {
        dashboardPageSteps.addingTheProductToCart(string);
    }

    @Then("There is {int} number of the cart icon")
    public void checkingCartIconsNumber(Integer int1) {
        dashboardPageSteps.checkCartNumberIcon(int1);
    }

    @Given("User has add one item to cart and cart icon showing {int}")
    public void hasAddedOneItemToCart(Integer int1) throws InterruptedException {
        hasOnDashboardPaga();
        addProductToCart("Sauce Labs Backpack");
        checkingCartIconsNumber(int1);
    }

    @When("User click cart icon")
    public void clickCartIcon() {
        cartPageSteps.clickCartButton();
    }

    @Then("user is navigated to the cart page which contains one product that has been added")
    public void navigateToCartPageWhichContainOneItem() throws InterruptedException {
        cartPageSteps.navigateToCart();
        cartPageSteps.checkingContinueButton();
        cartPageSteps.checkingCheckoutButton();
        cartPageSteps.checkingfirstAddItem();
    }

    @Given("User has been navigated to the cart page, which contains one product")
    public void hasNavigateToCartPageWhichContainOneItem() throws InterruptedException {
        hasAddedOneItemToCart(1);
        clickCartIcon();
        navigateToCartPageWhichContainOneItem();
    }

    @When("User click continue shopping button")
    public void clickContinueShoppingButton() {
        cartPageSteps.clickCSButton();
    }

    @When("user navigate to dashboard page and adding four other product")
    public void navigateToDashboardAndAddingOtherItem() throws InterruptedException {
        cartPageSteps.navigateToDashboard();
        dashboardPageSteps.addFourProduct();
    }

    @Then("The number of Icon cart change to {int}")
    public void checkTheCartIconNumbersAfterAddOtherItems(Integer int1) {
        dashboardPageSteps.checkCartNumberIcon(int1);
    }

    @Given("User has add four other product and the cart number was {int}")
    public void hasAddingOtherItemAndCartNumberIs5(Integer int1) throws InterruptedException {
        hasNavigateToCartPageWhichContainOneItem();
        clickContinueShoppingButton();
        navigateToDashboardAndAddingOtherItem();
        checkTheCartIconNumbersAfterAddOtherItems(int1);
    }

    @When("User click cart button and clicks on checkout button")
    public void clickCOOnCartPage() {
        clickCartIcon();
        cartPageSteps.clickCheckout();
    }

    @Then("The user is navigated to the checkout information page")
    public void navigateToCOInfPage() throws InterruptedException {
        cartPageSteps.navigateToCheckoutInformation();
    }

    @Then("There is a field to enter checkout information")
    public void checkCOInformationField() {
       checkoutSteps.checkingCheckoutInformationTitle();
       checkoutSteps.checkingCheckoutInformationfield();
    }

    @Given("User has on checkout page")
    public void hasNavigateToCOPage() throws InterruptedException {
       hasAddingOtherItemAndCartNumberIs5(5);
       clickCOOnCartPage();
       navigateToCOInfPage();
       checkCOInformationField();
    }

    @When("User fill the checkout information and click continue button")
    public void fillInformationAndClickContinue() {
       checkoutSteps.fillsCheckoutInformation();
       checkoutSteps.clickContinueButton();
    }

    @When("User navigate to checkout overview page and click finish button")
    public void navigateToCOOverviewAndClickFinish() throws InterruptedException {
       checkoutSteps.navigateToCOOverview();
       checkoutSteps.clickFinishButton();
    }

    @Then("User is navigated to checkout complete")
    public void navigateToCOComplete() {
        checkoutSteps.navigateToCOCompletePage();
        checkoutSteps.checkingTheTitleOfCOCompletePage();
        checkoutSteps.checkingBackHomeButtonOfCOCompletePage();
    }

    @Given("User has been navigated to the checkout compelete page")
    public void hasNavigateToCOCompelete() throws InterruptedException {
        hasNavigateToCOPage();
        fillInformationAndClickContinue();
        navigateToCOOverviewAndClickFinish();
        navigateToCOComplete();
    }

    @When("user logs out of the application")
    public void logoutFromSwagLabs() throws InterruptedException {
        menuPageSteps.clickHamburger();
        menuPageSteps.clickLogoutButton();
    }

    @Then("user has been navigate to SwagLab Login page")
    public void navigateToSwagLabLoginPage() throws InterruptedException {
        menuPageSteps.successfullyLogout();
    }

}
