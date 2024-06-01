package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;

import actions.LoginPageActions;
import utils.HelperClass;
import actions.DashboardPageActions;

public class LoginSteps {
	
	LoginPageActions objLogin = new LoginPageActions();
	DashboardPageActions objHomePage = new DashboardPageActions();

	String url = "https://www.saucedemo.com/";


	@Given("User is on SwagLab Login page")
	public void user_is_on_swag_lab_login_page() {
		//navigate to url website
		HelperClass.openPage(url);
	}

	@When("User has opened swag labs browser")
	public void user_has_opened_swag_labs_browser() throws InterruptedException {
		String currentUrl = HelperClass.getCurrentUrl();
		Assert.assertEquals(url, currentUrl);
		Thread.sleep(2000);
	}

	@Then("There are fields for inputting username and password")
	public void there_are_fields_for_inputting_username_and_password() {
		Assert.assertTrue(objLogin.isPasswordFieldDisplayed());
		Assert.assertTrue(objLogin.isUsernameFieldDisplayed());
	}

	@Then("There is a Login Button")
	public void there_is_a_login_button() {
		Assert.assertTrue(objLogin.isButtonEnable());
	}

	@Then("There is a Swag Labs logo name")
	public void there_is_a_swag_labs_logo_name() {
		Assert.assertTrue(objLogin.isLogoDisplayed());
	}

	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
		// login to application
		objLogin.loginStep(username, password);
	}

	@Then("User should be able to login successfully and navigated to dashboard page")
	public void user_should_be_able_to_login_successfully_and_navigated_to_dashboard_page() {
		// valid login and navigated to dashboard page
		Assert.assertTrue(objHomePage.isDashboardDisplayed());
	}

	@Then("User should be able to see a error message {string}")
	public void user_should_be_able_to_see_a_error_message(String errorMessage) {
		System.out.println(objLogin.getErrorMessage());
		Assert.assertEquals(errorMessage, objLogin.getErrorMessage());
	}



}
