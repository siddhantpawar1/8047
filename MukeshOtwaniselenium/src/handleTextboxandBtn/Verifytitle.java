package handleTextboxandBtn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Assert;

public class Verifytitle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		String ActualTitle = driver.getTitle();
		System.out.println("Actual Title appearing on screen: " + ActualTitle);

		String ExpectedTitle = "Siddhant Testing";

		if (ActualTitle == ExpectedTitle)

			System.out.println("Title is matching with Expected");
		else
			System.out.println("fail");
		
		Assert.assertEquals(ExpectedTitle, ActualTitle);

	}

}
