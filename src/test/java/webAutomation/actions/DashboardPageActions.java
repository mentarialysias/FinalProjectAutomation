package webAutomation.actions;


import webAutomation.locators.DashboardPageLocators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import webAutomation.utils.HelperClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class DashboardPageActions {
    DashboardPageLocators dashboardPageLocators = null;

    public DashboardPageActions() {
        this.dashboardPageLocators = new DashboardPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), dashboardPageLocators);
    }

    //action to get tittle header page when successfully login
    public String getTitleHeaderPage() {
        return(dashboardPageLocators.headerPageTitle.getText());
    }

    public boolean isDashboardDisplayed() {
        return dashboardPageLocators.Dashboard.isDisplayed();
    }

    public void hamburgerButtonClick() {
        dashboardPageLocators.sideBarButton.click();
    }

    public void logoutButtonClick() {
        dashboardPageLocators.logoutButton.click();
    }


    //action to get tittle page when successfully login
    public String getTittlePage() {
        return(dashboardPageLocators.homePageTitle.getText());
    }

    public boolean isCartButtonEnable() {
        WebElement cartButton = dashboardPageLocators.cartButton;
        boolean isCartButtonEnable = cartButton.isEnabled();
        return isCartButtonEnable;
    }

    public void addItemToCart(String itemName) {
        if (itemName.equals("Sauce Labs Backpack")) {
            dashboardPageLocators.addToCartBackpackButton.click();
        } else if (itemName.equals("Sauce Labs Bike Light")) {
            dashboardPageLocators.addToCartBikeLightButton.click();
        } else if (itemName.equals("Sauce Labs Bolt T-Shirt")) {
            dashboardPageLocators.addToCartBoltTshirtButton.click();
        } else if (itemName.equals("Sauce Labs Fleece Jacket")) {
            dashboardPageLocators.addToCartFleeceJacketButton.click();
        } else if (itemName.equals("Sauce Labs Onesie")) {
            dashboardPageLocators.addToCartOnesieButton.click();
        } else if (itemName.equals("Test.allTheThings() T-Shirt (Red)")) {
            dashboardPageLocators.addToCartRedTshirtButton.click();
        }
    }

    public void clickOnCartButton() {
        dashboardPageLocators.cartButton.click();
    }

    public void clickProduct(){
        dashboardPageLocators.detailBackpack.click();
    }

    public void clickOnFilterButton(String selectFilter) {
        if (selectFilter.equals("Name (A to Z)")) {
            dashboardPageLocators.filterNameAtoZ.click();
        } else if (selectFilter.equals("Name (Z to A)")) {
            dashboardPageLocators.filterNameZtoA.click();
        } else if (selectFilter.equals("Price (low to high)")) {
            dashboardPageLocators.filterPriceLowToHigh.click();
        } else if (selectFilter.equals("Price (high to low)")) {
            dashboardPageLocators.filterPriceHighToLow.click();
        }
    }

    public boolean isProductSortedByZtoA() {
        // Ambil semua elemen yang berisi nama produk
        List<WebElement> productNameElements = dashboardPageLocators.productNames;

        // Ambil teks dari setiap elemen untuk mendapatkan daftar nama produk
        List<String> productNames = productNameElements.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());

        // Salin daftar nama produk dan urutkan secara terbalik (Z ke A)
        List<String> sortedProductNames = new ArrayList<>(productNames);
        sortedProductNames.sort(Comparator.reverseOrder());

        // Bandingkan daftar asli dengan daftar yang sudah diurutkan
        if (productNames.equals(sortedProductNames)) {
            return true;
        } else {
            return false;
        }

    }

    public int numberItemInCartButton() {
        String numberItem = dashboardPageLocators.cartButton.getText();
        if (numberItem.equals("")) {
            return 0;
        } else {
            return Integer.parseInt(numberItem);
        }
    }


    public boolean isRemoveButtonDisplayed(String itemName) {
        if (itemName.equals("Sauce Labs Backpack")) {
            return dashboardPageLocators.removeBackpackButton.isDisplayed();
        } else if (itemName.equals("Sauce Labs Bike Light")) {
            return dashboardPageLocators.removeBikeLightButton.isDisplayed();
        } else if (itemName.equals("Sauce Labs Bolt T-Shirt")) {
            return dashboardPageLocators.removeBoltTshirtButton.isDisplayed();
        } else if (itemName.equals("Sauce Labs Fleece Jacket")) {
            return dashboardPageLocators.removeFleeceJacketButton.isDisplayed();
        } else if (itemName.equals("Sauce Labs Onesie")) {
            return dashboardPageLocators.removeOnesieButton.isDisplayed();
        } else if (itemName.equals("Test.allTheThings() T-Shirt (Red)")) {
            return dashboardPageLocators.removeRedTshirtButton.isDisplayed();
        } else {
            return false;
        }
    }

    public void clickRemoveItemButton(String itemName) {
        if (itemName.equals("Sauce Labs Backpack")) {
            dashboardPageLocators.removeBackpackButton.click();
        } else if (itemName.equals("Sauce Labs Bike Light")) {
            dashboardPageLocators.removeBikeLightButton.click();
        } else if (itemName.equals("Sauce Labs Bolt T-Shirt")) {
            dashboardPageLocators.removeBoltTshirtButton.click();
        } else if (itemName.equals("Sauce Labs Fleece Jacket")) {
            dashboardPageLocators.removeFleeceJacketButton.click();
        } else if (itemName.equals("Sauce Labs Onesie")) {
            dashboardPageLocators.removeOnesieButton.click();
        } else if (itemName.equals("Test.allTheThings() T-Shirt (Red)")) {
            dashboardPageLocators.removeRedTshirtButton.click();
        }
    }

    public boolean isAddCartButtonDisplayed(String itemName) {
        if (itemName.equals("Sauce Labs Backpack")) {
            return dashboardPageLocators.addToCartBackpackButton.isDisplayed();
        } else if (itemName.equals("Sauce Labs Bike Light")) {
            return dashboardPageLocators.addToCartBikeLightButton.isDisplayed();
        } else if (itemName.equals("Sauce Labs Bolt T-Shirt")) {
            return dashboardPageLocators.addToCartBoltTshirtButton.isDisplayed();
        } else if (itemName.equals("Sauce Labs Fleece Jacket")) {
            return dashboardPageLocators.addToCartFleeceJacketButton.isDisplayed();
        } else if (itemName.equals("Sauce Labs Onesie")) {
            return dashboardPageLocators.addToCartOnesieButton.isDisplayed();
        } else if (itemName.equals("Test.allTheThings() T-Shirt (Red)")) {
            return dashboardPageLocators.addToCartRedTshirtButton.isDisplayed();
        } else {
            return false;
        }
    }

    public void resetAppStateButtonClick() {
        dashboardPageLocators.resetAppStateButton.click();
    }

    public void aboutButtonClick() {
        dashboardPageLocators.aboutButton.click();
    }
}
