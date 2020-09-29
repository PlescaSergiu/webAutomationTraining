package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.openqa.selenium.WebDriver;
import steps.FlightsTableSteps;
import steps.HomepageSteps;
import steps.PurchasePageSteps;

import static org.junit.Assert.assertEquals;

@RunWith(SerenityRunner.class)
public class Test001 {

    @Managed(driver = "Chrome")
    public WebDriver webDriver;

    @Steps
    private HomepageSteps homepageSteps;

    @Steps
    private FlightsTableSteps flightsTableSteps;

    @Steps
    private PurchasePageSteps purchasePageSteps;


    @Test
    @Title("Click on the Find Flights button")
    public void test1() {
        homepageSteps.open();
        homepageSteps.clickOnFindFlightsButton();
        flightsTableSteps.assertFlightsTableIsDisplayed();
    }

    @Test
    @Title("click on choose flight btn")
    public void clickOnChooseFlightBtn() {
        homepageSteps.open();
        homepageSteps.clickOnFindFlightsButton();
        flightsTableSteps.clickOnChooseFlightBtn();
        purchasePageSteps.verifyTitle("Your flight from");
    }

    @Test
    @Title("Verify that the price on the reservation page corresponds to the price displayed in the flights table")
    public void checkIfPriceFromReservationPageIsSameAsItInFlightsTable() {
        homepageSteps.open();
        homepageSteps.clickOnFindFlightsButton();
        String price = flightsTableSteps.getFlightPrice();
        flightsTableSteps.clickOnChooseFlightBtn();
        String price2 = purchasePageSteps.getFlightPrice();
        assertEquals(price, price2);

    }

}
