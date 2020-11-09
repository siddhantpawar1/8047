package amazonApplication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");

		List<WebElement> HeaderBar = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));

		for (int i = 0; i < HeaderBar.size(); i++) {

			WebElement actualeaderInfo = HeaderBar.get(i);
			String headerMenu = actualeaderInfo.getAttribute("innerHTML");
			System.out.println("Value of the Header section is:  " + headerMenu);

		}

	}

}
