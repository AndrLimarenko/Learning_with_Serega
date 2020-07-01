import Base.BasePage;
import Base.BaseTest;
import Pages.AddRemoveElementsPage;
import Pages.HoversPage;
import Pages.MainPage;
import org.testng.annotations.Test;

import java.awt.*;

import static org.testng.Assert.*;

@Test
public class HoversPageTest extends BaseTest {

    private MainPage mainPage;
    private BasePage basePage;
    private final String URL = "http://the-internet.herokuapp.com/";
    private final String SUBPAGE_NAME = "Hovers";


    public void checkHoverMouse() throws AWTException, InterruptedException {
        mainPage = new MainPage(getDriver());
        basePage = new BasePage();
        basePage.openUrl(URL);
        mainPage.openSubPage(SUBPAGE_NAME);

        assertEquals("Hovers", HoversPage.getH3Title());
        HoversPage.moveMouseToTheTop("2");
//     не пашет тест. Надо разбираться
    }
}

