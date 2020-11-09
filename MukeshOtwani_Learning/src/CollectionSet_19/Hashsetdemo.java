package CollectionSet_19;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashsetdemo {

	public static void main(String[] args) {
	
		HashSet<String> values = new HashSet();
		
		values.add("Vijaya");
		values.add("Prijay");
		values.add("Priyanka");
		values.add("Siddhant");
		values.add("Vijay");
		values.add("Nutan");
		values.add("1");
		
		System.out.println("Family members are: "+values);
		
		//for(String e :values) {
			
			//System.out.println(e);
			
		//Set t list
			
			ArrayList<String> list = new ArrayList<> (values);
			System.out.println(list.get(2));
			
		}

	}


