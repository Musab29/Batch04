package overview;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class C01_SetUpCapabilities {

    AndroidDriver<AndroidElement> androidDriver;
    DesiredCapabilities capabilities = new DesiredCapabilities();


    @Test
    public void setUpApplication() throws MalformedURLException {
        capabilities.setCapability("deviceName", "Pixel 2 API 30"); // Sanal cihazımızın ismi
        capabilities.setCapability("platformName", "Android"); // Sistem platformunun ismi
        capabilities.setCapability("platformVersion", "11.0");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("add", System.getProperty("user.dir") + "/app/ApiDemos.apk");
        androidDriver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723"), capabilities);
        androidDriver.findElementByAccessibilityId("Access'ibility").click();

    }

}
