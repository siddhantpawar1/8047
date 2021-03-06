package IRCC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calculatecrs {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cic.gc.ca/english/immigrate/skilled/crs-tool.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Are you single on married
		Select maritialStatus = new Select(driver.findElement(By.id("q1")));
		maritialStatus.selectByVisibleText("Married");
		
		// Spouse status in canada
		Thread.sleep(3000);
		Select spouseStatus = new Select(driver.findElement(By.id("q2i")));
		spouseStatus.selectByIndex(0);

		// Spouse travelling with you
		Thread.sleep(3000);
		Select spouseTravelling = new Select(driver.findElement(By.id("q2ii")));
		spouseTravelling.selectByIndex(0);

		// Select your Age
		Thread.sleep(3000);
		Select yourAge = new Select(driver.findElement(By.id("q3")));
		yourAge.selectByVisibleText("29 years of age");

		// Education Level
		Thread.sleep(3000);
		Select educationLevel = new Select(driver.findElement(By.id("q4")));
		educationLevel.selectByIndex(5);

		// Canadian Degree
		Thread.sleep(3000);
		Select canadianDegree = new Select(driver.findElement(By.id("q4b")));
		canadianDegree.selectByIndex(0);

		// Taken IELTS results
		Thread.sleep(3000);
		Select Ieltse = new Select(driver.findElement(By.id("q5i")));
		Ieltse.selectByIndex(1);

		// Test taken in which language
		Thread.sleep(3000);
		Select testLang = new Select(driver.findElement(By.id("q5i-a")));
		testLang.selectByVisibleText("IELTS");

		// Speaking
		Thread.sleep(3000);
		Select scoreSpeaking = new Select(driver.findElement(By.id("q5i-b-speaking")));
		scoreSpeaking.selectByIndex(6);

		// Listening
		Thread.sleep(3000);
		Select scoreListening = new Select(driver.findElement(By.id("q5i-b-listening")));
		scoreListening.selectByIndex(7);

		// reading
		Thread.sleep(3000);
		Select scoreReading = new Select(driver.findElement(By.id("q5i-b-reading")));
		scoreReading.selectByIndex(7);

		// writing
		Thread.sleep(3000);
		Select scoreWriting = new Select(driver.findElement(By.id("q5i-b-writing")));
		scoreWriting.selectByIndex(6);

		//other languages taken
		Thread.sleep(3000);
		Select otherLanguage = new Select(driver.findElement(By.id("q5ii")));
		spouseStatus.selectByIndex(2);
	}

}
