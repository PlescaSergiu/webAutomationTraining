package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class FlightsTablePage extends PageObject {

    @FindBy(css = ".container .table")
    private WebElement flightsTable;

    @FindBy(css = "tr:nth-child(1) .btn")
    private WebElement chooseFlightBtn;


    @FindBy(css = "tr:nth-child(1) > td:nth-child(7)")
    private WebElement flightPrice;

    public void assertFlightsTableIsDisplayed() {
        Assert.assertTrue(flightsTable.isDisplayed());
    }

    public void failedAssertFlightsTableIsDisplayed() {
        Assert.assertTrue(!flightsTable.isDisplayed());
    }

    public void clickOnChooseFlightBtn(){
        chooseFlightBtn.click();
    }

    public String getFlightPrice(){
        return flightPrice.getText();
    }

}
