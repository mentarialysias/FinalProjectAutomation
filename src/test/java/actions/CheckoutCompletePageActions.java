package actions;

import locators.CheckoutCompletePageLocators;
import locators.CheckoutOvwPageLocators;
import org.openqa.selenium.support.PageFactory;
import utils.HelperClass;

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
