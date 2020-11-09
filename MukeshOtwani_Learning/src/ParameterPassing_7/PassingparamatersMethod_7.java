package ParameterPassing_7;

public class PassingparamatersMethod_7 {

	public static void main(String[] args) {
	System.out.println("Begin execution");
	
	PassingparamatersMethod_7  obj = new PassingparamatersMethod_7();
	
	obj.add(45, 56);
	obj.sub(65.85, 78.95);
	
	System.out.println("This ends the execution...");
	}
	
	
	
	public void add(int x, int y) {
	int c=x+y;
	System.out.println("Value of c is: "+c);
		
	}
	
	
	public void sub(double a, double b) {
	double G = a+b;
	System.out.println("Value of G: "+G);
		
	}

}
