import Base.BasePage;
import Base.BaseTest;
import Pages.AddRemoveElementsPage;
import Pages.BasicAuthPage;
import Pages.MainPage;
import org.testng.annotations.Test;

import java.security.PublicKey;

import static org.testng.Assert.*;

@Test
public class BasicAuthPageTest extends BaseTest {

    private MainPage mainPage;
    private BasePage basePage;
    private BasicAuthPageTest basicAuthPage;
    private final String URL = "http://the-internet.herokuapp.com/";
    private final String SUBPAGE_NAME = "Basic Auth";



    public void checkBasicAuth(){
        mainPage = new MainPage(getDriver());
        basePage = new BasePage();
        basePage.openUrl(BasicAuthPage.getAuthURL());
//        assertEquals("Basic Auth", BasicAuthPage.getH3Title());
        assertEquals("Congratulations! You must have the proper credentials.", BasePage.getText(BasicAuthPage.CONGRAT_TEXT));

    }



}

