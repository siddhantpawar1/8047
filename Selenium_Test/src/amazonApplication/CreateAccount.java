package amazonApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");

		driver.findElement(By.xpath("//*[contains(text(),'Hello, Sign in')]")).click();
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys("Selenium Test");
		driver.findElement(By.id("ap_email")).sendKeys("siddhantpawartesting@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("Test@123");
		driver.findElement(By.id("ap_password_check")).sendKeys("Test@123");

		driver.findElement(By.id("continue")).click();

	}

}
