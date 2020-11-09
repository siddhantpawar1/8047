package handleCheckbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
		
		
		//First finding the element using any of locator stratedgy
		WebElement iframeElement = driver.findElement(By.id("iframeResult"));
		//now using the switch command
		driver.switchTo().frame(iframeElement);

		List<WebElement> checkbx = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (int i = 0; i < checkbx.size(); i++)

		{

			WebElement Allcheckbx = checkbx.get(i);
			String value = Allcheckbx.getAttribute("value");
			System.out.println("values from radio buttons are: " + value);

			if (value.equalsIgnoreCase("car"))

			{
				Allcheckbx.click();
				break;
			}
		}

	}
}		
		
		
		
	
