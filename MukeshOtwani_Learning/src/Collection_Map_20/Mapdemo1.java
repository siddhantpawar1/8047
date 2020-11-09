package Collection_Map_20;

import java.util.HashMap;
import java.util.Map;

public class Mapdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> obj1 = new HashMap<String, String>();
		obj1.put("200", "Selenium");
		obj1.put("201", "QTP");
		obj1.put("202", "Java");
		obj1.put("203", "Python");
		obj1.put("204", "Javascript");
		obj1.put("205", "SDET");
		obj1.put("206", "QA");

		System.out.println(obj1);
		String value =obj1.get("205");
		System.out.println(value);
		
		
		for(Map.Entry<String, String> data: obj1.entrySet())
		{
			
			System.out.println("Key from Map is: " +data.getKey()+ "  and value is  " +data.getValue());
		}
	}
}
