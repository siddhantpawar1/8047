package APIDemo_PageObject_TestCases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.util.prefs.Preferences;

import APIDemo_PageObject.APIbase;
import APIDemo_PageObject.HomePage;
import APIDemo_PageObject.PreferenceDependencies;
import APIDemo_PageObject.PreferencesPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class FirstTestCase extends APIbase {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = Capabilities("ApiDemos-debug.apk");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		HomePage h = new HomePage(driver);
		PreferencesPage prep = new PreferencesPage(driver);
		PreferenceDependencies PD = new PreferenceDependencies(driver);

		h.preferencies.click();
		// driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		prep.dependencies.click();
		// driver.findElementByXPath("//android.widget.TextView[@text='3. Preference
		// dependencies']").click();
		PD.Checkbox.click();
		// driver.findElementById("android:id/checkbox").click();
		PD.WifiSetting.click();
		// driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		PD.EnterWifiSetting.sendKeys("Siddhant");
		// driver.findElementById("android:id/edit").sendKeys("Siddhant");
		PD.ClickOK.click();
		// driver.findElementsByClassName("android.widget.Button").get(1).click();

		driver.closeApp();

	}

}
