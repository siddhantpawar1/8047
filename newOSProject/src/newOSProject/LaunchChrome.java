package newOSProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
	System.out.println("Launch chrome");
	
	System.setProperty("Webdriver.chrome.driver","C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32.exe");
	
	WebDriver driver = new ChromeDriver();
	
	 driver.navigate().to("http://www.javatpoint.com/");
	
		
		

	}

}
