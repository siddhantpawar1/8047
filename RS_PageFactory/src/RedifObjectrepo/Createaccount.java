package RedifObjectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Createaccount {

	WebDriver driver;

	public Createaccount(WebDriver driver) {

		this.driver = driver;

	}
	
	By name = By.xpath("//tbody/tr[3]/td[3]/input[1]");
	By Email = By.xpath("//tbody/tr[7]/td[3]/input[1]");
	By Checkavailability = By.xpath("//tbody/tr[7]/td[3]/input[2]");
	By Availability = By.xpath("//tbody/tr[7]/td[3]");
	
	public WebElement uname() {
		return driver.findElement(name);
	}

	public WebElement Email() {
		return driver.findElement(Email);
	}

	public WebElement CheckAvailability() {
		return driver.findElement(Checkavailability);
	}

	public WebElement Availability() {
		return driver.findElement(Availability);
	}

}