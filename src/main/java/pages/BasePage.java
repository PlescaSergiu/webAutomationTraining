package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

public class BasePage extends PageObject {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void openPage(String url) {

        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }


    public WebElement fluentWaitForElement(WebElement element, int timeoutSec, int pollingMilliSec) {
        Function<WebElement, Boolean> elementVisibleAndEnabled = elem -> elem.isDisplayed() && elem.isEnabled();
        new FluentWait<>(element)
                .withTimeout(Duration.ofSeconds(timeoutSec))
                .pollingEvery(Duration.ofMillis(pollingMilliSec))
                .ignoring(NoSuchElementException.class, TimeoutException.class)
                .ignoring(StaleElementReferenceException.class)
                .until(elementVisibleAndEnabled);
        return element;
    }

    public void waitForAllListElements(List elements) {
        Function<List, Boolean> multipleElements = elem -> elem.size() >= elements.size();
        new FluentWait<>(elements)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class, TimeoutException.class)
                .ignoring(StaleElementReferenceException.class).until(multipleElements);
    }

    public void waitForAllListElements(By selector) {
        Function<By, Boolean> multipleElementsBy = (By by) -> getDriver().findElements(by).size() >= 1;
        new FluentWait<>(selector)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(250))
                .ignoring(NoSuchElementException.class, TimeoutException.class)
                .ignoring(StaleElementReferenceException.class).until(multipleElementsBy);
    }



}
