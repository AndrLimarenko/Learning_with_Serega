package Pages;

import Base.BasePage;
import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class EbayDailyDealsPage extends BasePage {
    public static final By PRICE = By.xpath("//span[@itemprop='price']");
    public static WebDriver driver;

    public EbayDailyDealsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        EbayDailyDealsPage.driver = driver;
    }

    public void calculateProducts(){
        double sum=0;
        List<WebElement> inventoryItems = driver.findElements(PRICE);
        List<Float> lower20 = new ArrayList<>();
        for (WebElement inventoryItem : inventoryItems) {
            String value = inventoryItem.getText();
            value=value.substring(4);
            String formattedValue= value.replace(",", "");
            float price = Float.parseFloat(formattedValue);
                        if (price <= 20.0) {
                sum=sum+price;
                            lower20.add(price);
            }
        }
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Total products with price <= 20$: "+lower20.size());
        System.out.println("Price SUM is : "+ df.format(sum));
    }
}
