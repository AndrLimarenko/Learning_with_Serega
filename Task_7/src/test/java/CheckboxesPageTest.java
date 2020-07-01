import Base.BasePage;
import Base.BaseTest;
import Pages.CheckboxesPage;
import Pages.MainPage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class CheckboxesPageTest extends BaseTest {

    private MainPage mainPage;
    private BasePage basePage;
    private final String URL = "http://the-internet.herokuapp.com/";
    private final String SUBPAGE_NAME = "Checkboxes";


    public void selectCheckboxes() {
        mainPage = new MainPage(getDriver());
        basePage = new BasePage();
        basePage.openUrl(URL);
        mainPage.openSubPage(SUBPAGE_NAME);

        assertEquals(SUBPAGE_NAME, CheckboxesPage.getH3Title());
        assertFalse(CheckboxesPage.isCheckBoxSelected("1"));
        assertTrue(CheckboxesPage.isCheckBoxSelected("2"));
        basePage.selectCheckbox(CheckboxesPage.CHECKBOX1);
        basePage.selectCheckbox(CheckboxesPage.CHECKBOX2);
        assertFalse(CheckboxesPage.isCheckBoxSelected("2"));
        assertTrue(CheckboxesPage.isCheckBoxSelected("1"));
    }
}
