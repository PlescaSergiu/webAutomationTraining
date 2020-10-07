package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

@DefaultUrl("/reserve.php")
public class FlightsTablePage extends PageObject {

    @FindBy(css = ".container .table")
    private WebElement flightsTable;

    @FindBy(css = "tr:nth-child(1) .btn")
    private WebElement virginAmericaFlight;

    @FindBy(css = "tr:first-child td:nth-child(7)")
    private WebElement virginAmericaFlightPrice;

    private String priceValueVirginAmerica;

    public void clickOnVirginAmericaFlight() {
        virginAmericaFlight.click();
    }

    public void assertFlightsTableIsDisplayed() {
        Assert.assertTrue(flightsTable.isDisplayed());
    }

    public void failedAssertFlightsTableIsDisplayed() {
        Assert.assertTrue(!flightsTable.isDisplayed());
    }

    public void rememberVirginAmericaFlightPrice() {
        priceValueVirginAmerica = virginAmericaFlightPrice.getText().substring(1);
    }

    public String getVirginAmericaPriceValue() {
        return this.priceValueVirginAmerica;
    }
}
