package StepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

import org.junit.runner.RunWith;

public class StepDefinition extends base {

	@Given("^Initialize browser with chrome$")
	public void initialize_browser_with_chrome() throws Throwable {

		driver = initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
		driver.get(arg1);
	}

	@Given("^Click on login link in home page to land on secure sign in page$")
	public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
		LandingPage Lp = new LandingPage(driver);
		if (Lp.getpopupSize().size() > 0) {
			Lp.getpopup().click();
		}
		Lp.getLogin().click();

	}

	@When("^User enters (.+) and (.+) and logs in $")
	public void user_enters_and_and_logs_in(String username, String Password) throws Throwable {
		LoginPage Log = new LoginPage(driver);
		Log.ID().sendKeys(username);
		Log.Pass().sendKeys(Password);
		Log.Submit().click();
	}

	/*
	 * @When("^User enters test(\\d+)@gmail\\.com and (\\d+) and logs in$") public
	 * void user_enters_test_gmail_com_and_and_logs_in(CharSequence[] arg1,
	 * CharSequence[] arg2) throws Throwable { LoginPage Log = new
	 * LoginPage(driver); Log.ID().sendKeys(arg1); Log.Pass().sendKeys(arg2);
	 * Log.Submit().click();
	 * 
	 * }
	 * 
	 * @When("^User enters sidpwr(\\d+)@gmail\\.com and (\\d+) and logs in$") public
	 * void user_enters_sidpwr_gmail_com_and_and_logs_in(CharSequence[] arg1,
	 * CharSequence[] arg2) throws Throwable { LoginPage Log = new
	 * LoginPage(driver); Log.ID().sendKeys(arg1); Log.Pass().sendKeys(arg2);
	 * Log.Submit().click();
	 * 
	 * }
	 */

	@Then("^Verify the user is successfully logged in$")
	public void verify_the_user_is_successfully_logged_in() throws Throwable {
		System.out.println("User is logged in");
	}

	@And("^broswer closes$")
	public void broswer_closes() throws Throwable {

		driver.close();

	}

}
