package handleCheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxdemo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Selecting Check-box and using isSelected Method
		driver.get("http://demo.guru99.com/test/facebook.html");
		WebElement chkFBPersist = driver.findElement(By.id("persist_box"));
		for (int i = 0; i < 2; i++) {
			chkFBPersist.click();
			System.out.println("Facebook Persists Checkbox Status is -  " + chkFBPersist.isSelected());
		}
		driver.close();

	}
}
