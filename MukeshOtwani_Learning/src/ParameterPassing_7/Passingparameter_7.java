package ParameterPassing_7;

public class Passingparameter_7 {

	public static void main(String[] args) {
		System.out.println("Begin execution");
		
		Passingparameter_7  obj = new Passingparameter_7();
		
		int adding = obj.add(45, 56);
		System.out.println("Sum of the two numbers is: "+adding);
		double subtracting = obj.sub(65.85, 78.95);
		System.out.println("Subtracting the two numbers will give: "+subtracting);
		System.out.println("This ends the execution...");
		}
		
		public int add(int x, int y) {
		int c=x+y;
		return c;
			
		}
		
		
		public double sub(double a, double b) {
		double G = a+b;
		return G;
			
		}

	}
