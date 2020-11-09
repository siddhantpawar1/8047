package Thiskeyword_16;

public class Demovar {
	
	
	int x;
	int y;
	
	public Demovar(int x, int y) {
	this.x=x;
	this.y=y;
	
	}
	public void sum() {
	int c=x+y;
	System.out.println("The addition of two numbers is: "+c);

	}
	public static void main(String[] args) {
		
	Demovar obj = new Demovar(80,90);
	obj.sum();

	}

}
