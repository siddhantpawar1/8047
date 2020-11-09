package Differentbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InvokeExplorer {

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver","C:\\Users\\sidpw\\OneDrive\\Desktop\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}

}
