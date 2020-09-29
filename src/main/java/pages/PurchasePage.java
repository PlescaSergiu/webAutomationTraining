package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class PurchasePage extends PageObject {


    @FindBy(css = "h2")
    private WebElement reservationPageText;

    @FindBy(css = "p:nth-child(4)")
    private WebElement getFlightPrice;


    public String getTitle(){
        return reservationPageText.getText();
    }

    public String getFlightPrice() {
        return getFlightPrice.getText();
    }
}
