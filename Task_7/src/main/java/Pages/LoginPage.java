package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class LoginPage extends BasePage {
    public static WebDriver driver;

    @FindBy(xpath = "//h2")
    public static WebElement h3CheckboxesTitle;

    public static final By USERNAME_INPUT = By.id("username");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By LOGIN_BUTTON = By.xpath("//button[@type='submit']");
    public static final By LOGOUT_BUTTON = By.xpath("//i[.=' Logout']");
    public static final By ALERT_MESSAGE = By.xpath("//div[@id='flash']");

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public static String getH3Title() {
        return h3CheckboxesTitle.getText();
    }

    public static void login(String name, String pass){
        driver.findElement(USERNAME_INPUT).sendKeys(name);
        driver.findElement(PASSWORD_INPUT).sendKeys(pass);
        driver.findElement(LOGIN_BUTTON).click();
    }

    public static void logout(){
        driver.findElement(LOGOUT_BUTTON).click();
    }

}
