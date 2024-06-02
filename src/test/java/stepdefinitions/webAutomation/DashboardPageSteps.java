package stepdefinitions.webAutomation;

import org.junit.Assert;
import webAutomation.actions.DashboardPageActions;
import io.cucumber.java.en.*;

public class DashboardPageSteps {

    DashboardPageActions objDashboardPage = new DashboardPageActions();

    @When("User click on the Filter With {string} button")
    public void clickFilterButton(String selectFilter) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        objDashboardPage.clickOnFilterButton(selectFilter);
        Thread.sleep(500);
    }

    @Then("User should see the list of products sorted by name from Z to A")
    public void isListShortedZtoA() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(objDashboardPage.isProductSortedByZtoA());
    }

    @When("User clicks the Add to cart button in {string} item on the dashboard")
    public void addingTheProductToCart(String item) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        objDashboardPage.addItemToCart(item);
        Thread.sleep(500);
    }

    @Then("the cart icon showing {int} number of items")
    public void checkCartNumberIcon(int numberOfItem) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(objDashboardPage.numberItemInCartButton(), numberOfItem);
        Thread.sleep(500);
    }

    @Then("Add to Cart button in {string} product should change to Remove")
    public void isAddButtonChangeToRemoveButton(String item) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(objDashboardPage.isRemoveButtonDisplayed(item));
        Thread.sleep(500);
    }

    @When("User clicks the Add to cart button for four item on the dashboard")
    public void addFourProduct() throws InterruptedException {
        String firstProduct = "Sauce Labs Bike Light";
        String secondProduct = "Sauce Labs Bolt T-Shirt";
        String thirdProduct = "Sauce Labs Fleece Jacket";
        String fourthProduct = "Sauce Labs Onesie";

        addingTheProductToCart(firstProduct);
        addingTheProductToCart(secondProduct);
        addingTheProductToCart(thirdProduct);
        addingTheProductToCart(fourthProduct);
    }

    @Then("Add to Cart button in four product has been added should change to Remove")
    public void isAddButtonOfFourProductChangeToRemoveButton() throws InterruptedException {
        String firstProduct = "Sauce Labs Bike Light";
        String secondProduct = "Sauce Labs Bolt T-Shirt";
        String thirdProduct = "Sauce Labs Fleece Jacket";
        String fourthProduct = "Sauce Labs Onesie";

        isAddButtonChangeToRemoveButton(firstProduct);
        isAddButtonChangeToRemoveButton(secondProduct);
        isAddButtonChangeToRemoveButton(thirdProduct);
        isAddButtonChangeToRemoveButton(firstProduct);
    }

    @When("User clicks the Remove button in {string} item on the dashboard")
    public void clickRemoveButton(String item) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        objDashboardPage.clickRemoveItemButton(item);
        Thread.sleep(500);
    }
    @Then("The cart icon not showing any number of items")
    public void isCartShowingNoAnyNumber() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(objDashboardPage.numberItemInCartButton() == 0);
        Thread.sleep(500);
    }
    @Then("Remove button in {string} product should change to Add to Cart")
    public void isRemoveButtonChangeToAddButton(String item) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(objDashboardPage.isAddCartButtonDisplayed(item));
        Thread.sleep(500);
    }

}


