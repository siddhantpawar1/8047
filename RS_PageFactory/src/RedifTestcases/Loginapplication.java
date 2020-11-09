package RedifTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import RedifObjectrepo.RedifLoginpage;

public class Loginapplication {
	
	@Test	
	public void login() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");	
	RedifLoginpage RL = new RedifLoginpage(driver);
	
	RL.uname().sendKeys("Hello");
	RL.passCode().sendKeys("SiddhantTest");
	RL.Submit().click();
	
	
	}
	}
