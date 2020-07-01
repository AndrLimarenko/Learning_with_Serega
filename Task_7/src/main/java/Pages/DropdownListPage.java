package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.sql.Driver;

public class DropdownListPage extends BasePage {
    public static WebDriver driver;
    @FindBy(xpath = "//h3")
    public static WebElement h3PageTitle;

    @FindBy(xpath = "//option[.='Option 2']")
    public static WebElement SELECTED_DROPDOWN_OPTION;

    public static final By DROPDOWN_ELEMENT = By.xpath("//select[@id='dropdown']");
    public static final String SECOND_DROPDOWN_TEXT_OPTION = "Option 2";

    public DropdownListPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public static String getH3Title() {
        return h3PageTitle.getText();
    }

    public static Boolean isCorrectValueSelected(){
        Boolean status = !SELECTED_DROPDOWN_OPTION.getAttribute("selected").isEmpty();
        return status;
    }
}
