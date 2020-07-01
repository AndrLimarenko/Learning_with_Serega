package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassPage extends BasePage {
    public static WebDriver driver;

    @FindBy(xpath = "//h2")
    public static WebElement h3CheckboxesTitle;

    public static final By FORGOT_PASS_BUTTON = By.id("form_submit");
    public static final By FORGOT_PASS_INPUT = By.id("email");
    public static final By SUCESS_TEXT = By.xpath("//div[@id='content']");

    public ForgotPassPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public static String getH3Title() {
        return h3CheckboxesTitle.getText();
    }

}
