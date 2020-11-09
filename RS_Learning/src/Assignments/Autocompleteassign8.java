package Assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocompleteassign8 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement txtBox = driver.findElement(By.xpath("//input[@id='autocomplete']"));

		txtBox.sendKeys("TOR");
		Thread.sleep(500);
		txtBox.sendKeys(Keys.ARROW_DOWN);
		txtBox.sendKeys(Keys.ARROW_DOWN);
		txtBox.sendKeys(Keys.ARROW_DOWN);
		txtBox.sendKeys(Keys.ENTER);

	}

}
