package base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import utils.Consts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Setup {
    public AndroidDriver<?> driver;


    @BeforeTest
    public AndroidDriver<?> setUp() throws InterruptedException, MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "RZ8M62XX40H");
        cap.setCapability("platformName", "android");
        cap.setCapability("appPackage", Consts.PACKAGE_ID);
        cap.setCapability("appActivity", "tn.esprit.nebulagaming.MainActivity");
        cap.setCapability("noReset", true);
        cap.setCapability("automationName", "uiautomator2");
        URL url = new URL("http://127.0.0.1:4723");
        driver = new AndroidDriver<>(url, cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }
}

