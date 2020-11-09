import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo2 {

	@Parameters({"URL", "APIKey/Username"})
	@Test
	public void FourthTC(String URLname, String key) {
		System.out.println("Testing TestNG 4th TC");
		System.out.println("Using this URL "+URLname);
		System.out.println("I am using the second parameter from XML file: "+key);
		

	}

	@Test(groups= {"Smoke"}) 
	public void FifthTC() {
		System.out.println("Testing TestNG 5th TC");

	}

	@Test(timeOut=4000) 
	public void SixthTC() {
		System.out.println("Testing TestNG 6th TC");
		

	}

	@Test(dependsOnMethods=(("SixthTC")))
	public void API2TC() {
		System.out.println("Testing TestNG API2");
	}
	@Test
	public void Car2TC() {
		System.out.println("Testing TestNG Car2");
	}

}
