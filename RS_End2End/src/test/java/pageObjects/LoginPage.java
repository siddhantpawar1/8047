package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {


	public WebDriver driver;

	By EmailID = By.xpath("//input[@type='email']");
	By Pass = By.xpath("//input[@type='password']");
	By Submit = By.xpath("//input[@value='Log In']");
	By forgotpassword = By.xpath("//a[contains(text(),'Forgot Password?')]");

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}
	
	
	public ForgotPassword forgorpassword() {
		
		driver.findElement(forgotpassword).click();
		ForgotPassword fp = new ForgotPassword(driver);
		return fp;
		}

	public WebElement ID() {

		return driver.findElement(EmailID);
	}

	public WebElement Pass() {

		return driver.findElement(Pass);
	}

	public WebElement Submit() {

		return driver.findElement(Submit);
	}

}
