package utls;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {

    // Driver class i Page lerde initializing hatasi verdi bu sebepten Hooks Class i ni create ettik
    public AndroidDriver<AndroidElement> androidDriver;
    DesiredCapabilities capabilities = new DesiredCapabilities();


    @BeforeTest
    public void setUpApplication()  {
        try{
            capabilities.setCapability("deviceName", "Pixel 6a API 29");// Sanal cihazimin ismi
            capabilities.setCapability("platformName", "Android"); // sistem platformunun ismi
            capabilities.setCapability("platformVersion", "10.0");
            capabilities.setCapability("automationName","UiAutomator2");
            capabilities.setCapability("app",System.getProperty("user.dir")+"/app/ApiDemos.apk");
            androidDriver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723"),capabilities);
        }catch (MalformedURLException e){
            System.out.println("URL Exception: "+ e.getMessage());
        }
    }
}
