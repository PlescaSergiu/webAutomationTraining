package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.HomepagePage;

public class HomepageSteps extends ScenarioSteps {

	private HomepagePage homepagePage;

	@Step("Open website")
	public void open(){
		homepagePage.open();
	}

	@Step("Click on Find Flights button")
	public void clickOnFindFlightsButton(){
		homepagePage.clickOnFindFlightsButton();
	}


}
