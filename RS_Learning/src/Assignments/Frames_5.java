package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[contains(text(),'Nested Frames')]")).click();
		int size = driver.findElements(By.xpath("//frame")).size();
		System.out.println(size);

		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");

		WebElement Middleframe = driver.findElement(By.id("Content"));
		System.out.println(Middleframe.getText());

	}

}
