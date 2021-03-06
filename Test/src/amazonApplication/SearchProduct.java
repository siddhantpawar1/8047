package amazonApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchProduct {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Click on baby
		Select searchItems = new Select(driver.findElement(By.id("searchDropdownBox")));
		Thread.sleep(3000);
		searchItems.selectByVisibleText("Baby");
		WebElement searchTextBx = driver.findElement(By.id("twotabsearchtextbox"));
		searchTextBx.sendKeys("products");
		Thread.sleep(3000);

		searchTextBx.sendKeys(Keys.ARROW_DOWN);
		searchTextBx.sendKeys(Keys.ARROW_DOWN);
		searchTextBx.sendKeys(Keys.ARROW_DOWN);
		searchTextBx.sendKeys(Keys.ARROW_DOWN);

		Thread.sleep(3000);

		searchTextBx.sendKeys(Keys.ENTER);

		Select Sort = new Select(driver.findElement(By.id("s-result-sort-select")));
		Sort.selectByIndex(1);

	}

}
