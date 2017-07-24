package POM;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by chhormchhatra from KEEN Virtual Company of KIT on 7/19/17.
 */

public class pomEg {
    public pomEg(MobileDriver<AndroidElement> driver){
        /*
		 * Issue: java.lang.IllegalArgumentException: Can not set io.appium.java_client...
		 * solution :  https://discuss.appium.io/t/pagefactory-with-mobileelement-throws-exception-with-appiumdriver-and-java-client-3-3-0/8555
		 * NB: for web driver, everything will be fine with simple PageFactory:
		 *  PageFactory.initElements(driver, this);
		 * */
        PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
    }

    @FindBy(xpath = "someXpath")
    AndroidElement elementName;

    public void actionButton() {
        elementName.click();
    }
}
