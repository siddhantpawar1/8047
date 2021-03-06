package Framework.RS_End2End;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
//import alpha.Demo;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	public static Logger log = LogManager.getLogger(base.class.getName());


	@Test(dataProvider = "getData")
	public void multipleusers(String uname, String pass, String text) throws Exception {
		driver = initializeDriver();
		log.info("Driver is initialized");	
		
		driver.get(prop.getProperty("url"));
		log.info("Getting the URL from Properties");	
		
		driver.manage().window().maximize();
		log.info("Maximized the window size");	
		
		LandingPage Lp = new LandingPage(driver);
		Lp.getLogin().click();
		log.info("Clicking on the login link");	
			
		
		
		LoginPage Log = new LoginPage(driver);
		Log.ID().sendKeys(uname);
		Log.Pass().sendKeys(pass);
		System.out.println(text);
		log.info("browser selected is: " +text);
		
			
		Log.Submit().click();
		log.info("Enterd two different credentials and hit submit before quitting the browser");	
		
		ForgotPassword fp = Log.forgorpassword();
		fp.ID().sendKeys("xyzabc");
		fp.Clickbutton().click();
		
		driver.quit();
	}

	@DataProvider
	public Object[][] getData() {
		// Row stands for how many different data types the test should run
		// column - how many different values for each test
		Object[][] data = new Object[2][3];
		// 0th row
		data[0][0] = "nonrestricteduser@qa.com";
		data[0][1] = "123456";
		data[0][2] = "Restricted User";

		data[1][0] = "restricteduser@qa.com";
		data[1][1] = "456789";
		data[1][2] = "Non Restricted User";
		return data;
	}

}
