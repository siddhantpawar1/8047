package Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Streamdemo {

	public static void main(String[] args) {

		Streamdemo SD = new Streamdemo();
		SD.newStream();

		// 1 hour long : video 120
		// Count the number of names starting with alphabet Ain list

		ArrayList<String> names = new ArrayList<String>();
		names.add("Siddhant");
		names.add("Saurabh");
		names.add("Priyanka");
		names.add("Talib");
		names.add("Sam");

		/*
		 * int count=0; for (int i = 0; i < names.size(); i++) { String actualnames =
		 * names.get(i); if (actualnames.startsWith("S"))
		 * 
		 * 
		 * { count++; } System.out.println(count); }
		 */

		long C = names.stream().filter(x -> x.startsWith("S")).count();
		System.out.println(C);
		
		names.stream().filter(s->s.length()>7).forEach(s->System.out.println(s));

	}

	public void newStream() {

		long B = Stream.of("Pikachu", "Raichu", "Charlizard", "Bulbasor", "Sqarturtle").filter(x -> x.startsWith("R"))
				.count();
		System.out.println(B);
		
		

	}

}
