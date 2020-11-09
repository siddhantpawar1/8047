package Interfacedemo_11;

public class AdvanceCalc implements calc {

	public static void main(String[] args) {
		
		AdvanceCalc AC = new AdvanceCalc();
		AC.add();
		AC.div();
		AC.mul();
		AC.sub();
	}
	
	
	public void mul() {
		
		System.out.println("Check for multiplication");
	}
	public void div() {
		
		System.out.println("Check for division");
	}


	@Override
	public void add() {
	
		System.out.println("YOu gu need to practice a lot!!");
	}

	@Override
	public void sub() {
	
		System.out.println("Do not think you are smart enough to understand stuffs just by reading");
		
	}

	
}