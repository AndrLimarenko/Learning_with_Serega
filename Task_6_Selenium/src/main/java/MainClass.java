import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
    private static final By SEARCH_INPUT_FORM = By.xpath("//input[@title='Search']");
    private static final By ENGLISH_LINK = By.linkText("English");
    private static final By SUBMIT_BUTTON = By.xpath("//input[@aria-label='Google Search']");
    private static final By LINKS_IN_SEARCH_RESULTS = By.xpath("//h3[contains(text(),'Hello, World')]");
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Idiaprojects\\Task_6\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(ENGLISH_LINK).click();
        driver.findElement(SEARCH_INPUT_FORM).sendKeys("HELLO WORLD!!!");
        Thread.sleep(1000);
        driver.findElement(SUBMIT_BUTTON).click();
        driver.findElement(LINKS_IN_SEARCH_RESULTS).click();

    }
}
