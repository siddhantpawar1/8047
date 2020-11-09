package library;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static void captureScreenshot(WebDriver driver, String Screenshotname)
	
	{
		try {
			TakesScreenshot Ts=(TakesScreenshot)driver;
			File source=Ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshots/facebook.png" +Screenshotname+".png"));
			System.out.println("Screenshot Taken");
		} catch (Exception e) {
			
			System.out.println("Exception while taking screenshot "+e.getMessage());
			
		}
		
		
	}
}
