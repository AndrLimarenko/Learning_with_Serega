import Base.BasePage;
import Base.BaseTest;
import Pages.FileUploaderPage;
import Pages.ForgotPassPage;
import Pages.MainPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test
public class FileUploaderPageTest extends BaseTest {

    private MainPage mainPage;
    private BasePage basePage;
    private final String URL = "http://the-internet.herokuapp.com/";
    private final String SUBPAGE_NAME = "File Upload";
    private final String EMAIL = "testemail@email.com";


    public void checkFileUpload() {
        mainPage = new MainPage(getDriver());
        basePage = new BasePage();
        basePage.openUrl(URL);
        mainPage.openSubPage(SUBPAGE_NAME);

        assertEquals("File Uploader", FileUploaderPage.getH3Title());
        FileUploaderPage.uploadFIle();
        assertEquals("File Uploaded!", FileUploaderPage.getH3Title());
        assertEquals("notParsable.pdf", BasePage.getText(FileUploaderPage.UPLOADED_FILE));
    }
}

