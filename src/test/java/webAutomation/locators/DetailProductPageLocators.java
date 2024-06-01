package webAutomation.locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetailProductPageLocators {

    @FindBy(className = "inventory_details_back_button")
    public WebElement backButton;

    @FindBy(className = "inventory_details_name")
    public WebElement productName;

    @FindBy(className = "inventory_details_img")
    public WebElement productImage;

    @FindBy(className = "inventory_details_desc")
    public WebElement productDescription;

    @FindBy(className = "inventory_details_price")
    public WebElement productPrice;

    @FindBy(className = "btn_inventory")
    public WebElement addNRemoveButton;






}
