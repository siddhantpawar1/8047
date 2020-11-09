package handleframes.copy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framedemo {

	public static void main(String[] args) {
		
System.out.println("Launch chrome");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		
		// Initialize browser
			WebDriver driver=new ChromeDriver();
				
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		int size = driver.findElements(By.xpath("//frame")).size();
		System.out.println(size);
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		System.out.println(driver.findElement(By.xpath("//frame[contains(text(), ‘LEFT’)]")).getText());
		
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.xpath("//frame[contains(text(), ‘MIDDLE’)]")).getText());
		
		driver.switchTo().frame("frame-right");
		System.out.println(driver.findElement(By.xpath("//frame[contains(text(), ‘RIGHT’)]")).getText());
		
		driver.switchTo().frame("frame-bottom");
		System.out.println(driver.findElement(By.xpath("//frame[contains(text(), ‘BOTTOM’)]")).getText());
		
		
		driver.close();
		
		
	}

}
