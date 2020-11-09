package CollectionSet_19;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashsetdemo {

	public static void main(String[] args) {
	
		LinkedHashSet<String> values = new LinkedHashSet();
		
		values.add("Vijaya");
		values.add("Prijay");
		values.add("Priyanka");
		values.add("Siddhant");
		values.add("Siddhant");
		values.add("Vijay");
		values.add("Nutan");
		values.add("1");
		
		System.out.println("Family members are: "+values);
		
		for(String e :values) {
			
			System.out.println(e);
		
		
		}

	}

}
