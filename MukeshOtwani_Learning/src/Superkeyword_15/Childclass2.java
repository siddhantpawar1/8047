package Superkeyword_15;

public class Childclass2 extends Baseclass2 {

	int interest_rate = 30;

	public static void main(String[] args) {

		Childclass2 obj = new Childclass2();
		System.out.println(obj.interest_rate);
		obj.showmeinterestRate();

	}
	
	public void Interestrate() {

		System.out.println("I am in child class");
		
	}


	public void showmeinterestRate() {
		
		super.Interestrate();

		System.out.println("Current interest rate fro  RBI is: " + interest_rate);

	}

}
