package AutomationPractice.ExtentReports;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentreportDemo {

	ExtentReports extent;
	
	@BeforeTest
	public void config() {
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Siddhant Test Execution");
		reporter.config().setDocumentTitle("Test Results");
	
	extent = new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "Siddhant Pawar");
	}
	
	
	@Test
	public void demo() {
	
	ExtentTest test = extent.createTest("Second Demo");	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.get("https:facebook.com");
	System.out.println(driver.getTitle());
	test.fail("Result do not match");
	extent.flush();
	
	}
}
