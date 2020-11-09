package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class framework2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		FileInputStream FIS = new FileInputStream("C:\\Users\\sidpw\\eclipse-workspace\\RahulShetty_Learning\\data.properties");
		prop.load(FIS);
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("URL"));
		
		prop.setProperty("browser","firefox" );
		System.out.println(prop.getProperty("browser"));
		
	
	FileOutputStream FOS = new FileOutputStream("C:\\Users\\sidpw\\eclipse-workspace\\RahulShetty_Learning\\data.properties");
	prop.store(FOS, null);
	}

	
	
	
}
