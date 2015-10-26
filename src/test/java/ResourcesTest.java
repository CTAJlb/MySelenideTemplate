import base.TestBase;
import com.codeborne.selenide.testng.BrowserPerTest;
import com.codeborne.selenide.testng.ScreenShooter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.Header;
import pages.ResourcesPage;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

@Listeners({ScreenShooter.class, BrowserPerTest.class})
public class ResourcesTest extends TestBase {


    @Features("Resources page")
    @Stories("Check the preview resources")
    @Test
    public void checkPreviewContent()
    {
        Header.goToResourcesPage();
        ResourcesPage.checkPreviewResources();
    }
}
