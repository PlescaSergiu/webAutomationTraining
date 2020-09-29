package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import pages.FlightsTablePage;

public class FlightsTableSteps extends ScenarioSteps {

    private FlightsTablePage flightsTablePage;

    @Step("Assert that the flights table is displayed")
    public void assertFlightsTableIsDisplayed() {
        flightsTablePage.assertFlightsTableIsDisplayed();
    }

    @Step("Assert that the flights table is displayed")
    public void failedAssertFlightsTableIsDisplayed() {
        flightsTablePage.failedAssertFlightsTableIsDisplayed();
    }

    @Step("Click on choose flight button")
    public void clickOnChooseFlightBtn(){
        flightsTablePage.clickOnChooseFlightBtn();
    }

    @Step("Get Flight Price")
    public String getFlightPrice() {
        return flightsTablePage.getFlightPrice();
    }
}
