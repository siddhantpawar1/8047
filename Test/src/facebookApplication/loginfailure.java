package facebookApplication;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginfailure {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("siddhant");
		driver.findElement(By.id("pass")).sendKeys("987654");
		driver.findElement(By.id("u_0_b")).click();

		String Title = driver.getTitle();
		System.out.println("Title of the page is: " + Title);
		System.out.println("Unable to login to the application - No problem we will create an account");

		// Go to previous screen

		driver.navigate().back();

		// Create new account
		WebElement Createacc = driver.findElement(By.xpath("//a[@id=\"u_0_2\"]"));
		Createacc.click();
		
		

		String parent = driver.getWindowHandle();
		System.out.println("Parent window ID is: " + parent);
		Set<String> s = driver.getWindowHandles();

		// Now iterate using Iterator

		Iterator<String> I1 = s.iterator();
		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());
				
			}
			
			driver.findElement(By.xpath("//*[@id='reg_box']")).isDisplayed();
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Siddhant");

			driver.close();

		}

	}
}