package stepdefinitions.webAutomation;

import io.cucumber.java.en.*;
import org.junit.Assert;

import webAutomation.actions.LoginPageActions;
import webAutomation.utils.HelperClass;
import webAutomation.actions.DashboardPageActions;

public class LoginSteps {
	
	LoginPageActions objLogin = new LoginPageActions();
	DashboardPageActions objHomePage = new DashboardPageActions();

	String url = "https://www.saucedemo.com/";


	@Given("User is on SwagLab Login page")
	public void userIsOnSwagLabLoginPage() {
		//navigate to url website
		HelperClass.openPage(url);
	}

	@When("User has opened swag labs browser")
	public void userHasOpenedSwagLab() throws InterruptedException {
		String currentUrl = HelperClass.getCurrentUrl();
		Assert.assertEquals(url, currentUrl);
		Thread.sleep(2000);
	}

	@Then("There are fields for inputting username and password")
	public void checkingUsernameAndPasswordField() throws InterruptedException {
		Assert.assertTrue(objLogin.isPasswordFieldDisplayed());
		Assert.assertTrue(objLogin.isUsernameFieldDisplayed());
		Thread.sleep(1000);
	}

	@Then("There is a Login Button")
	public void checkingLoginButton() throws InterruptedException {
		Assert.assertTrue(objLogin.isButtonEnable());
		Thread.sleep(1000);
	}

	@Then("There is a Swag Labs logo name")
	public void checkingLogo() throws InterruptedException {
		Assert.assertTrue(objLogin.isLogoDisplayed());
		Thread.sleep(1000);
	}

	@When("User enters username as {string} and password as {string}")
	public void enterUsernameAndPassword(String username, String password) throws InterruptedException {
		// login to application
		objLogin.loginStep(username, password);
		Thread.sleep(1000);
	}

	@Then("User should be able to login successfully and navigated to dashboard page")
	public void userNavigateToDashboardPage() throws InterruptedException {
		// valid login and navigated to dashboard page
		Assert.assertTrue(objHomePage.isDashboardDisplayed());
		Thread.sleep(1000);
	}

	@Then("User should be able to see a error message {string}")
	public void errorMessageDisplayed(String errorMessage) throws InterruptedException {
		System.out.println(objLogin.getErrorMessage());
		Assert.assertEquals(errorMessage, objLogin.getErrorMessage());
		Thread.sleep(1000);
	}



}
