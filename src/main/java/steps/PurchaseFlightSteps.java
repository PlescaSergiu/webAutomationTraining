package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.PurchasePage;

public class PurchaseFlightSteps extends ScenarioSteps {

    private PurchasePage purchasePage;

    @Step("Check reservation")
    public void checkIfFlightIsReserved() {
        purchasePage.checkIfFlightIsReserved();
    }

    @Step("Verify if prices are the same")
    public void checkIfFlightPriceAreTheSame(String price) {
        purchasePage.checkIfFlightPriceAreTheSame(price);
    }

}
