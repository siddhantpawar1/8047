package Thiskeyword_16;

public class Demothis {

	
	public Demothis( ) 
	{
		this("JDBC");
		System.out.println("This is null value constructor");
	}
	
	public Demothis( int count) 
	{
		
		System.out.println("This constructor returns some count: "+count);
	}
	
	
	public Demothis( String name) 
	{
		this(100);
		System.out.println("This constructor will return me the name of somebody: "+name);
	}
	
	public void display() {
		
		System.out.println("I am in the display method");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Demothis obj = new Demothis();
		//Demothis obj = new Demothis("Siddhant");
		//Demothis obj = new Demothis();
	}

}
