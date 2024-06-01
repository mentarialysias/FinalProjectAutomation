package stepdefinitions.webAutomation;

import org.junit.Assert;
import webAutomation.actions.DashboardPageActions;
import io.cucumber.java.en.*;

public class DashboardPageSteps {

    DashboardPageActions objDashboardPage = new DashboardPageActions();

    @When("User click on the Filter With {string} button")
    public void user_click_on_the_filter_with_button(String selectFilter) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        objDashboardPage.clickOnFilterButton(selectFilter);
        Thread.sleep(2000);
    }

    @Then("User should see the list of products sorted by name from Z to A")
    public void user_should_see_the_list_of_products_sorted_by_name_from_z_to_a() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(objDashboardPage.isProductSortedByZtoA());
    }

    @When("User clicks the Add to cart button in {string} item on the dashboard")
    public void user_clicks_the_add_to_cart_button_in_item_on_the_dashboard(String item) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        objDashboardPage.addItemToCart(item);
        Thread.sleep(2000);
    }

    @Then("the cart icon showing {int} number of items")
    public void the_cart_icon_showing_number_of_items(int numberOfItem) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(objDashboardPage.numberItemInCartButton(), numberOfItem);
    }

    @Then("Add to Cart button in {string} product should change to Remove")
    public void add_to_cart_button_in_product_should_change_to_remove(String item) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(objDashboardPage.isRemoveButtonDisplayed(item));
    }

    @When("User clicks the Remove button in {string} item on the dashboard")
    public void user_clicks_the_remove_button_in_item_on_the_dashboard(String item) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        objDashboardPage.clickRemoveItemButton(item);
        Thread.sleep(2000);
    }
    @Then("The cart icon not showing any number of items")
    public void the_cart_icon_not_showing_any_number_of_items() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(objDashboardPage.numberItemInCartButton() == 0);
    }
    @Then("Remove button in {string} product should change to Add to Cart")
    public void remove_button_in_product_should_change_to_add_to_cart(String item) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(objDashboardPage.isAddCartButtonDisplayed(item));
    }

}


