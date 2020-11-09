package handleAJAX;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardevents {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sidpw\\\\OneDrive\\\\Desktop\\\\Siddhant_Files\\\\Software\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("Selenim Testing");
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).sendKeys("123456789").build().perform();
		
	}

}
