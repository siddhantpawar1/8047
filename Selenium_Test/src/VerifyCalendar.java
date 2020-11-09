import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class VerifyCalendar {

	public static void main(String[] args) throws Exception {
	
		System.out.println("Lets begin!");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://redbus.in");
		driver.manage().window().maximize();
		
		WebElement FromCity = driver.findElement(By.xpath("//input[@id=\'src\']"));
		FromCity.sendKeys("AHMEDABAD");
		
		WebElement DestCity = driver.findElement(By.xpath("//input[@id=\'dest\']"));
		DestCity.sendKeys("Mumbai");
		
		driver.findElement(By.id("onward_cal")).click();
		Thread.sleep(300);
		
		
		//It will store all webElements in LIST format
		
		List<WebElement> dates= driver.findElements(By.xpath("//div[@id='rb-calendar']/div[2]/div[2]/ul[2]/li[4]"));
		int totaldays=dates.size();
		System.out.println("Total number of days appearing: "+totaldays);
		
		for (int i=0;i<totaldays;i++)
		{
			
			String date=dates.get(i).getText();
			
			if (date.equals("31"));
			{
				
				dates.get(i).click();
				break;
			}
			
			
			
			
		}
		
		
		
	
		
		
		
		
		
		
		

	}

}
