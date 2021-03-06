package amazonApplication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChangeAddress {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		driver.manage().window().maximize();

		WebElement CurrentLocation = driver.findElement(By.id("glow-ingress-line2"));

		if (CurrentLocation.equals("Canada")) {

			System.out.println("Location is selected as canada");
		}

		else {
			driver.findElement(By.id("glow-ingress-line1")).click();
			System.out.println("Since you have not selected canada, Now you have option to: "
					+ driver.findElement(By.id("a-popover-header-3")).getText());

		}
		// click on dropdown value to enable
		Thread.sleep(2000);
		WebElement countryDrpdown = driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']"));
		countryDrpdown.click();

		Thread.sleep(5000);

		// List of dropdown values
		/*
		 * List<WebElement> Dropdown = driver.findElements(By.xpath(
		 * "//body/div[@id='a-popover-7']/div[1]/div[1]/ul[1]/li"));
		 * 
		 * for (int i = 0; i < Dropdown.size(); i++) {
		 * 
		 * WebElement Actualdropdown = Dropdown.get(i); String Dropdownvalue =
		 * Actualdropdown.getAttribute("innerHTML");
		 * System.out.println("Value of the dropdown appearing is:  " + Dropdownvalue);
		 * 
		 * if (Dropdownvalue.equalsIgnoreCase("India"))
		 * 
		 * { Actualdropdown.click(); break; }}
		 */

		System.out.println(driver.findElement(By.id("GLUXCountryList_103")).getText());
		driver.findElement(By.id("GLUXCountryList_103")).click();

	}
}
