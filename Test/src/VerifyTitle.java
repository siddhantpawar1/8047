import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyTitle {

	public static void main(String[] args) {

	
	System.out.println("Begin Executin!!");	
		
	
	//To trigger search on chrome
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.ca/");
	
	driver.manage().window().maximize();
	
	
	//To close the application
	driver.close();
	
	}

}
