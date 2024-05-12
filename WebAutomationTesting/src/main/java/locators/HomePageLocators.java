package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
    @FindBy(xpath = "//*[@id=\"header_container\"]/div[1]/div[2]/div")
    public WebElement headerPageTitle;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    public WebElement homePageTitle;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[1]/div[2]/div")
    public WebElement Dashboard;

    @FindBy(xpath = "//*[@id=\"react-burger-menu-btn\"]")
    public WebElement profileButton;

    @FindBy(xpath = "//*[@id=\"logout_sidebar_link\"]")
    public WebElement logoutButton;

}
