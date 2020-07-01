package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {
    public WebDriver driver;
    public static final String SUBPAGE_LOCATOR = "//a[.='%s']";


    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public BasePage openSubPage(String subPage) {
        switch (subPage) {
            case "Dropdown": {
                click(getLocator(SUBPAGE_LOCATOR, subPage));
                return new DropdownListPage(driver);
            }
            case "Checkboxes": {
                click(getLocator(SUBPAGE_LOCATOR, subPage));
                return new CheckboxesPage(driver);
            }
            case "Add/Remove Elements": {
                click(getLocator(SUBPAGE_LOCATOR, subPage));
                return new AddRemoveElementsPage(driver);
            }
            case "Exit Intent": {
                click(getLocator(SUBPAGE_LOCATOR, subPage));
                return new ExitIntentPage(driver);
            }
            case "Forgot Password": {
                click(getLocator(SUBPAGE_LOCATOR, subPage));
                return new ForgotPassPage(driver);
            }
            case "Hovers": {
                click(getLocator(SUBPAGE_LOCATOR, subPage));
                return new HoversPage(driver);
            }
            case "File Upload": {
                click(getLocator(SUBPAGE_LOCATOR, subPage));
                return new FileUploaderPage(driver);
            }
            case "Form Authentication": {
                click(getLocator(SUBPAGE_LOCATOR, subPage));
                return new LoginPage(driver);
            }
            case "Broken Images": {
                click(getLocator(SUBPAGE_LOCATOR, subPage));
                return new BrokenImagesPage(driver);
            }
            default:
                throw new IllegalStateException("No links are found for this subpage: " + subPage);
        }
    }

}

