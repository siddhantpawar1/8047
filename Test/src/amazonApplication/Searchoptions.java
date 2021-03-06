package amazonApplication;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Searchoptions {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Click on the dropdown for search to check options
		driver.findElement(By.id("searchDropdownBox")).click();

		// check the option list to find number of elements
		List<WebElement> searchList = driver.findElements(By.xpath("//select[@id='searchDropdownBox']/option"));

		for (int i = 0; i < searchList.size(); i++) {

			WebElement actualList = searchList.get(i);
			String totalsrcOptions = actualList.getText();
			System.out.println("Value of the Search options:  " + totalsrcOptions);
			
		}
	}

}
