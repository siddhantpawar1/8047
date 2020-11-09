package Abstractclass_14;

public class HRdept extends ITdepart{

	public static void main(String[] args) {
	HRdept obj1  = new HRdept();
	obj1.salary();
	obj1.goodies();
	obj1.work();
	obj1.bonus();

	}

	
	public void salary() {
		
		System.out.println("Salary will be 5LPA");		
				
	}
	
	public void bonus() {
		System.out.println("Bonus will be as per the performance!!");
		
	}
	

}
