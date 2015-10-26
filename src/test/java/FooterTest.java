import base.TestBase;
import com.codeborne.selenide.testng.BrowserPerTest;
import com.codeborne.selenide.testng.ScreenShooter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.Footer;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

@Listeners({ScreenShooter.class, BrowserPerTest.class})
public class FooterTest extends TestBase {

    @Features("Footer")
    @Stories("Check the links on social networks")
    @Test
    public void check()
    {
        Footer.checkLinksInFooter();
    }
}
