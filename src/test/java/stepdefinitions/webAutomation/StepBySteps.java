package stepdefinitions.webAutomation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepBySteps {

    LoginSteps loginSteps = new LoginSteps();
    DashboardPageSteps dashboardPageSteps = new DashboardPageSteps();
    CartPageSteps cartPageSteps = new CartPageSteps();
    CheckoutSteps checkoutSteps = new CheckoutSteps();
    MenuPageSteps menuPageSteps = new MenuPageSteps();
    EndToEndTestingSteps end2end = new EndToEndTestingSteps();


    @Given("User has on dashboard page")
    public void hasOnDashboardPaga() throws InterruptedException {
        end2end.openTheSwagLabs();
        end2end.verificationLoginPage();
        end2end.enterUsernameAndPassword();
        end2end.navigatedToDashboardPage();
    }

    @Given("User has add one item to cart and cart icon showing {int}")
    public void hasAddedOneItemToCart(Integer int1) throws InterruptedException {
        hasOnDashboardPaga();
        end2end.addProductToCart("Sauce Labs Backpack");
        end2end.checkingCartIconsNumber(int1);
    }

    @Given("User has been navigated to the cart page, which contains one product")
    public void hasNavigateToCartPageWhichContainOneItem() throws InterruptedException {
        hasAddedOneItemToCart(1);
        end2end.clickCartIcon();
        end2end.navigateToCartPageWhichContainOneItem();
    }
    @Then("The number of Icon cart change to {int}")
    public void checkTheCartIconNumbersAfterAddOtherItems(Integer int1) throws InterruptedException {
        dashboardPageSteps.checkCartNumberIcon(int1);
    }

    @Given("User has add four other product and the cart number was {int}")
    public void hasAddingOtherItemAndCartNumberIs5(Integer int1) throws InterruptedException {
        hasNavigateToCartPageWhichContainOneItem();
        end2end.clickContinueShoppingButton();
        end2end.navigateToDashboardAndAddingOtherItem();
        checkTheCartIconNumbersAfterAddOtherItems(int1);
    }

    @Then("There is a field to enter checkout information")
    public void checkCOInformationField() throws InterruptedException {
        checkoutSteps.checkingCheckoutInformationTitle();
        checkoutSteps.checkingCheckoutInformationfield();
    }


    @Given("User has on checkout page")
    public void hasNavigateToCOPage() throws InterruptedException {
        hasAddingOtherItemAndCartNumberIs5(5);
        end2end.clickCOOnCartPage();
        end2end.navigateToCOInfPage();
        checkCOInformationField();
    }

    @Given("User has been navigated to the checkout compelete page")
    public void hasNavigateToCOCompelete() throws InterruptedException {
        hasNavigateToCOPage();
        end2end.fillInformationAndClickContinue();
        end2end.navigateToCOOverviewAndClickFinish();
        end2end.navigateToCOComplete();
    }
}
