package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class HoversPage extends BasePage {
    public static WebDriver driver;

    @FindBy(xpath = "//h3")
    public static WebElement h3CheckboxesTitle;
    public static final By MODAL_TEXT = By.xpath("//div[@class='modal-body']/p");
    public static final By CLOSE_BUTTON = By.xpath("//p[.='Close']");
    public static final String VIEW_PROFILE_LINK = "//div[%s]/img";
    public static final String USERS_PROFILE = "//div[@class='figure']/div/a[@href='/users/2']";

    public HoversPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public static String getH3Title() {
        return h3CheckboxesTitle.getText();
    }

    public void openProfile (String number) {
                click(getLocator(VIEW_PROFILE_LINK, number));
            }

    public static void moveMouseToTheTop(String profileName) throws InterruptedException, AWTException {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(getLocator(VIEW_PROFILE_LINK, profileName)));
        Thread.sleep(2500);
    }
}
