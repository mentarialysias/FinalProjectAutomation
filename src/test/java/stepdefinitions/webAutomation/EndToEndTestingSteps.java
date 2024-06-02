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
    public void verificationLoginPage() throws InterruptedException {
        loginSteps.checkingUsernameAndPasswordField();
        loginSteps.checkingLoginButton();
        loginSteps.checkingLogo();
    }

    @When("User enter valid username and password")
    public void enterUsernameAndPassword() throws InterruptedException {
        loginSteps.enterUsernameAndPassword("standard_user", "secret_sauce");
    }

    @Then("User navigating to dashboard page")
    public void navigatedToDashboardPage() throws InterruptedException {
        loginSteps.userNavigateToDashboardPage();
    }

    @When("User clicks the Add to Cart button for the {string}")
    public void addProductToCart(String string) throws InterruptedException {
        dashboardPageSteps.addingTheProductToCart(string);
    }

    @Then("There is {int} number of the cart icon")
    public void checkingCartIconsNumber(Integer int1) throws InterruptedException {
        dashboardPageSteps.checkCartNumberIcon(int1);
    }

    @When("User click cart icon")
    public void clickCartIcon() throws InterruptedException {
        cartPageSteps.clickCartButton();
    }

    @Then("user is navigated to the cart page which contains one product that has been added")
    public void navigateToCartPageWhichContainOneItem() throws InterruptedException {
        cartPageSteps.navigateToCart();
        cartPageSteps.checkingContinueButton();
        cartPageSteps.checkingCheckoutButton();
        cartPageSteps.checkingfirstAddItem();
    }


    @When("User click continue shopping button")
    public void clickContinueShoppingButton() throws InterruptedException {
        cartPageSteps.clickCSButton();
    }

    @When("user navigate to dashboard page and adding four other product")
    public void navigateToDashboardAndAddingOtherItem() throws InterruptedException {
        cartPageSteps.navigateToDashboard();
        dashboardPageSteps.addFourProduct();
    }





    @When("User click cart button and clicks on checkout button")
    public void clickCOOnCartPage() throws InterruptedException {
        clickCartIcon();
        cartPageSteps.clickCheckout();
    }

    @Then("The user is navigated to the checkout information page")
    public void navigateToCOInfPage() throws InterruptedException {
        cartPageSteps.navigateToCheckoutInformation();
    }




    @When("User fill the checkout information and click continue button")
    public void fillInformationAndClickContinue() throws InterruptedException {
       checkoutSteps.fillsCheckoutInformation();
       checkoutSteps.clickContinueButton();
    }

    @When("User navigate to checkout overview page and click finish button")
    public void navigateToCOOverviewAndClickFinish() throws InterruptedException {
       checkoutSteps.navigateToCOOverview();
       checkoutSteps.clickFinishButton();
    }

    @Then("User is navigated to checkout complete")
    public void navigateToCOComplete() throws InterruptedException {
        checkoutSteps.navigateToCOCompletePage();
        checkoutSteps.checkingTheTitleOfCOCompletePage();
        checkoutSteps.checkingBackHomeButtonOfCOCompletePage();
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
