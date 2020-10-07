package tests;


import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import steps.FlightsTableSteps;
import steps.HomepageSteps;
import steps.PurchaseFlightSteps;

public class Test004 extends BaseTest{

    @Steps
    private HomepageSteps homepageSteps;

    @Steps
    private FlightsTableSteps flightsTableSteps;

    @Steps
    private PurchaseFlightSteps purchaseFlightSteps;


    @Test
    @Title("Verify that the price on the reservation page corresponds to the price displayed in the flights table")
    public void testPrice() {
        flightsTableSteps.open();
        flightsTableSteps.rememberVirginAmericaFlightPrice();
        flightsTableSteps.clickOnVirginAmericaFlight();
        purchaseFlightSteps.checkIfFlightPriceAreTheSame(flightsTableSteps.getVirginAmericaPriceValue());
    }
}
