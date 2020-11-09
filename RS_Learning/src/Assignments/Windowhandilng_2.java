//Handle web elements

package Assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Windowhandilng_2 {

	ChromeDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// disable notification for notification
		// Create a map to store preferences
		Map<String, Object> prefs = new HashMap<String, Object>();

		// add key and value to map as follow to switch off browser notification
		// Pass the argument 1 to allow and 2 to block
		prefs.put("profile.default_content_setting_values.notifications", 2);

		// From and To dropdown for autosuggestive dropdown
		WebElement source = driver.findElement(By.xpath("//input[@id='FromTag']"));
		source.sendKeys("AHM");
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);

		/*WebElement destination = driver.findElement(By.xpath("//input[@id='ToTag']"));
		destination.sendKeys("TOR");
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ENTER);*/

		// check today's date in calendar and check it.
		driver.findElement(By.xpath("//*[@id='DepartDate']")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ']")).click();

		// select 5 adults

		WebElement adult = driver.findElement(By.id("Adults"));
		Select s = new Select(adult);
		s.selectByIndex(4);

		// select 4 children from dropdown
		WebElement children = driver.findElement(By.id("Childrens"));
		Select p = new Select(children);
		p.selectByValue("4");

		// click on hyperlink
		driver.findElement(By.xpath("//a[@title='More search options']")).click();

		// select business class from dropdown field
		WebElement travelClass = driver.findElement(By.xpath("//select[@id='Class']"));
		Select tc = new Select(travelClass);
		tc.selectByValue("Business");

		// enter a text in preferred airline field
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Siddhant Airlines");

		// click on submit button
		driver.findElement(By.id("SearchBtn")).click();
		
		
		//get error message displayed over the screen
		
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

		// to close the browser
		//driver.close();

	}
}
