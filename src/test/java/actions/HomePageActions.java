package actions;


import locators.HomePageLocators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.HelperClass;

public class HomePageActions {
    HomePageLocators homePageLocators = null;

    public HomePageActions() {
        this.homePageLocators = new HomePageLocators();
        PageFactory.initElements(HelperClass.getDriver(),homePageLocators);
    }

    //action to get tittle header page when successfully login
    public String getTitleHeaderPage() {
        return(homePageLocators.headerPageTitle.getText());
    }

    public WebElement getDashboard() {
        return(homePageLocators.Dashboard);
    }

    public WebElement getSideBarButton() {
        return(homePageLocators.sideBarButton);
    }

    public WebElement getLogoutButton() {
        return(homePageLocators.logoutButton);
    }


    //action to get tittle page when successfully login
    public String getTittlePage() {
        return(homePageLocators.homePageTitle.getText());
    }

    public boolean isCartButtonEnable() {
        WebElement cartButton = homePageLocators.cartButton;
        boolean isCartButtonEnable = cartButton.isEnabled();
        return isCartButtonEnable;
    }

    public void addItemToCart() {
        homePageLocators.addItemButton.click();
    }

    public void clickOnCartButton() {
        homePageLocators.cartButton.click();
    }
}
