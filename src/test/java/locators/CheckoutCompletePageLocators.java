package locators;

import io.opentelemetry.api.baggage.propagation.W3CBaggagePropagator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePageLocators {

    @FindBy(id = "checkout_complete_container")
    public WebElement checkoutCompletePage;

    @FindBy(className = "complete-text")
    public WebElement completeDescription;

    @FindBy(id = "back-to-products")
    public WebElement backHomeButton;

    @FindBy(className = "complete-header")
    public WebElement titleOrderCompleted;


}
