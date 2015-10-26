import base.TestBase;
import com.codeborne.selenide.testng.BrowserPerTest;
import com.codeborne.selenide.testng.ScreenShooter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.Header;
import pages.NewsPage;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

@Listeners({ScreenShooter.class, BrowserPerTest.class})
public class NewsTest extends TestBase {

    @Features("News page")
    @Stories("Check the sequence of dates")
    @Test
    public void checkSequenceDate()
    {
        Header.goToNewsPage();
        NewsPage.verifySequenceDate();
    }
}
