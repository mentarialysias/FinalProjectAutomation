package stepdefinitions;

import actions.DetailProductPageActions;
import io.cucumber.java.en.*;
import org.bouncycastle.jcajce.provider.asymmetric.edec.IESCipher;
import org.junit.Assert;

import actions.LoginPageActions;
import utils.HelperClass;
import actions.DashboardPageActions;

public class DetailProductPageSteps {

    DashboardPageActions objDashboardPage = new DashboardPageActions();
    DetailProductPageActions objDetailProductPage = new DetailProductPageActions();
    LoginSteps loginSteps = new LoginSteps();

    @Given("User is on Detail Product Page of Sauce Labs Backpack")
    public void userIsOnDetailProductPage() throws InterruptedException {
        loginSteps.userIsOnSwagLabLoginPage();
        loginSteps.userHasOpenedSwagLab();
        loginSteps.enterUsernameAndPassword("standard_user","secret_sauce");
        loginSteps.userNavigateToDashboardPage();

        objDashboardPage.clickProduct();
    }

    @When("User has on detail product page")
    public void navigatedToDetailProductPage() {
        objDetailProductPage.cekURLDetailProduct();
    }

    @Then("There is back to product button")
    public void backButtonChecked() {
        objDetailProductPage.isBackButtonDisplayed();

    }

    @Then("there is the name, image, description and price of the Sauce Labs Backpack product")
    public void detailProductChecked() {
       objDetailProductPage.isProductNameDisplayed();
       objDetailProductPage.isProductImageDisplayed();
       objDetailProductPage.isProductDescriptionDisplayed();
       objDetailProductPage.isProductPriceDisplayed();
    }

    @Then("There is Add to cart button")
    public void AddCartButtonChecked() {
        objDetailProductPage.isAddCartButtonDisplayed();
    }

    @When("User click Add to cart button")
    public void clickAddCartButton() {
        objDetailProductPage.clickAddToCart();
    }

    @Then("Add to cart button change to Remove button")
    public void checkingButton() {
       objDetailProductPage.removeButtonDisplayed();
    }

    @When("User click Back to product button")
    public void clickBackButton() {
        objDetailProductPage.clickBackButton();
    }

    @Then("User navigate to dashboard page")
    public void navigateToDashboard() {
        objDetailProductPage.cekURLDashboard();
    }




}
