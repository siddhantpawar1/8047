package methoddemo_4;
public class methoddemo {
	
	
	int x=55;
	int y=65;

	public static void main(String[] args) {
		
		
		System.out.println("This is the beginning of program....");
		methoddemo md = new methoddemo();
		md.sum();
		
		
		System.out.println("x value is :"+md.x);
		System.out.println("x value is :"+md.y);
		
		
		
		System.out.println("This is the end of the program!!");
		
	}	
		public void sum() {
			
			
			int a=12;
			int b=15;
			int c=a+b;
			System.out.println("Addition of two numbers is "+c);
			
		}
}

	