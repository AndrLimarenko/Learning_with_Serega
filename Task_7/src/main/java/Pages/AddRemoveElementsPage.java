package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemoveElementsPage extends BasePage {
    public static WebDriver driver;

    @FindBy(xpath = "//h3")
    public static WebElement h3CheckboxesTitle;

    public static final By ADD_ELEMENT_BUTTON = By.xpath("//button[.='Add Element']");
    public static final By DELETE_BUTTON = By.xpath("//button[.='Delete']");

    public AddRemoveElementsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public static String getH3Title() {
        return h3CheckboxesTitle.getText();
    }

    public Boolean isDeleteButtonPresented() {
        return isElementPresented(DELETE_BUTTON);
    }

}
