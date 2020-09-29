package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;

public class HomepagePage extends BasePage {

    @FindBy(css = "input")
    private WebElement findFlightsButton;

    public HomepagePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnFindFlightsButton() {
        findFlightsButton.click();
    }

}
