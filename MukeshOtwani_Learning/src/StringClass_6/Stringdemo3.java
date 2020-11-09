package StringClass_6;

public class Stringdemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stringdemo3 SD3 = new Stringdemo3();
		SD3.trim1();
		SD3.trim2();
		
	}		
		
		public void trim1() {
		String names  = "      Siddhant Pawar   ";
		
		String finalname = names.trim();
		System.out.println(finalname);
		}
	
		public void trim2() {
			String names  = "      Siddhant Pawar   ";
			
			String finalname = names.toUpperCase();
			System.out.println(finalname);
			System.out.println(names.CASE_INSENSITIVE_ORDER);
			}

}


