package Calendar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateSelection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");

		WebElement From = driver.findElement(By.id("src"));
		From.sendKeys("AHMEDABAD");
		Thread.sleep(3000);
		From.sendKeys(Keys.ARROW_DOWN);
		From.sendKeys(Keys.ARROW_DOWN);
		From.sendKeys(Keys.ENTER);

		WebElement TO = driver.findElement(By.id("dest"));
		TO.sendKeys("mum");
		Thread.sleep(3000);
		TO.sendKeys(Keys.ARROW_DOWN);
		TO.sendKeys(Keys.ENTER);

	driver.findElement(By.xpath("//label[@for='onward_cal']")).click();
		
		Thread.sleep(5000);
		List<WebElement> dates = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr[4]"));
		int totaldays = dates.size();
		System.out.println("Total number of days appearing: " + totaldays);

		for (int i = 0; i < totaldays; i++) {

			String date = dates.get(i).getText();

			if (date.equals("30"));
			{

				dates.get(i).click();
				break;
			}

		}
	}
}