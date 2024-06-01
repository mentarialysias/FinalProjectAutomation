package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.IDN;

public class CheckoutInfoPageLocators {

    @FindBy(id = "checkout_info_container")
    public WebElement checkoutInfoPage;

    @FindBy(className = "title")
    public WebElement checkoutInformationTitle;

    @FindBy(className = "checkout_info")
    public WebElement checkoutInfoField;

    @FindBy(xpath = "//*[@id=\"first-name\"]")
    public WebElement firstName;

    @FindBy(xpath = "//*[@id=\"last-name\"]")
    public WebElement lastName;

    @FindBy(xpath = "//*[@id=\"postal-code\"]")
    public WebElement zipCode;

    @FindBy(id = "continue")
    public WebElement continueButton;

}
