package handleframes.copy;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySwitchtoTab {

	public static void main(String[] args) {
		
		System.out.println("Begin Execution");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.naukri.com/");
		 
		 driver.manage().window().maximize();
		 
		 String Parent=driver.getWindowHandle();
		 System.out.println("Parent window ID is: "+Parent);
		 
		 Set<String> allwindows=driver.getWindowHandles();
		 ArrayList<String> tabs=new ArrayList<>(allwindows);
		 
		 System.out.println("All the titles for different windows are: " +tabs);
		 
		 driver.switchTo().window(tabs.get(3));
		 driver.close();
		 

		 driver.switchTo().window(tabs.get(2));
		 driver.close();
		 
		 driver.switchTo().window(tabs.get(1));
		 driver.close();
		 
		 
		 driver.switchTo().window(tabs.get(0));
		 System.out.println("Parent window title is: "+driver.getTitle());
	}

}
