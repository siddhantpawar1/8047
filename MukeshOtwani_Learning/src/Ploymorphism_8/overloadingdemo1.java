package Ploymorphism_8;

public class overloadingdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	overloadingdemo1 OD1 = new overloadingdemo1();
	OD1.add(45.56, 65.65);
	OD1.add(78, 65);
		
	}	
		public void add(int x, int y) {
		int c= x+y;
		System.out.println("The values of the sum is: "+c);
	}

		public void add(double x, double y) {
			double c= x+y;
			System.out.println("The values of the sum is: "+c);
		}


}
