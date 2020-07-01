package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class ExitIntentPage extends BasePage {
    public static WebDriver driver;

    @FindBy(xpath = "//h3")
    public static WebElement h3CheckboxesTitle;
    public static final By MODAL_TEXT = By.xpath("//div[@class='modal-body']/p");
    public static final By CLOSE_BUTTON = By.xpath("//p[.='Close']");


    public ExitIntentPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public static String getH3Title() {
        return h3CheckboxesTitle.getText();
    }

    public static void moveMouseToTheTop() throws InterruptedException, AWTException {
        Robot robot = new Robot();
        robot.mouseMove(800,300);
        robot.mouseMove(1,1);
    }
}
