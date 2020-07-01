import Base.BasePage;
import Base.BaseTest;
import Pages.BrokenImagesPage;
import Pages.LoginPage;
import Pages.MainPage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class BrokenImagesTest extends BaseTest {

    private MainPage mainPage;
    private BasePage basePage;
    private final String URL = "http://the-internet.herokuapp.com/";
    private final String SUBPAGE_NAME = "Broken Images";
    private final String EMAIL = "testemail@email.com";


    public void checkLogin(){
        mainPage = new MainPage(getDriver());
        basePage = new BasePage();
        basePage.openUrl(URL);
        mainPage.openSubPage(SUBPAGE_NAME);

        assertEquals("Broken Images", BrokenImagesPage.getH3Title());
                                assertFalse(BrokenImagesPage.isImageNotBroken("1"));
        basePage.openUrl(URL);
        mainPage.openSubPage(SUBPAGE_NAME);
        assertFalse(BrokenImagesPage.isImageNotBroken("2"));
        basePage.openUrl(URL);
        mainPage.openSubPage(SUBPAGE_NAME);
        assertTrue(BrokenImagesPage.isImageNotBroken("3"));
    }
}

