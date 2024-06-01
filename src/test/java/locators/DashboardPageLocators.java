package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPageLocators {
    @FindBy(xpath = "//*[@id=\"header_container\"]/div[1]/div[2]/div")
    public WebElement headerPageTitle;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    public WebElement homePageTitle;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[1]/div[2]/div")
    public WebElement Dashboard;

    @FindBy(xpath = "//*[@id=\"react-burger-menu-btn\"]")
    public WebElement sideBarButton;

    @FindBy(xpath = "//*[@id=\"logout_sidebar_link\"]")
    public WebElement logoutButton;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement addItemButton;

    @FindBy(className = "shopping_cart_link")
    public WebElement cartButton;

    @FindBy(className = "inventory_item_name")
    public WebElement itemName;

    @FindBy(className = "inventory_item_price")
    public WebElement itemPrice;

    @FindBy(className = "inventory_item_desc")
    public WebElement itemDesc;
}
