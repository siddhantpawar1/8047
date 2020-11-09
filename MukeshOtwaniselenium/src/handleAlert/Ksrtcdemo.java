package handleAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Assert;

public class Ksrtcdemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@title='PNR Enquiry']")).click();
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();

		String AlertText = driver.switchTo().alert().getText();
		System.out.println(AlertText);
		String ExpectedText = "Please enter valid ticket number to continue.";

		driver.switchTo().alert().accept();

		Assert.assertEquals(ExpectedText, AlertText);
	}

}
