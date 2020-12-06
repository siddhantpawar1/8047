package GeneralStore_Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static AndroidDriver<AndroidElement> Capabilities(String appName) throws MalformedURLException, IOException {
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\sidpw\\eclipse-workspace\\RS_Appium_End2End\\src\\test\\java\\GeneralStore_Objects\\Global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		
		File appDir=new File("src");
		File app = new File(appDir, (String) prop.get(appName));
			
		
		
		System.out.println("Begin AppiumTest");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		String device = prop.getProperty("device");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
		
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		return driver;
	}

}
