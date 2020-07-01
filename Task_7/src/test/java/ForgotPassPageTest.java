import Base.BasePage;
import Base.BaseTest;
import Pages.ForgotPassPage;
import Pages.MainPage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class ForgotPassPageTest extends BaseTest {

    private MainPage mainPage;
    private BasePage basePage;
    private final String URL = "http://the-internet.herokuapp.com/";
    private final String SUBPAGE_NAME = "Forgot Password";
    private final String EMAIL = "testemail@email.com";


    public void checkForgorPass() {
        mainPage = new MainPage(getDriver());
        basePage = new BasePage();
        basePage.openUrl(URL);
        mainPage.openSubPage(SUBPAGE_NAME);

        assertEquals("Forgot Password", ForgotPassPage.getH3Title());
        basePage.sendKeys(ForgotPassPage.FORGOT_PASS_INPUT, EMAIL);
        basePage.click(ForgotPassPage.FORGOT_PASS_BUTTON);
        assertEquals("Your e-mail's been sent!", BasePage.getText(ForgotPassPage.SUCESS_TEXT));
    }
}

