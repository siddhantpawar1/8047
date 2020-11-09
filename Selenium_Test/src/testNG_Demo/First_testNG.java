package testNG_Demo;

import org.testng.annotations.Test;

public class First_testNG {

	public static void main(String[] args) {
		System.out.println("Example for TestNG");
		
		
	}
		
		@Test(priority=1,description="This testcase will chek login")
		public void loginApplication()
		
		{
			System.out.println("Enter your login creds");
			
		}
		

			@Test(priority=2, description="This testcase will add credentials to login and application is loggedin")
			public void Applicationlogged()
			
			{
				System.out.println("Logged into the application");
		}
			
			@Test(priority=3, description="This testcase will pick different items from cart")
			public void ItemsSelected()
			
			{
				System.out.println("Select Items from website");
		}
			
			@Test(priority=4, description="This testcase will checkout after performing checkout")
			public void CheckedOut()
			
			{
				System.out.println("Checkout of application");
		}
		

	}


