package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.FlightsTableSteps;
import steps.HomepageSteps;
import steps.PurchaseFlightSteps;

public class Test003 extends BaseTest{

    @Steps
    private HomepageSteps homepageSteps;

    @Steps
    private FlightsTableSteps flightsTableSteps;

    @Steps
    private PurchaseFlightSteps purchaseFlightSteps;


    @Test
    @Title("Purchase Virgin America flight")
    public void testIfFlightPurchaseIsSuccessful() {
        flightsTableSteps.open();
        flightsTableSteps.assertFlightsTableIsDisplayed();
        flightsTableSteps.clickOnVirginAmericaFlight();
        purchaseFlightSteps.checkIfFlightIsReserved();
    }
}
