package Superkeyword_15;

public class Childclass extends Baseclass {

	int interest_rate = 28;

	public static void main(String[] args) {

		Childclass obj = new Childclass();
		System.out.println(obj.interest_rate);
		obj.showmeinterestRate();

	}

	public void showmeinterestRate() {

		System.out.println("Current interest rate fro  RBI is: " + super.interest_rate);

	}

}
