package array_9;

public class Arraysingledim {

	public static void main(String[] args) {
		 int sid[]=new int[5];
		 
		 sid[0] = (int) 45.55;
		 sid[1] = 55;
		 sid[2] = 65;
		 sid[3] = 75;
		 sid[4] = 85;
		 
		 int sizeofarray = sid.length;
		 System.out.println("Length of array: "+sizeofarray);
		 System.out.println("Value of single dimensional array is : "+sid[0]);

		 
		 for(int i=0;i<=sizeofarray;i++) {
			 
			 System.out.println("Values inside the arry is: "+i);
		 }
		 
			 
		 }
	
	
	}


