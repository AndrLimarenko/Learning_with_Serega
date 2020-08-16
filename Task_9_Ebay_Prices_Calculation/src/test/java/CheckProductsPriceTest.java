import Base.BasePage;
import Base.BaseTest;
import Pages.*;
import org.testng.annotations.Test;



@Test
public class CheckProductsPriceTest extends BaseTest {

    private final String URL = "https://www.ebay.com/";

    public void checkProductsLess20() {
        MainPage mainPage = new MainPage(getDriver());
        BasePage basePage = new BasePage();
        basePage.openUrl(URL);

EbayDailyDealsPage ebayDailyDealsPage = mainPage.openEbayDailyDealsPage();
ebayDailyDealsPage.calculateProducts();
    }
}
