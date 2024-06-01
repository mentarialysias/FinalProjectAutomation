package webAutomation.actions;

import webAutomation.locators.CheckoutCompletePageLocators;
import org.openqa.selenium.support.PageFactory;
import webAutomation.utils.HelperClass;

public class CheckoutCompletePageActions {
    CheckoutCompletePageLocators checkoutCompletePageLocators = null;

    public CheckoutCompletePageActions() {
        this.checkoutCompletePageLocators = new CheckoutCompletePageLocators();
        PageFactory.initElements(HelperClass.getDriver(), checkoutCompletePageLocators);
    }

    public boolean isTitleOrderCompletedDisplayed(){
        return checkoutCompletePageLocators.titleOrderCompleted.isDisplayed();
    }

    public boolean isBackHomeButtonEnabled(){
        return checkoutCompletePageLocators.backHomeButton.isEnabled();
    }
}
