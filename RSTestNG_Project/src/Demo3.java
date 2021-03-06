import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo3 {
	
	
	
	@Test(dataProvider ="getData")
	public void SeventhTC(String Username, String Password) {
	System.out.println("Testing TestNG 7th TC");
	System.out.println(Username);
	System.out.println(Password);	
	}
	
	@AfterMethod
	public void EightTC() {
	System.out.println("Testing TestNG 8th TC");
		
	}
	
	@Test(groups= {"Smoke"}) 
	public void NinthTC() {
	System.out.println("Testing TestNG 9th TC");
		
	}
	
	@Test
	public void API3TC() {
		System.out.println("Testing TestNG API3");
		}
	
	@AfterSuite
	public void Car3TC() {
		System.out.println("Testing TestNG Car3");
	}
	
	
	
	@DataProvider
	public Object[][] getData() {
	
	Object[][] data = new Object[3][2];
	
	//first Data
	
	data[0][0]= "firstusername";
	data[0][1]= "firstpassword";
	
	//Seconds Data
	data[1][0]= "Secondusername";
	data[1][1]= "Secondpassword";
	
	//Third Data
	data[2][0]= "Thirdusername";
	data[2][1]= "Thirdpassword";
	return data;
	
	}

}
