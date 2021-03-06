package RedifTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import RedifObjectrepo.Createaccount;
import RedifObjectrepo.RedifLoginpage;

public class CreateAccount {

	@Test
	public void login() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		Createaccount CA = new Createaccount(driver);
		CA.uname().sendKeys("Siddhant Pawar");
		CA.Email().sendKeys("SiddhantPawar");
		CA.CheckAvailability().click();
		Thread.sleep(9000);
		CA.Availability().click();
	}
}