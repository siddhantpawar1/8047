package VariableDatatype_1;

public class booleanstring {

	public static void main(String[] args) {
		
		String actual = "you are mad";
		String expected ="we all have some madness";
		
		boolean obj1 = actual.equalsIgnoreCase(expected);
		System.out.println("Actual and expected match: "+obj1);

		String sta1 = "THIS IS LIFE"; 
		String sta2 = "this is life";
		
		
		boolean obj2 = sta1.equalsIgnoreCase(sta2);
		System.out.println("Actual and expected match: "+obj2);

	}

}
