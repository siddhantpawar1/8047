package Assignments;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		// Get name for parent window
		String Parent = driver.getWindowHandle();

		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();

		// Iterate for child
		Set<String> s = driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!Parent.equals(child_window)) {
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());
				System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());

				System.out.println(driver.switchTo().window(Parent).getTitle());
				System.out.println(
						driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
				driver.quit();
			}
		}

	}

}
