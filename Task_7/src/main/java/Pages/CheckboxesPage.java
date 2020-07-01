package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxesPage extends BasePage {
    public static WebDriver driver;

    @FindBy(xpath = "//h3")
    public static WebElement h3CheckboxesTitle;

    public static final By CHECKBOX1 = By.xpath("//form/input[1]");
    public static final By CHECKBOX2 = By.xpath("//form/input[2]");
    public static final String CHECKBOX_LOCATOR = "//form/input[%s]";

    public CheckboxesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public static String getH3Title() {
        return h3CheckboxesTitle.getText();
    }

    public static Boolean isCheckBoxSelected(String number){
        Boolean status = driver.findElement(getLocator(CHECKBOX_LOCATOR, number)).isSelected();
        return status;
    }

}
