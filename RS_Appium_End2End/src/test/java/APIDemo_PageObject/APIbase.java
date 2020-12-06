package APIDemo_PageObject;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class APIbase {

	public static AndroidDriver<AndroidElement> Capabilities(String appName) throws MalformedURLException {
		
		File appDir=new File("src");
		File app = new File(appDir, appName);
		//File fs =new File(appDir, "ApiDemos-debug.apk");	
		
		System.out.println("Begin AppiumTest");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "siddhantEmulator");
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		return driver;
	}

}
