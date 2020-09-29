package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PurchasePage extends BasePage {

    @FindBy(css = "h2")
    private WebElement reservationPageText;

    @FindBy(css = "p:nth-child(4)")
    private WebElement getFlightPrice;

    public PurchasePage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return reservationPageText.getText();
    }

    public String getFlightPrice() {
        return getFlightPrice.getText();
    }
}
