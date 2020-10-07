package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.FlightsTablePage;

public class FlightsTableSteps extends ScenarioSteps {

    private FlightsTablePage flightsTablePage;

    @Step
    public void open() {
        flightsTablePage.open();
    }

    @Step("Click on Virgin America flight button")
    public void clickOnVirginAmericaFlight() {
        flightsTablePage.clickOnVirginAmericaFlight();
    }

    @Step("Assert that the flights table is displayed")
    public void assertFlightsTableIsDisplayed() {
        flightsTablePage.assertFlightsTableIsDisplayed();
    }

    @Step("Assert that the flights table is displayed")
    public void failedAssertFlightsTableIsDisplayed() {
        flightsTablePage.failedAssertFlightsTableIsDisplayed();
    }

    @Step("Remember america virgin price")
    public void rememberVirginAmericaFlightPrice() {
        flightsTablePage.rememberVirginAmericaFlightPrice();
    }

    @Step("Get america virgin price")
    public String getVirginAmericaPriceValue() {
       return flightsTablePage.getVirginAmericaPriceValue();
    }
}
