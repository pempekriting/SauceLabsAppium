package driver;

import constants.Constants;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidDriverInstance {
    public static AndroidDriver<AndroidElement> initialize() throws IOException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
        caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        caps.setCapability(MobileCapabilityType.APP, Constants.APK);
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
        caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
        caps.setCapability("appPackage", "com.saucelabs.mydemoapp.android");
        caps.setCapability("appWaitPackage", "com.saucelabs.mydemoapp.android");
        caps.setCapability("appWaitActivity", "com.*");

        AndroidDriver<AndroidElement> androidDriver = fillAndroidDriver(caps);
        androidDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return androidDriver;
    }

    private static AndroidDriver<AndroidElement> fillAndroidDriver(DesiredCapabilities caps) throws MalformedURLException {
        AndroidDriver<AndroidElement> androidDriver;
        androidDriver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        return androidDriver;
    }
}
