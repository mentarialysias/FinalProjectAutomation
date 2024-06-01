package webAutomation.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOvwPageLocators {

    @FindBy(id = "checkout_summary_container")
    public WebElement checkoutOvwPage;

    @FindBy(id = "cert_item")
    public WebElement cardItem;

    @FindBy(className = "cart_quantity")
    public WebElement itemQuantity;

    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[2]")
    public WebElement paymentInformation;

    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[4]")
    public WebElement shippingInformation;

    @FindBy(className = "summary_subtotal_label")
    public WebElement subTotal;

    @FindBy(className = "summary_tax_label")
    public WebElement tax;

    @FindBy(className = "summary_total_label")
    public WebElement itemTotal;

    @FindBy(id = "cancel")
    public WebElement cancelButton;

    @FindBy(id = "finish")
    public WebElement finishButton;
}
