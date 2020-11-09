package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporerNG {
	static ExtentReports extent;

	public static ExtentReports getReportObject() {

	String path = System.getProperty("user.dir")+"\\reports\\index.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	reporter.config().setReportName("Siddhant Test Execution");
	reporter.config().setDocumentTitle("Test Results");

	extent = new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "Siddhant Pawar");
	return extent;
}
}
