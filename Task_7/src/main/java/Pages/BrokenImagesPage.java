package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrokenImagesPage extends BasePage {
    public static WebDriver driver;

    @FindBy(xpath = "//h3")
    public static WebElement h3CheckboxesTitle;

    public static String IMAGE_LINK = "//div/img[%s]";

    public static final By NOT_FOUND = By.xpath("//h1");

    public BrokenImagesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public static String getH3Title() {
        return h3CheckboxesTitle.getText();
    }

    public static boolean isImageNotBroken(String imageName){
        driver.get(driver.findElement(getLocator(IMAGE_LINK, imageName)).getAttribute("src"));
if (driver.findElements(NOT_FOUND).isEmpty())
        return true;
else
    return false;
    }
}
