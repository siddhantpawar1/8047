package Java_Learning;

public class Polymorphismcompile {

	public static void main(String[] args) {
		
		Polymorphismcompile runtime = new Polymorphismcompile();
		runtime.sum(89, 65);
		runtime.sum(56, 89,56);
		
		
		
	}
	
	
	
	public void sum(int x, int y) {
		int c=x+y;
		System.out.println("value of c is: "+c);
		
		}
	
	
	public void sum(int x, int y, int z) {
		
		int Q=x+y+z;
		System.out.println("Addition2 result is: "+Q);
		
	}
		
		

	}

