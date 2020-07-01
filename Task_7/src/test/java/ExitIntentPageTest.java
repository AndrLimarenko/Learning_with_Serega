import Base.BasePage;
import Base.BaseTest;
import Pages.AddRemoveElementsPage;
import Pages.ExitIntentPage;
import Pages.MainPage;
import org.testng.annotations.Test;

import java.awt.*;

import static org.testng.Assert.*;

@Test
public class ExitIntentPageTest extends BaseTest {

    private MainPage mainPage;
    private BasePage basePage;
    private final String URL = "http://the-internet.herokuapp.com/";
    private final String SUBPAGE_NAME = "Exit Intent";
    private final String MODAL_TITLE = "Exit Intent";


    public void checkMoveCoursorOutOfBorder() throws InterruptedException, AWTException {
        mainPage = new MainPage(getDriver());
        basePage = new BasePage();
        basePage.openUrl(URL);
        mainPage.openSubPage(SUBPAGE_NAME);

        assertEquals("Exit Intent", ExitIntentPage.getH3Title());
        ExitIntentPage.moveMouseToTheTop();
        assertEquals("It's commonly used to encourage a user to take an action (e.g., give their e-mail address to sign up for something).", BasePage.getText(ExitIntentPage.MODAL_TEXT));
        mainPage.click(ExitIntentPage.CLOSE_BUTTON);
    }
}

