package actions;

import locators.CartPageLocators;
import locators.DashboardPageLocators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.HelperClass;

public class CartPageActions {

    CartPageLocators cartPageLocators = null;
    DashboardPageLocators dashboardPageLocators = null;

    public CartPageActions() {
        this.cartPageLocators = new CartPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), cartPageLocators);
        this.dashboardPageLocators = new DashboardPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), dashboardPageLocators);
    }

    public String getItemName() {
        return(dashboardPageLocators.itemName.getText());
    }

    public String getItemPrice() {
        return(dashboardPageLocators.itemPrice.getText());
    }

    public boolean isCheckoutButtonEnable() {
        WebElement checkoutButton = cartPageLocators.checkoutButton;
        boolean isCheckoutButtonEnable = checkoutButton.isEnabled();
        String checkoutButtonColor = checkoutButton.getCssValue("background-color");
        System.out.print(checkoutButtonColor);
        boolean hasColor = checkoutButtonColor.equalsIgnoreCase("rgba(61, 220, 145, 1)") || checkoutButtonColor.equalsIgnoreCase("#3ddc91");
        return isCheckoutButtonEnable && hasColor;
    }

    public boolean isCSButtonEnable() {
        return cartPageLocators.csButton.isEnabled();
    }

    public boolean getCartPage() {
        return CartPageLocators.CartPage.isDisplayed();
    }

    public String getItemDesc() {
        return (dashboardPageLocators.itemDesc.getText());
    }

    public void clickOnCheckoutButton() {
        cartPageLocators.checkoutButton.click();
    }

    public void clickOnCSButton() {
        cartPageLocators.csButton.click();
    }
}
