package wrapperdemo17;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String S = "123";
		String P = "987";
				
		
		int x = Integer.parseInt(S);
		int y = Integer.parseInt(P);
		
		int total = x+y;
		
		if(total ==700) {
		System.out.println("Total of the two parsed integer is good! ");
		}
		else 
		{
		System.out.println("Total does not matched with expected");
		
		}
	}

}
