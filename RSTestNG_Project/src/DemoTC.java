import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTC {

	@Test
	public void FirstTC() {
		System.out.println("Testing TestNG 1st TC");
		Assert.assertTrue(false);
	}

	@Test(groups= {"Smoke"}) 
	public void SecondTC() {
		System.out.println("Testing TestNG 2nd TC");

	}

	@Test
	public void ThirdTC() {
		System.out.println("Testing TestNG 3rd TC");
	}

	@Test
	public void API1TC() {
		System.out.println("Testing TestNG API1");
	}

	@Test
	public void Car1TC() {
		System.out.println("Testing TestNG Car1");
	}
}
