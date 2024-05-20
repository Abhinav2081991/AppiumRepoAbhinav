package AppiumTests;

import com.google.common.annotations.VisibleForTesting;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class FirstAppiumTest extends BaseTest{



//    @Test(enabled = false)
//    public void firstTest() throws MalformedURLException {
//
//        UiAutomator2Options options = new UiAutomator2Options();
//        options.setDeviceName("AbhinavEmulator2");
//        options.setApp(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\ApiDemos-debug.apk");
//        System.out.println(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\ApiDemos-debug.apk");
//        AndroidDriver driver  = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
//        driver.quit();
//
//    }


    @Test(enabled = true)
    public void firstTestByStartingAppiumServer() throws MalformedURLException {

        driver.findElement(AppiumBy.accessibilityId("Preference")).click();

    }

}
