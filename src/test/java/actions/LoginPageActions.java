package actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import locators.LoginPageLocators;
import utils.HelperClass;


public class LoginPageActions {

  LoginPageLocators loginPageLocators = null;

  public LoginPageActions() {
    this.loginPageLocators = new LoginPageLocators();
    PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
  }

  public boolean isUsernameFieldDisplayed() {
    WebElement usernameField = loginPageLocators.username;
    boolean isDisplayed = usernameField.isDisplayed();
    boolean isEmpty = usernameField.getText().isEmpty();
    String placeholderText = usernameField.getAttribute("placeholder");
    return isDisplayed && isEmpty && placeholderText.equals("Username");
  }

  public boolean isPasswordFieldDisplayed() {
    WebElement passwordField = loginPageLocators.password;
    boolean isDisplayed = passwordField.isDisplayed();
    boolean isEmpty = passwordField.getText().isEmpty();
    String placeholderText = passwordField.getAttribute("placeholder");
    return isDisplayed && isEmpty && placeholderText.equals("Password");
  }
  public boolean isLogoDisplayed(){
    return loginPageLocators.logoSwaLabs.isDisplayed();
  }

  public boolean isButtonEnable() {
    WebElement loginButton = loginPageLocators.loginButton;
    boolean isButtonEnabled = loginButton.isEnabled();
    String buttonColor = loginButton.getCssValue("background-color");
    System.out.print(buttonColor);
    boolean hasColor = buttonColor.equalsIgnoreCase("rgba(61, 220, 145, 1)") || buttonColor.equalsIgnoreCase("#3ddc91");
    return isButtonEnabled && hasColor;
}
  public void loginStep(String username, String password) {
    loginPageLocators.username.sendKeys(username);
    loginPageLocators.password.sendKeys(password);
    loginPageLocators.loginButton.click();
  }

  //action to get error message when invalid credential
  public String getErrorMessage() {
    return(loginPageLocators.errorMessage.getText());
  }




}