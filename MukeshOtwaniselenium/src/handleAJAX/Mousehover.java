package handleAJAX;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\sidpw\\\\OneDrive\\\\Desktop\\\\Siddhant_Files\\\\Software\\\\chromedriver_win32\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/menu/");
		driver.manage().window().maximize();
	

		// Adding wait
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

		// Instantiate Action Class
		Actions actions = new Actions(driver);
		// Retrieve WebElement 'Music' to perform mouse hover
		WebElement menuOption = driver.findElement(By.xpath("//a[contains(text(),'Main Item 2')]"));
		// Mouse hover menuOption 'Music'
		actions.moveToElement(menuOption).perform();
		System.out.println("Done Mouse hover on 'Main Item 2' from Menu");

		// Now Select 'Rock' from sub menu which has got displayed on mouse hover of
		// 'Music'
		WebElement subMenuOption = driver.findElement(By.xpath("//a[contains(text(),'SUB SUB LIST »')]"));
		// Mouse hover menuOption 'Rock'
		actions.moveToElement(subMenuOption).perform();
		System.out.println("Done Mouse hover on 'Rock' from Menu");

		// Now , finally, it displays the desired menu list from which required option
		// needs to be selected
		// Now Select 'Alternative' from sub menu which has got displayed on mouse hover
		// of 'Rock'
		WebElement selectMenuOption = driver.findElement(By.xpath("//a[contains(text(),'Sub Sub Item 1')]"));
		selectMenuOption.click();
		System.out.println("Selected 'Alternative' from Menu");

		// Close the main window
		driver.close();
	}

}
