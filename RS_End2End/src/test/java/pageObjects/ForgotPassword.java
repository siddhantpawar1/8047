package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {

	public WebDriver driver;

	By EmailID = By.xpath("//input[@type='email']");
	By button = By.xpath("//input[@value='Send Me Instruction']");
	
	public ForgotPassword(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement ID() {

		return driver.findElement(EmailID);
	}
	public WebElement Clickbutton() {

		return driver.findElement(button);
	}
}
