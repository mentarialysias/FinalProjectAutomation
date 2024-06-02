package stepdefinitions.webAutomation;

import webAutomation.actions.DashboardPageActions;
import webAutomation.actions.LoginPageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import webAutomation.utils.HelperClass;

public class MenuPageSteps {

	LoginPageActions objLogin = new LoginPageActions();
	DashboardPageActions objDashboardPage = new DashboardPageActions();
	LoginSteps loginSteps = new LoginSteps();
	String loginPageUrl = "https://www.saucedemo.com/";
	String aboutPageUrl = "https://saucelabs.com/";


	@Given("User login successfully and navigated to dashboard page")
	public void navigateToDashboardPage() throws InterruptedException{
		loginSteps.userIsOnSwagLabLoginPage();
		loginSteps.enterUsernameAndPassword("standard_user","secret_sauce");
		loginSteps.userNavigateToDashboardPage();
		Thread.sleep(2000);
	}
	@When("User clicks on side bar menu")
	public void clickHamburger() throws InterruptedException {
		// Click side bar menu
		objDashboardPage.hamburgerButtonClick();
		Thread.sleep(2000);
	}
	@When("User clicks on logout button")
	public void clickLogoutButton() throws InterruptedException {
		// Click logout button
		objDashboardPage.logoutButtonClick();
		Thread.sleep(2000);
	}
	@Then("User should be able to logout from the web application and display the login page")
	public void successfullyLogout() throws InterruptedException {
		// User logout successfully and navigated
		String currentUrl = HelperClass.getCurrentUrl();
		Assert.assertEquals(loginPageUrl, currentUrl);
		Thread.sleep(2000);
	}

	@Then("User clicks on reset app state button")
	public void clickResetAppStateButton() throws InterruptedException {
		// Click reset app state button
		objDashboardPage.resetAppStateButtonClick();
		Thread.sleep(2000);
	}

	@When("User clicks on about button")
	public void clickAboutButton() throws InterruptedException {
		objDashboardPage.aboutButtonClick();
		Thread.sleep(2000);
	}

	@Then("User should be able to navigate to the about page")
	public void navigateToAboutButton() throws InterruptedException {
		String currentUrl = HelperClass.getCurrentUrl();
		Assert.assertEquals(aboutPageUrl, currentUrl);
		Thread.sleep(2000);
	}

}
