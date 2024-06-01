package actions;


import locators.DashboardPageLocators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.HelperClass;

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

    public void addItemToCart() {
        dashboardPageLocators.addItemButton.click();
    }

    public void clickOnCartButton() {
        dashboardPageLocators.cartButton.click();
    }
}
