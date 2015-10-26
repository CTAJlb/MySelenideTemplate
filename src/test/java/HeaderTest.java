import base.TestBase;
import com.codeborne.selenide.testng.BrowserPerTest;
import com.codeborne.selenide.testng.ScreenShooter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.Header;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

@Listeners({ScreenShooter.class, BrowserPerTest.class})
public class HeaderTest extends TestBase {


    @Features("Header")
    @Stories("Check the transition to pages (Header): Company,Services, Technologies, Approach, Blog, Contact Us")
    @Test
    public void checkOpenedPagesMainMenu()
    {
        Header.checkExpectedElements();
        Header.checkOpenedPagesInHeader();
    }
}
