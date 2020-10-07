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

@RunWith(SerenityRunner.class)
public class Test002  {

    @Managed(driver = "Chrome")
    public WebDriver webDriver;

    @Steps
    private HomepageSteps homepageSteps;

    @Steps
    private FlightsTableSteps flightsTableSteps;


    @Test
    @Title("Click on the Find Flights button")
    public void test1() {
        homepageSteps.open();
        homepageSteps.clickOnFindFlightsButton();
        flightsTableSteps.failedAssertFlightsTableIsDisplayed();
    }
}
