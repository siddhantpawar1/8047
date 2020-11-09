package alpha;

import org.apache.logging.log4j.*;
import org.apache.log4j.Logger;

public class Demo {
	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {
		
		
		log.debug("I am debugging"); 
		if(8>5) 
			log.info("Object is Present");
			log.error("Object is not present");
			log.fatal("This is fatal");
	}
}