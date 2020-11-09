package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class syncwithexplicitwait_3 {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
	driver.findElement(By.xpath("//a[text()='Click to load get data via Ajax!']")).click();
	
	
	//Explicit wait:
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Process completed!')]")));
	
	
	System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Process completed!')]")).getText());
	}

}
