package variable_5;

public class Globalvar {
	
	int x=20;
	double y=65.85;

	public static void main(String[] args) {
		
		
		Globalvar obj = new Globalvar(); 
		obj.print();
		}
	
	public void print() {
		
		double c= x+y;
		System.out.println("Value of x: "+x+ " & " +"value of y :"+y);
		System.out.println("Value of the addition is: " +c );
			
	}
	
	
}


