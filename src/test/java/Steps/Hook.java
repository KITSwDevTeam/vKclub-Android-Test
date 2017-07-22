package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by chhormchhatra on 7/19/17.
 */

public class Hook extends BaseUtil{
    //    Before each scenario
    private BaseUtil base;
    public Hook(BaseUtil base) {
        this.base = base;
    }



    @Before
    public void initializer(){



        /*
        * Specify each variable below:
        * */
        String emulatorName = "Device Name";
        String appName = "appName.apk";
        String intendedActivity = "";
        File app = new File("src/test/Res", appName);
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, emulatorName);
        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability("appWaitActivity", intendedActivity);
		/*
		 * If the test fail because of the activity, try to check the log for the real activity and package name
		 * and replace it in the above code
		 * */



        AndroidDriver<AndroidElement> driver;
        try {
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            base.driver = driver;
        } catch (MalformedURLException e) {
            Assert.fail(e.getMessage());
        }

    }
    //    After each scenario
    @After
    public void terminator(Scenario scenario){
        if(scenario.isFailed()){
//          TODO code to take screenshot
            System.out.println("The scenario " +scenario.getName()+" is failed");
        }
        /*
        * Use close() to terminate the browser
        * Use quit() to terminate the driver instance
        * */
        base.driver.quit();
        System.out.println("Terminated App");
    }

}
