package Differentbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args) {
		System.out.println("Launch chrome");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		
		// Initialize browser
			WebDriver driver=new ChromeDriver();
				
		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		
	}

}
