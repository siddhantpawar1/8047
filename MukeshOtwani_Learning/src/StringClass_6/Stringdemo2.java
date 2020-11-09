package StringClass_6;

public class Stringdemo2 {

	public static void main(String[] args) {

		String fullname = "Selenium-HQPC-LoadRunner-JMeter-";
		String[] Testingtools = fullname.split("-");

		for (int i = 0; i < Testingtools.length; i++) {
			System.out.println("The value appearing after the split is: " + Testingtools[i]);
		if (Testingtools[i].equalsIgnoreCase("Seleium"));
				
			{
				System.out.println("Test passed");
				break;
			}
		}

	}

}
