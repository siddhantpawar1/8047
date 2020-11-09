package Differentbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Invokefirefox {

	public static void main(String[] args) {
System.out.println("Launching Chrome!!");
		
		
		System.setProperty("driver.gecko.driver","C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
				
		driver.get("https://google.com");
		
		String Title=driver.getTitle();
		
		System.out.println("Title of the application is: " +Title);
		
	}

}
