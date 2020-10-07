package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThat;

public class PurchasePage extends PageObject {

    @FindBy(css = "h2")
    private WebElement confirmationText;

    @FindBy(css = ".container p:nth-of-type(3)")
    private WebElement flightPrice;

    public void checkIfFlightIsReserved() {
        assertEquals("Confirmation message is not displayed",
                confirmationText.getText(),
                "Your flight from TLV to SFO has been reserved."
        );
    }

    public void checkIfFlightPriceAreTheSame(String price) {
        assertEquals("Prices are not equal",price, getParsedPrice());
    }

    private String getParsedPrice() {
        return flightPrice.getText().split("\\s+")[1];
    }
}
