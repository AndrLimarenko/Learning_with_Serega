package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.URL;

public class BasicAuthPage extends BasePage {
    public static WebDriver driver;
    @FindBy(xpath = "//h3")

    public static WebElement h3CheckboxesTitle;
    public static final String BASE_URL = "http://the-internet.herokuapp.com/";
    private static final String LOGIN = "admin";
    private static final String PASSWORD = "admin";
    public static final By CONGRAT_TEXT = By.xpath("//p");

    public BasicAuthPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public static String getH3Title() {
        return h3CheckboxesTitle.getText();
    }

    public static String getAuthURL(){
        String newUrl = BASE_URL.replaceAll("http://", "http://"+LOGIN+":"+PASSWORD+"@")+"/basic_auth";
        System.out.println(newUrl);
        return newUrl;
    }
}
