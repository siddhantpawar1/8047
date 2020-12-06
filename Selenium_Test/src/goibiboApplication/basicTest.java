package goibiboApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicTest {

	public static void main(String[] args) {
		System.out.println("Begin Test");
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sidpw\\\\OneDrive\\\\Desktop\\\\Siddhant_Files\\\\Software\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		
		driver.findElement(By.xpath("//input[@id='gosuggest_inputSrc']")).sendKeys("Mumbai");
	}

}
