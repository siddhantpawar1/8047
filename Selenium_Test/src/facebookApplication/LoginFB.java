package facebookApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFB {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sidpw\\\\OneDrive\\\\Desktop\\\\Siddhant_Files\\\\Software\\\\chromedriver_win32\\\\chromedriver.exe");
	
WebDriver driver = new ChromeDriver();
driver.get("https://facebook.com");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sidpwr9@gmail.com");
driver.findElement(By.id("pass")).sendKeys("Prisidd@2114");

driver.findElement(By.id("u_0_b")).click();


//driver.close();

	}

}
