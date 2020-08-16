package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {
    public WebDriver driver;
    public static final By EBAY_DAILY_DEALS_LINK = By.linkText("Daily Deals");



    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public EbayDailyDealsPage openEbayDailyDealsPage(){
        click(EBAY_DAILY_DEALS_LINK);
        return new EbayDailyDealsPage(driver);
    }
}

