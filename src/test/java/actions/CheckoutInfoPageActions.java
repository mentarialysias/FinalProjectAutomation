package actions;

import locators.CartPageLocators;
import locators.CheckoutInfoPageLocators;
import locators.HomePageLocators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.HelperClass;

public class CheckoutInfoPageActions {
    CheckoutInfoPageLocators checkoutInfoPageLocators = null;

    public CheckoutInfoPageActions() {
        this.checkoutInfoPageLocators = new CheckoutInfoPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), checkoutInfoPageLocators);
    }

    public boolean getCheckoutInfoPage() {
        return checkoutInfoPageLocators.checkoutInfoPage.isDisplayed();
    }

    public String getTitlePage() {
        return (checkoutInfoPageLocators.checkoutInformationTitle.getText());
    }

    public boolean getCheckoutInfoField() {
        return checkoutInfoPageLocators.checkoutInfoField.isDisplayed();
    }
}
