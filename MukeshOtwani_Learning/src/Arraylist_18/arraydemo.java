package Arraylist_18;

import java.util.ArrayList;
import java.util.Iterator;

public class arraydemo {

	public static void main(String[] args) {
		// Need of Array List, why can't we just use array
		// what is list and array list
// how to write list
		// get values from array list
		// some operation on list
		// what is generic in collection
		// Collection = Set, List, Queue, Dequeue,
		// classes = Arraylist, Vector, Linkedlist, PriorityQueue, Hashset,
		// LinkedHashSet, TreeSet

		ArrayList obj1 = new ArrayList();
		obj1.add("1234");
		obj1.add("Siddhant");
		obj1.add("Siddhant");
		obj1.add("P");
		obj1.add("12.65");
		
		//int mylistsize = obj1.size();

		// for loop
		//for(int i=0;i<mylistsize;i++) {
		//System.out.println(obj1.get(i));
		//System.out.println(obj1.get(3));
		
		
	Iterator itr=obj1.iterator();
	
	while(itr.hasNext());
	{
		Object value =itr.next();
		System.out.println("Values are: "+value);
	}
	
	
	//Enhanced for loop
	/*for(Object abc:obj1) {
	System.out.println("Values are: "+abc);
	
	} */
	    
	
	}

}
