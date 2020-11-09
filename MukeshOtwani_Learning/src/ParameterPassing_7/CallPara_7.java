package ParameterPassing_7;

public class CallPara_7 {

	public static void main(String[] args) {
		
		PassPara_7 calling = new PassPara_7();
		
		int Addition = calling.sum(65, 89);
		System.out.println("Addition of two numbers: "+Addition);
		double Subtraction = calling.sub(65.896, 78.95);
		System.out.println("Subtraction of two numbers: "+Subtraction);
				
		
		
	}

}
