//checkbox selected or not print message
// number of checkboxes in the page

package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {

		System.out.println("Begin assignment for checkbox");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// to check if the checkbox is selected and if not then select and again check
		// if it is selected

		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());

		// to check the number of checkboxes in the page:

		System.out.println(driver.findElement(By.xpath("//*[@type='checkbox']")).getSize());

		driver.close();
	}

}
