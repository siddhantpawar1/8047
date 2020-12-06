package APIDemo_PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PreferenceDependencies {

	public PreferenceDependencies(AppiumDriver driver)

	{

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(id = "android:id/checkbox")
	public WebElement Checkbox;
	@AndroidFindBy(xpath = "(//android.widget.RelativeLayout)[2]")
	public WebElement WifiSetting;
	@AndroidFindBy(id = "android:id/edit")
	public WebElement EnterWifiSetting;
	@AndroidFindBy(className = "android.widget.Button")
	public WebElement ClickOK;

}
