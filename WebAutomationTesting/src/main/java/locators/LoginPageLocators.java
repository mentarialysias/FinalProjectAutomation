package locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
    @FindBy(name = "user-name")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3/text()")
    public  WebElement errorMessage;

    @FindBy(className = "login_logo")
    public WebElement logoSwaLabs;

    @FindBy(xpath = "(//*[contains(@class, 'svg-inline--fa fa-times-circle fa-w-16 error_icon')])[1]")
    public WebElement xIconUsername;

    @FindBy(xpath = "(//*[contains(@class, 'svg-inline--fa fa-times-circle fa-w-16 error_icon')])[2]")
    public WebElement xIconPassword;



}
