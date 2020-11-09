package handleDropdown;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.junit.Assert;

public class Dropdowninascending {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/newtours/register.php");

		Select country = new Select(driver.findElement(By.name("country")));

		List ActualList = new ArrayList();

		List<WebElement> Mycountry = country.getOptions();

		for (WebElement ele : Mycountry) {
			String data = ele.getText();
			ActualList.add(data);
		}

		List TempList = new ArrayList();
		TempList.add(ActualList);
		Collections.sort(TempList);

		Assert.assertEquals(TempList, ActualList);

	}

}
