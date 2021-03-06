package Framework.RS_End2End;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class VerifyTitle extends base {

	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void basePagenavigation() throws Exception {
		driver = initializeDriver();
		log.info("Driver is initialized");

		driver.get(prop.getProperty("url"));
		log.info("Getting the URL from Properties");

		driver.manage().window().maximize();
		log.info("Maximized the window size");

		LandingPage Lp = new LandingPage(driver);
		Assert.assertEquals(Lp.gettitle().getText(), "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
		log.info("Successfully validated title");
		driver.close();

	}
}