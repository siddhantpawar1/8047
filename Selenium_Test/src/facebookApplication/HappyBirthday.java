package facebookApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HappyBirthday {

	public static void main(String[] args) {

		// Login to FB
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sidpwr9@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Prisidd@2114");

		driver.findElement(By.id("u_0_b")).click();

		// Check for Birthdays and send Birthday message
		driver.findElement(By.xpath("//span[contains(text(),'Events')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Birthdays')]")).click();
		System.out.println("I am able to see Birthdays from today :"
				+ driver.findElement(By.xpath("//span[contains(text(),'Today')]")).isDisplayed());

		System.out.println("People have birthdays for today: " + driver.findElement(By.xpath(
				"//span[contains(text(),'Today')]//following::div[@class='dati1w0a qt6c0cv9 hv4rvrfc jb3vyjys b20td4e0'][1]/div"))
				.getSize());

		//
	}

}