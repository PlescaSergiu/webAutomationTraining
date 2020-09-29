package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import pages.PurchasePage;




public class PurchasePageSteps extends ScenarioSteps {


    private PurchasePage purchasePage;

    private FlightsTableSteps flightsTableSteps;

    @Step
    public void verifyTitle(String title) {
        assert (purchasePage.getTitle().contains(title));
    }

    @Step("Get flight from purchase page")
    public String getFlightPrice(){
       return purchasePage.getFlightPrice();
    }

}
