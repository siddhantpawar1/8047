package amazonApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jobapplicationSearch {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[contains(text(),'Careers')]")).click();

		
		Thread.sleep(3000);
		WebElement HiddenText = driver.findElement(By.xpath("//div[@id='search_typeahead-label']"));
		System.out.println("Test appearing in checkbox is: "+HiddenText.getText());
		
		
		WebElement Searchbox1 = driver.findElement(By.xpath("//body/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/span[1]/input[1]"));
		Searchbox1.sendKeys("Quality Assurance");
		Thread.sleep(5000);
		Searchbox1.sendKeys(Keys.ARROW_DOWN);
		Searchbox1.sendKeys(Keys.ARROW_DOWN);
		Searchbox1.sendKeys(Keys.ENTER);

		WebElement Searchbox2 = driver.findElement(By.xpath("//body/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/span[1]/input[1]"));
		Searchbox2.sendKeys("Toronto");
		Thread.sleep(5000);
		Searchbox2.sendKeys(Keys.ARROW_DOWN);
		Searchbox2.sendKeys(Keys.ENTER);

		driver.findElement(By.id("//button[@id='search-button']")).click();
	}

}
