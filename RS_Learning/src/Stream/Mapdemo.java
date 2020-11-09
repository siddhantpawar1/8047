package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Mapdemo {

	public static void main(String[] args) {
		
		Mapdemo MD = new Mapdemo();
		MD.bayblade();
		MD.pokemon();
		
	}
		
		public void pokemon() {
			Stream.of("Pikachu", "Raichu", "Charlizard", "Bulbasor", "Sqarturtle").filter(x ->x.length()>8).forEach(x->System.out.println(x));
		
		}
		public void bayblade() {
			
			List<String> baybladers = Arrays.asList("Ash", "Siddhant", "Mayank", "Himanshu", "Praveen");
			baybladers.stream().filter(x->x.startsWith("M")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}

}