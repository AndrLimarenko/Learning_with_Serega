package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static Base.BaseTest.getDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class BasePage {
    private static final int timeWaiter=10;
    public static WebDriver driver;

    public BasePage() {
        driver = BaseTest.getDriver();;
    }

    public static WebDriverWait getWait() {
        return getWait(1);
    }

    public static WebDriverWait getWait(int multiplier) {
        return new WebDriverWait(getDriver(), timeWaiter * multiplier);
    }

    public void clickOnMenuOption(By menuElementLocator, String option) {
        Select select = new Select(driver.findElement(menuElementLocator));
        select.selectByVisibleText(option);
    }
    public void openUrl(String URL) {
        driver.get(URL);
    }

    public void selectCheckbox(By locator) {
        driver.findElement(locator).click();
    }

    public void sendKeys(By element, String string) {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(element));
        driver.findElement(element).sendKeys(string);
    }

    public By getLocator(String elementLocatorTemplate, String dynamicLocatorParts) {
        return By.xpath(String.format(elementLocatorTemplate, dynamicLocatorParts));
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public Boolean isElementPresented(By element){
        try {
            getWait().until(ExpectedConditions.visibilityOfElementLocated(element));
            getDriver().findElement(element).isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public String getText (By locator){
        return getDriver().findElement(locator).getText();
    }


}