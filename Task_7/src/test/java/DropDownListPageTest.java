import Base.BasePage;
import Base.BaseTest;
import Pages.DropdownListPage;
import Pages.MainPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Test
public class DropDownListPageTest extends BaseTest {

    private MainPage mainPage;
    private BasePage basePage;
    private final String URL = "http://the-internet.herokuapp.com/";
    private final String SUBPAGE_NAME = "Dropdown";

    public void checkDropdownList() {
        mainPage = new MainPage(getDriver());
        basePage = new BasePage();
        basePage.openUrl(URL);
        mainPage.openSubPage(SUBPAGE_NAME);

        assertEquals("Dropdown List", DropdownListPage.getH3Title());
        basePage.clickOnMenuOption(DropdownListPage.DROPDOWN_ELEMENT, DropdownListPage.SECOND_DROPDOWN_TEXT_OPTION);
        assertTrue(DropdownListPage.isCorrectValueSelected());
    }
}
