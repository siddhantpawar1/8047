package StringClass_6;

public class StringClass_6 {

	public static void main(String[] args) {
		StringClass_6 SC = new StringClass_6();
		SC.first();
		SC.second();
		SC.third();
		SC.fourth();
		
	}

	public void first() {
		String name = "Selenium webdriver";

		boolean status = name.startsWith("Selenium");
		System.out.println("name is :" + status);
	}

	public void second() {
		String statement = "The world is going to end soon";

		boolean status2 = statement.endsWith("soon");
		System.out.println("statement is: " + status2);
	}

	public void third() {
		String S = "I am a programmer";
		String P = "I am a better programmer";

		boolean status3 = S.equals(P);
		System.out.println("The better programmer is siddhant: " + status3);
	}

	public void fourth() {
		String S = "I am a programmer";
		String P = "I am a better programmer";

		boolean status4 = S.equalsIgnoreCase(P);
		System.out.println("Both S and P are equal: " + status4);

	}

}
