package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws Exception {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\sidpw\\eclipse-workspace\\RS_End2End\\src\\test\\java\\resources\\data.properties");
		prop.load(fis);

		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			// execute in chrome browser

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

			// driver.get(url);

		} else if (browserName.equals("firefox")) {

			// execute in firefox driver
		} else if (browserName.equals("IE")) {

			// execute in IE driver
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

	public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {

	TakesScreenshot ts = (TakesScreenshot) driver;
	File Source =	ts.getScreenshotAs(OutputType.FILE);
	String DestinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	FileUtils.copyFile(Source,new File(DestinationFile) );
	return DestinationFile;
	}

}