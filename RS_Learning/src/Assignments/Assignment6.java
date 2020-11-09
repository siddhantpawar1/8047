package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// checkbox 3 selection
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		String Actualval = driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).getText();

		// select and match dropdown with selected checkbox
		WebElement Drpdwn = driver.findElement(By.id("dropdown-class-example"));
		Select S = new Select(Drpdwn);
		S.selectByValue(Actualval);

		// send the name in textbox and click confirmation
		driver.findElement(By.id("name")).sendKeys(Actualval);
		driver.findElement(By.id("confirmbtn")).click();

		// switch to alertbox and get text
		String Alerttext = driver.switchTo().alert().getText();

		if (Alerttext.contains(Actualval))
			System.out.println("Text appearing in the alertbox is selected value: " + Actualval);
		else
			System.out.println("Text is not matching with selected text");

		driver.switchTo().alert().accept();

		driver.close();

	}

}
