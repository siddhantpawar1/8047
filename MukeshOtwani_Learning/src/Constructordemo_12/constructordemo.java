package Constructordemo_12;

public class constructordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	constructordemo CD = new constructordemo(123, "Rushad");
		

	}
	
public constructordemo(int rank, String schoolname) {
		
	System.out.println("Printing rank and schoolname");
	}
public constructordemo(String schoolname, int rank ) {
		
	System.out.println("Printing school name and rank");
	}

public constructordemo(int rank) {
	
	System.out.println("Printing the rank");
}

public constructordemo(String Teachers) {
	
	System.out.println("Printing the teacher name");
}

public constructordemo() {
	
	
	System.out.println("Printing null value constructor");
	
}
}
