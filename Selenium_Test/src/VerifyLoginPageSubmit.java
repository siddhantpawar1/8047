import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class VerifyLoginPageSubmit {

	public static void main(String[] args) {
		
		
		System.out.println("Test facebook application!!!");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		driver.manage().window().maximize();
		
		
		WebElement ID = driver.findElement(By.xpath("//input[@id=\'email\']"));
		ID.sendKeys("Siddhant");
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("987654");
		
		
		WebElement submit= driver.findElement(By.xpath("//button[@id='u_0_b']"));
		submit.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		//capture error message
		/*WebElement Error = driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]/text()"));
		String ActualError = Error.getText();
				
		
		System.out.println("Error message appearing over the screen is :"+ActualError);
		String expectedError ="The password you’ve entered is incorrect.";
		
		Assert.assertEquals(ActualError, expectedError);*/
		
		
		WebDriverWait wait = new WebDriverWait(driver,30);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='u_0_2']/div[@id='globalContainer']/div[@id='content']/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/div[2]/a[1]")));
		// click on the compose button as soon as the "compose" button is visible
		System.out.println("User is not able to login due to invalid credentials therefore I am not creating a new profile for you.....");
		driver.quit();
		
		
		
	}

}
