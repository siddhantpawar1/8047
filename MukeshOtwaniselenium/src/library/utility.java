package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class utility {

	public static void CaptureScreenshot(WebDriver driver, String Screenshotname) {

		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File Source = ts.getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(Source, new File("./screenshot/"+Screenshotname+".png"));

			System.out.println("SCreenshot Taken");
		} catch (Exception e) {

			System.out.println("Exception while taking screenshot : " + e.getMessage());
		}
	}

}
