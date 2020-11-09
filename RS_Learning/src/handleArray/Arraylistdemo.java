package handleArray;
import java.util.ArrayList;

public class Arraylistdemo {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Siddhant");
		names.add("Het");
		names.add("Shubham");
		names.add("Vedang");
		names.add("Priyanka");
		
		
		int count = 0;
		for(int i=0;i<names.size();i++) {
			
			String actualnames = names.get(i);
			if(actualnames.startsWith("S"))
			{
			count++;
			
			}
			System.out.println(count);
		
		}

	}

}
