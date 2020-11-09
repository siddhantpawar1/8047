
public class First_class {

public void add(int x, int y) {
			
			int Result=x-y;
			System.out.println("value of result: "+Result);
			
	}
	
	
public void sum(int a,int b) {
			
		int sum=a+b;
		
		System.out.println("Total of a and b: " +sum);
	}
	
public static void main(String[] args) {
		System.out.println("Begin Execution");
		
		First_class FC= new First_class();
		FC.sum(500,900);
		FC.add(500,400);
	

   }

}
