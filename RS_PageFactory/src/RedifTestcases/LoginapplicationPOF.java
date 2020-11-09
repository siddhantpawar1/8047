package RedifTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import RedifObjectrepo.RedifLoginpage;
import RedifObjectrepo.RedifLoginpagePOF;

public class LoginapplicationPOF {
	
	@Test	
	public void login() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");	
	RedifLoginpagePOF POFRL = new RedifLoginpagePOF(driver);
	
	POFRL.uname().sendKeys("Hello");
	POFRL.passCode().sendKeys("SiddhantTest");
	POFRL.Submit().click();
	
	
	}
	}
