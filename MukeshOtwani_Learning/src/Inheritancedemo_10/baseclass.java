package Inheritancedemo_10;

public class baseclass extends parentclass{

	public static void main(String[] args) {
		
	baseclass PC = new baseclass();
	PC.add();
	PC.sub();
	PC.mul();
	PC.div();
	
		
	}
	
	public void mul() {
		System.out.println("This method is for multiplication");
		
		
	}
	public void div() {
		System.out.println("This method is for division");
		
	}

}
