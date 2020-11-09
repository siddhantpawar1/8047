package AutoITdemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfile {

	public static void main(String[] args) throws Exception {
		
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			        driver.manage().window().maximize();
	        
	        driver.get("http://the-internet.herokuapp.com");
	        
	        driver.findElement(By.xpath("//a[contains(text(),'File Upload')]")).click();
	        
	        Thread.sleep(2000);
	        Runtime.getRuntime().exec("C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\AutoIT\\Upload.exe");
	       
		
	}

}
