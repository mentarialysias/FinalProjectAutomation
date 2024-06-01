package webAutomation.actions;

import webAutomation.locators.DetailProductPageLocators;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import webAutomation.utils.HelperClass;


public class DetailProductPageActions {

    DetailProductPageLocators detailProductPageLocators = null;

    public DetailProductPageActions() {
        this.detailProductPageLocators = new DetailProductPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), detailProductPageLocators);
    }



    public boolean cekURLDetailProduct(){
        String currentURL = webAutomation.utils.HelperClass.getDriver().getCurrentUrl();
        String expectedURL = "https://www.saucedemo.com/inventory-item";
        return currentURL.contains(expectedURL);
    }

    public boolean isBackButtonDisplayed(){
        return detailProductPageLocators.backButton.isDisplayed();
    }

    public boolean isProductNameDisplayed(){
        return detailProductPageLocators.productName.isDisplayed();
    }

    public void checkedProductName(){
        String actualName;
        String expectedName;
        actualName = detailProductPageLocators.productName.getText();
        expectedName = "Sauce Labs Backpack";
        Assert.assertEquals("Product Name Wasn't True", expectedName,actualName);
    }

    public boolean isProductImageDisplayed(){
        return detailProductPageLocators.productImage.isDisplayed();
    }

    public void checkedProductImage(){
        String actualImgAlt;
        String expectedImgAlt;
        actualImgAlt= detailProductPageLocators.productImage.getAttribute("alt");
        expectedImgAlt = "Sauce Labs Backpack";
        Assert.assertEquals("Product Name Wasn't True", expectedImgAlt, actualImgAlt);
    }
    public boolean isProductDescriptionDisplayed(){
        return detailProductPageLocators.productDescription.isDisplayed();
    }

    public void checkedProductDesc(){
        String actualDesc;
        String expectedDesc;
        actualDesc = detailProductPageLocators.productDescription.getText();
        expectedDesc = "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";
        Assert.assertEquals("Product Name Wasn't True", expectedDesc, actualDesc);
    }

    public boolean isProductPriceDisplayed(){
        return detailProductPageLocators.productPrice.isDisplayed();
    }

    public void checkingProductPrice(){
        String actualPrice;
        String expectedPrice;
        actualPrice = detailProductPageLocators.productPrice.getText();
        expectedPrice = "$29.99";
        Assert.assertEquals("Product Name Wasn't True", expectedPrice, actualPrice);
    }

    public boolean isAddCartButtonDisplayed(){
        return detailProductPageLocators.addNRemoveButton.isDisplayed();
    }

    public void clickAddToCart(){
        detailProductPageLocators.addNRemoveButton.click();
    }

    public void removeButtonDisplayed(){
        String buttonText;
        buttonText = detailProductPageLocators.addNRemoveButton.getText();
        Assert.assertEquals("Remove Button isn't displayed", "Remove", buttonText);
    }

    public void clickBackButton(){
        detailProductPageLocators.backButton.click();
    }

    public void cekURLDashboard(){
        String currentURL = webAutomation.utils.HelperClass.getDriver().getCurrentUrl();
        String expectedURL = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(expectedURL, currentURL);
    }
}
