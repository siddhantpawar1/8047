package handleDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");

		
		driver.findElement(By.xpath("//button[@id='menu1']")).click();	
		
		List<WebElement> Dropdown = driver.findElements(By.xpath("//body/div[@id='belowtopnav']/div[1]/div[1]/div[3]/ul[1]/li"));
		
		for(int i=0;i<Dropdown.size();i++) {
			
		WebElement Actualdropdown = Dropdown.get(i)	;
		String Dropdownvalue = Actualdropdown.getAttribute("innerHTML");
		System.out.println("Value of the dropdown appearing is:  " +Dropdownvalue);
		}
	
	}

}
