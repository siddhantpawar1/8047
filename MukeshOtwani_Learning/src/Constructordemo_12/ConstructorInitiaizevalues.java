package Constructordemo_12;

public class ConstructorInitiaizevalues {

	int Results;
	
	public static void main(String[] args) {
		
		ConstructorInitiaizevalues CIV = new ConstructorInitiaizevalues(500);
		CIV.displayResults();
		

	}

	public ConstructorInitiaizevalues(int x) {
		Results = x;
			
	}
	
	public void displayResults() {
		
		System.out.println("The results appearing is: "+Results);
	}
}
