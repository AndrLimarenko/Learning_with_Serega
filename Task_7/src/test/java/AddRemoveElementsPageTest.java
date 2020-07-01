import Base.BasePage;
import Base.BaseTest;
import Pages.AddRemoveElementsPage;
import Pages.MainPage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class AddRemoveElementsPageTest extends BaseTest {

    private MainPage mainPage;
    private BasePage basePage;
    private final String URL = "http://the-internet.herokuapp.com/";
    private final String SUBPAGE_NAME = "Add/Remove Elements";


    public void checkAddRemoveElements(){
        mainPage = new MainPage(getDriver());
        basePage = new BasePage();
        basePage.openUrl(URL);
        mainPage.openSubPage(SUBPAGE_NAME);

        assertEquals("Add/Remove Elements", AddRemoveElementsPage.getH3Title());
        assertFalse(basePage.isElementPresented(AddRemoveElementsPage.DELETE_BUTTON), "Element is displayed:");
        basePage.click(AddRemoveElementsPage.ADD_ELEMENT_BUTTON);
        assertTrue(basePage.isElementPresented(AddRemoveElementsPage.DELETE_BUTTON),"Element is absent:" );
        basePage.click(AddRemoveElementsPage.DELETE_BUTTON);
        assertFalse(basePage.isElementPresented(AddRemoveElementsPage.DELETE_BUTTON), "Element is displayed:");
    }
}

