package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	By signin = By.xpath("//span[contains(text(),'Login')]");
	By Title = By.xpath("//h3[contains(text(),'An Academy to learn Everything about Testing')]");
	By popup = By.xpath("//button[text()='NO THANKS']");
	public LandingPage(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement getLogin() {

		return driver.findElement(signin);
	}
	public WebElement gettitle() {

		return driver.findElement(Title);
	}
	public List<WebElement> getpopupSize() {

		return driver.findElements(popup);
	}
	public WebElement getpopup() {

		return driver.findElement(popup);
	}
}
