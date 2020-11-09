package RedifObjectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RedifLoginpage {

	WebDriver driver;

	public RedifLoginpage(WebDriver driver) {

		this.driver = driver;

	}

	By userName = By.xpath("//input[@id='login1']");

	public WebElement uname() {
		return driver.findElement(userName);
	}

	By Password = By.xpath("//input[@id='password']");

	public WebElement passCode() {
		return driver.findElement(Password);
	}

	By Submit = By.xpath("//input[@type='submit']");

	public WebElement Submit() {
		return driver.findElement(Submit);
	}

}
