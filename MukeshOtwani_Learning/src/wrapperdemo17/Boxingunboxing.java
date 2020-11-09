package wrapperdemo17;

import java.util.ArrayList;

public class Boxingunboxing {

	public static void main(String[] args) {
	
		//Autoboxing
		
		int z=90;
		Integer c=z;
		System.out.println("c");
		
		
		//boxing
		int x=90;
		Integer y = Integer.valueOf(x);
		System.out.println(x);
		
		//unboxing
		Integer result =100;
		int newResult = result.intValue();
		System.out.println(newResult);

		//Autounboxing
		Integer marks = 250;
		int finalmarks=marks;
		System.out.println("finalmarks");

	
//Becomes mandatory to use rapper class in collection, List, Set, Map
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		//int is not allowed in the syntax itself below
		//ArrayList<int> arrr = new ArrayList<int>(); 
		
		
	
	}

}
