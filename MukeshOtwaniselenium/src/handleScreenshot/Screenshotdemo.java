package handleScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import library.utility;

import org.apache.commons.io.FileUtils;

public class Screenshotdemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();

		utility.CaptureScreenshot(driver, "LaunchAppplication");

		
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();

		utility.CaptureScreenshot(driver, "ErrorCaptured");

		driver.quit();
	}

}
