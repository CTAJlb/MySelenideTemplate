import base.TestBase;
import com.codeborne.selenide.testng.BrowserPerTest;
import com.codeborne.selenide.testng.ScreenShooter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.Header;
import pages.OurApproachPage;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

@Listeners({ScreenShooter.class, BrowserPerTest.class})
public class OurApproachTest extends TestBase {


    @Features("OurApproach page")
    @Stories("Check the download of PDF file")
    @Test
    public void checkDownloadPdfFile()
    {
        Header.goToOurApproachPage();
        OurApproachPage.checkExpectedElements();
        OurApproachPage.downloadPDF();
    }
}
