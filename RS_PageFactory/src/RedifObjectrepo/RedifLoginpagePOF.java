package RedifObjectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedifLoginpagePOF {

	WebDriver driver;

	public RedifLoginpagePOF(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='login1']")
	WebElement userName;

	public WebElement uname() {
		return userName;
	}

	@FindBy(xpath = "//input[@id='password']")
	WebElement passCode;

	public WebElement passCode() {
		return passCode;
	}

	@FindBy(xpath = "//input[@type='submit']")
	WebElement Submit;

	public WebElement Submit() {
		return Submit;
	}

}
