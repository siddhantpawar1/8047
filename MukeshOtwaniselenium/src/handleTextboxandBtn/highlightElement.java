package handleTextboxandBtn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class highlightElement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		
		WebElement Searchbx =driver.findElement(By.id("twotabsearchtextbox"));
		highlightUtility.highLightElement(driver, Searchbx);

		Thread.sleep(3000);


	}

}
