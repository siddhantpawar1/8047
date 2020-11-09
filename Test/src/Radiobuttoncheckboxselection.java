
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Radiobuttoncheckboxselection {

	public static void main(String[] args) {
	System.out.println("Launch chrome");
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sidpw\\OneDrive\\Desktop\\Siddhant_Files\\Software\\chromedriver_win32\\chromedriver.exe");
	
	// Initialize browser
		WebDriver driver=new ChromeDriver();
			
	driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
	
	driver.manage().window().fullscreen();
	
	List<WebElement> radio=driver.findElements(By.xpath("//input[@name='optradio' and @type='radio']"));							
   
    for(int i=0;i<radio.size();) {
    	
    	WebElement LocalRadio= radio.get(i);
    	String value=LocalRadio.getAttribute("value");
    	System.out.println("Value from radio buttons are: " +value);
    	
    	if(value.equalsIgnoreCase("Male"));
    	LocalRadio.click();
    	    	
    break;
    
    }
    driver.findElement(By.xpath("//*[@id=\"buttoncheck\"]")).click();
    WebElement Radiotxt1=driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[3]"));
    Radiotxt1.click();
    String data=Radiotxt1.getText();
    System.out.println("Test appearing on the press of radio button selector is: "+data);
    
 
 List<WebElement> radio2=driver.findElements(By.xpath("//input[@name='gender' and @type='radio']"));   
 for(int j=0;j<radio2.size();) {
    	
    	WebElement LocalRadio2= radio2.get(j);
    	String value2=LocalRadio2.getAttribute("value");
    	System.out.println("Value from radio buttons are: " +value2);
    	
    	if(value2.equalsIgnoreCase("Female"));
    	LocalRadio2.click();
    	    	
 break;
 }	
 
 List<WebElement> radio3=driver.findElements(By.xpath("//input[@name='ageGroup' and @type='radio']"));   
 for(int k=0;k<radio3.size();) {
    	
    	WebElement LocalRadio3= radio3.get(k);
    	String value3=LocalRadio3.getAttribute("value");
    	System.out.println("Value from radio buttons are: " +value3);
    	
    	if(value3.equalsIgnoreCase("0 - 5"));
    	LocalRadio3.click();
    	    	
 break;
 }
 
 driver.findElement(By.xpath("//button[contains(text(),'Get values')]")).click();
 WebElement Radiotxt2=driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/p[2]"));
 Radiotxt2.click();
 String data2=Radiotxt2.getText();
 System.out.println("Test appearing on the press of radio button selector is: "+data2);
 
 
 driver.close();
	
 
 
	}


}
