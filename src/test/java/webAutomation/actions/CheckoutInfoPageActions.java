package webAutomation.actions;

import webAutomation.locators.CheckoutInfoPageLocators;
import org.openqa.selenium.support.PageFactory;
import webAutomation.utils.HelperClass;

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

    public void fillsInCheckoutInfoField(String firstName, String lastName, String zipCode){
        checkoutInfoPageLocators.firstName.sendKeys(firstName);
        checkoutInfoPageLocators.lastName.sendKeys(lastName);
        checkoutInfoPageLocators.zipCode.sendKeys(zipCode);
    }

    public void clickOnContinueButton() {
        checkoutInfoPageLocators.continueButton.click();
    }
}
