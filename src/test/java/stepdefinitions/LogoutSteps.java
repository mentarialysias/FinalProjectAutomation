package stepdefinitions;

import actions.HomePageActions;
import actions.LoginPageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.HelperClass;

public class LogoutSteps {

	LoginPageActions objLogin = new LoginPageActions();
	HomePageActions objHomePage = new HomePageActions();

	String loginPageUrl = "https://www.saucedemo.com/";


	@Given("User login successfully and navigated to dashboard page")
	public void user_login_successfully_and_navigated_to_dashboard_page() {
		// valid login and navigated to dashboard page
		Assert.assertTrue(objHomePage.isDashboardDisplayed());
	}
	@When("User clicks on side bar menu")
	public void user_clicks_on_side_bar_menu() throws InterruptedException {
		// Click side bar menu
		objHomePage.hamburgerButtonClick();
		Thread.sleep(2000);
	}
	@When("User clicks on logout button")
	public void user_clicks_on_logout_button() throws InterruptedException {
		// Click logout button
		objHomePage.logoutButtonClick();
		Thread.sleep(2000);
	}
	@Then("User should be able to logout from the web application and display the login page")
	public void user_should_be_able_to_logout_from_the_web_application_and_display_the_login_page() throws InterruptedException {
		// User logout successfully and navigated
		String currentUrl = HelperClass.getCurrentUrl();
		Assert.assertEquals(loginPageUrl, currentUrl);
		Thread.sleep(2000);
	}











}
