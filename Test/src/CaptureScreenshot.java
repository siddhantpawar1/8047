import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import library.Utility;

public class CaptureScreenshot {

	
	
	@Test
	public static void main(String[] args) throws Exception {
	System.out.println("Dummy screenshot");
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
	
	// Initialize browser
	WebDriver driver=new ChromeDriver();
	Utility.captureScreenshot(driver, "openChrome");
			
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Utility.captureScreenshot(driver, "openfacebook");
	
	WebElement ID= driver.findElement(By.xpath("//input[@id=\'email\']"));
	ID.sendKeys("sidpwr9@gmail.com");
	Utility.captureScreenshot(driver, "enterID");
	
	
	driver.quit();
	
	

	}

}
