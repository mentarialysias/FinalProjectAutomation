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
        this.homePageLocators = new HomePageLocators();
        PageFactory.initElements(HelperClass.getDriver(), homePageLocators);
        this.cartPageActions = new CartPageActions();
        PageFactory.initElements(HelperClass.getDriver(), cartPageActions);
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
        // Menghapus semua karakter non-numerik kecuali titik desimal
        String itemPriceText = cartPageActions.getItemPrice().replaceAll("[^\\d.]", "");
        double itemPrice = Double.parseDouble(itemPriceText);

        String subTotalText = checkoutOvwPageLocators.subTotal.getText().replaceAll("[^\\d.]", "");
        double subTotal = Double.parseDouble(subTotalText);

        String taxText = checkoutOvwPageLocators.tax.getText().replaceAll("[^\\d.]", "");
        double tax = Double.parseDouble(taxText);

        String itemTotalText = checkoutOvwPageLocators.itemTotal.getText().replaceAll("[^\\d.]", "");
        double itemTotal = Double.parseDouble(itemTotalText);

        // Memeriksa apakah subtotal, pajak, dan total item benar
        boolean isSubTotalCorrect = itemPrice == subTotal;
        boolean isTaxCorrect = tax == 2.40; // Pastikan nilai pajak yang diharapkan benar
        boolean isItemTotalCorrect = itemTotal == (itemPrice + tax);

        return isSubTotalCorrect && isTaxCorrect && isItemTotalCorrect;
    }

    public boolean getCheckoutOvwPage() {
        return checkoutOvwPageLocators.checkoutOvwPage.isDisplayed();
    }

    public void clickOnFinishButton() {
        checkoutOvwPageLocators.finishButton.click();
    }
}
