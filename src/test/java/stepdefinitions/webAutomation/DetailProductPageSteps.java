package stepdefinitions.webAutomation;

import webAutomation.actions.DetailProductPageActions;
import io.cucumber.java.en.*;

import webAutomation.actions.DashboardPageActions;

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
    public void navigatedToDetailProductPage() throws InterruptedException {
        objDetailProductPage.cekURLDetailProduct();
        Thread.sleep(500);
    }

    @Then("There is back to product button")
    public void backButtonChecked() throws InterruptedException {
        objDetailProductPage.isBackButtonDisplayed();
        Thread.sleep(500);

    }

    @Then("there is the name, image, description and price of the Sauce Labs Backpack product")
    public void detailProductChecked() throws InterruptedException {
       objDetailProductPage.isProductNameDisplayed();
       objDetailProductPage.isProductImageDisplayed();
       objDetailProductPage.isProductDescriptionDisplayed();
       objDetailProductPage.isProductPriceDisplayed();
        Thread.sleep(500);
    }

    @Then("There is Add to cart button")
    public void AddCartButtonChecked() throws InterruptedException {
        objDetailProductPage.isAddCartButtonDisplayed();
        Thread.sleep(500);
    }

    @When("User click Add to cart button")
    public void clickAddCartButton() throws InterruptedException {
        objDetailProductPage.clickAddToCart();
        Thread.sleep(500);
    }

    @Then("Add to cart button change to Remove button")
    public void checkingButton() throws InterruptedException {
       objDetailProductPage.removeButtonDisplayed();
        Thread.sleep(500);
    }

    @When("User click Back to product button")
    public void clickBackButton() throws InterruptedException {
        objDetailProductPage.clickBackButton();
        Thread.sleep(500);
    }

    @Then("User navigate to dashboard page")
    public void navigateToDashboard() throws InterruptedException {
        objDetailProductPage.cekURLDashboard();
        Thread.sleep(500);
    }




}
