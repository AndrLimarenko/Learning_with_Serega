import Base.BasePage;
import Base.BaseTest;
import Pages.LoginPage;
import Pages.MainPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test
public class LoginPageTest extends BaseTest {

    private MainPage mainPage;
    private BasePage basePage;
    private final String URL = "http://the-internet.herokuapp.com/";
    private final String SUBPAGE_NAME = "Form Authentication";
    private final String EMAIL = "testemail@email.com";


    public void checkLogin() {
        mainPage = new MainPage(getDriver());
        basePage = new BasePage();
        basePage.openUrl(URL);
        mainPage.openSubPage(SUBPAGE_NAME);

        assertEquals("Login Page", LoginPage.getH3Title());
        LoginPage.login("incorrectname", "incorrectpass");
        assertEquals("Your username is invalid!\n" +
                "×", LoginPage.getText(LoginPage.ALERT_MESSAGE));
        LoginPage.login("tomsmith", "SuperSecretPassword!");
        assertEquals("You logged into a secure area!\n" +
                "×", LoginPage.getText(LoginPage.ALERT_MESSAGE));
        LoginPage.logout();
        assertEquals("You logged out of the secure area!\n" +
                "×", LoginPage.getText(LoginPage.ALERT_MESSAGE));
    }
}

