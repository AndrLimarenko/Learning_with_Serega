package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class FileUploaderPage extends BasePage {
    public static WebDriver driver;

    @FindBy(xpath = "//h3")
    public static WebElement h3CheckboxesTitle;

    public static final By SELECT_FILE_BUTTON = By.id("file-upload");
    public static final By UPLOAD_FILE_BUTTON = By.id("file-submit");
    public static final By UPLOADED_FILE = By.id("uploaded-files");
    public static final By SUCESS_TEXT = By.xpath("//div[@id='content']");

    public FileUploaderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public static String getH3Title() {
        return h3CheckboxesTitle.getText();
    }

    public static void uploadFIle(){
        File file = new File("C:\\Users\\User\\Desktop\\resumes\\notParsable.pdf");
        driver.findElement(SELECT_FILE_BUTTON).sendKeys(file.getAbsolutePath());
        driver.findElement(UPLOAD_FILE_BUTTON).click();
    }

}
