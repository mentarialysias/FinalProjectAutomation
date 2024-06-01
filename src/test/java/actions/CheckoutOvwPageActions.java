package actions;

import locators.CheckoutOvwPageLocators;
import locators.HomePageLocators;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import utils.HelperClass;

public class CheckoutOvwPageActions {

    CheckoutOvwPageLocators checkoutOvwPageLocators = null;
    HomePageLocators homePageLocators = null;
    CartPageActions cartPageActions = null;

    public CheckoutOvwPageActions() {
        this.checkoutOvwPageLocators = new CheckoutOvwPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), checkoutOvwPageLocators);
    }

    public String getItemName() {
        return homePageLocators.itemName.getText();
    }

    public String getItemQuantity() {
        return checkoutOvwPageLocators.itemQuantity.getText();
    }

    public boolean isPaymentInformationCorrect(){
        boolean payInfoDisplayed = checkoutOvwPageLocators.paymentInformation.isDisplayed();
        String payInfo = checkoutOvwPageLocators.paymentInformation.getText();
        boolean payInfoCorrect = payInfo.equals("SauceCard #31337");

        return payInfoDisplayed && payInfoCorrect;
    }

    public boolean isShippingInformationCorrect() {
        boolean shippingInfoDisplayed = checkoutOvwPageLocators.paymentInformation.isDisplayed();
        String shippingInfo = checkoutOvwPageLocators.paymentInformation.getText();
        boolean shippingInfoCorrect = shippingInfo.equals("Free Pony Express Delivery!");

        return shippingInfoDisplayed && shippingInfoCorrect;
    }

    public boolean isFinishButtonEnable() {
        return checkoutOvwPageLocators.finishButton.isEnabled();
    }

    public boolean isCancelButtonEnable() {
        return checkoutOvwPageLocators.cancelButton.isEnabled();
    }

    public boolean isPriceCalculationCorrect() {
        boolean cekSubTotal;
        boolean cekTax;
        boolean cekItemTotal;

        cekSubTotal = Assert.assertEquals(cartPageActions.getItemPrice(), checkoutOvwPageLocators.subTotal);
        cekTax = Assert.assertEquals(checkoutOvwPageLocators.tax.getText(), "$2.40");
        cekItemTotal = Assert.assertEquals(homePageLocators.itemPrice.getText() + checkoutOvwPageLocators.tax.getText(), checkoutOvwPageLocators.itemTotal);

        return cekSubTotal && cekTax && cekItemTotal;
    }

    public boolean getTitleOrderCompleted(){
        Assert.assertEquals(check);
    }
}