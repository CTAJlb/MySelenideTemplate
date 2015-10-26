import base.TestBase;
import com.codeborne.selenide.testng.BrowserPerTest;
import com.codeborne.selenide.testng.ScreenShooter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.GetQuotePage;
import pages.Header;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

@Listeners({ScreenShooter.class, BrowserPerTest.class})
public class GetQuoteTest extends TestBase {

    @Features("GetQuote page")
    @Stories("Check error messages")
    @Test
    public void checkGetInTouchValidation_()
    {
        Header.goToGetQuotePage();
        GetQuotePage.checkExpectedElements();
        GetQuotePage.submitWithEmptyFields();
        GetQuotePage.verifyErrorMessages();
    }
}
