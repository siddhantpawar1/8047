package ErrorMessage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Errormsg {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
		driver.findElement(By.name("login")).click();
		
	Thread.sleep(2000);	
		
	String ActualError=	driver.findElement(By.xpath("//*[@id='email_container']/div[2]")).getText();
	System.out.println("Actual Error message appearing :" +ActualError);
	
	String ExpectedError = "The email or phone number you’ve entered doesn’t match any account. Sign up for an account.";
	
	//Assert type 1
	Assert.assertEquals(ExpectedError, ActualError);
	
	
	//Assert type 2
	Assert.assertTrue(ActualError.contains("The email or phone number you’ve entered doesn’t match any account. Sign up for an account."));

	
	driver.close();
	}

}
