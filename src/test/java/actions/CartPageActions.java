package actions;

import locators.CartPageLocators;
import locators.HomePageLocators;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.HelperClass;

public class CartPageActions {

    CartPageLocators cartPageLocators = null;
    HomePageLocators homePageLocators = null;

    public CartPageActions() {
        this.cartPageLocators = new CartPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), cartPageLocators);
        this.homePageLocators = new HomePageLocators();
        PageFactory.initElements(HelperClass.getDriver(), homePageLocators);
    }

    public String getItemName() {
        return(homePageLocators.itemName.getText());
    }

    public String getItemPrice() {
        return(homePageLocators.itemPrice.getText());
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
        WebElement csButton = cartPageLocators.csButton;
        boolean isCSButtonEnable = csButton.isEnabled();
        return isCSButtonEnable;
    }

    public boolean getCartPage() {
        return CartPageLocators.CartPage.isDisplayed();
    }

    public String getItemDesc() {
        return (homePageLocators.itemDesc.getText());
    }

    public void clickOnCheckoutButton() {
        cartPageLocators.checkoutButton.click();
    }

    public void clickOnCSButton() {
        cartPageLocators.csButton.click();
    }
}
