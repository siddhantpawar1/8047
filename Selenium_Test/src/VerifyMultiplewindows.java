import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyMultiplewindows {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Begin Execution");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.naukri.com/");
		 
		 driver.manage().window().maximize();
		 
		 String Parent=driver.getWindowHandle();
		 System.out.println("Parent window ID is: "+Parent);
		 
		 Set<String> allwindows=driver.getWindowHandles();
		 int count=allwindows.size();
		 System.out.println("Total window count: "+count);
		 
		 for(String child:allwindows)
			 
		 {
		if(!Parent.equalsIgnoreCase(child))
		{
			
			driver.switchTo().window(child);
			System.out.println("child window title is: "+driver.getTitle());
			
			Thread.sleep(3000);
			
			driver.close();	
				}
		
			  }
		 
		 driver.switchTo().window(Parent);
		 System.out.println("Parent window title is: "+driver.getTitle());
	}

}
