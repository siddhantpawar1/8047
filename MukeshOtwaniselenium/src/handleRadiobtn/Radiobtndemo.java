package handleRadiobtn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jdi.Value;

public class Radiobtndemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_radio");
		
		
		//First finding the element using any of locator stratedgy
		WebElement iframeElement = driver.findElement(By.id("iframeResult"));
		//now using the switch command
		driver.switchTo().frame(iframeElement);

		List<WebElement> radio = driver.findElements(By.xpath("//input[@name='gender' and @type='radio' ]"));

		for (int i = 0; i < radio.size(); i++)

		{

			WebElement localradio = radio.get(i);
			String value = localradio.getAttribute("value");
			System.out.println("values from radio buttons are: " + value);

			if (value.equalsIgnoreCase("Female"))

			{
				localradio.click();
				break;
			}
		}

	}
}