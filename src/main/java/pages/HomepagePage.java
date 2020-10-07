package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class HomepagePage extends PageObject {

    @FindBy(css = "input")
    private WebElement findFlightsButton;

    public void clickOnFindFlightsButton() {
        findFlightsButton.click();
    }

}
