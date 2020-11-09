package facebookApplication;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createnewaccount {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		// Create new account
		WebElement Createacc = driver.findElement(By.xpath("//a[@id=\"u_0_2\"]"));
		Createacc.click();

		/*
		 * String parent = driver.getWindowHandle();
		 * System.out.println("Parent window ID is: " + parent);
		 * 
		 * Set<String> s = driver.getWindowHandles(); int count =s.size();
		 * System.out.println("Total window counts: "+s);
		 * 
		 * // Now iterate using Iterator
		 * 
		 * Iterator<String> I1 = s.iterator(); while (I1.hasNext()) {
		 * 
		 * String child_window = I1.next();
		 * 
		 * if (!parent.equals(child_window)) { driver.switchTo().window(child_window);
		 * 
		 * System.out.println(driver.switchTo().window(child_window).getTitle());
		 * 
		 * }
		 */

		Thread.sleep(3000);

		// FirstName
		WebElement Fname = driver.findElement(By.xpath("//input[@id='u_1_b']"));
		Fname.sendKeys("Testing");

		// LastName
		WebElement Lname = driver.findElement(By.xpath("//input[@id='u_1_d']"));
		Lname.sendKeys("Testing");

		// Mobile number
		WebElement Cnumb = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		Cnumb.sendKeys("6476870651");

		// Password
		WebElement Pass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		Pass.sendKeys("ABCxyz@123");

		// Birthdate Month
		Select drpMonth = new Select(driver.findElement(By.name("birthday_month")));
		drpMonth.selectByVisibleText("Oct");
		Thread.sleep(2000);

		// Birthdate Month
		Select drpDay = new Select(driver.findElement(By.name("birthday_day")));
		drpDay.selectByIndex(21);
		Thread.sleep(2000);

		// Birthdate Month
		Select drpYear = new Select(driver.findElement(By.name("birthday_year")));
		drpYear.selectByVisibleText("1991");
		Thread.sleep(2000);

		// Gender
		driver.findElement(By.xpath("//label[contains(text(),('Custom'))]")).click();

		// Select Pronoun
		Select drppronoun = new Select(driver.findElement(By.name("preferred_pronoun")));
		drppronoun.selectByVisibleText("He: \"Wish him a happy birthday!\"");

		WebElement Gentry = driver.findElement(By.id("u_1_q"));
		Gentry.sendKeys("MALE");

		// Submit
		driver.findElement(By.xpath("//button[@id='u_1_s']")).click();

		driver.close();

	}

}
