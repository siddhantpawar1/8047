package Practise;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmaildemo {

	public static void main(String[] args) throws EmailException {
		
		
		System.out.println("-----Test Started-------");
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		
		email.setAuthenticator(new DefaultAuthenticator("siddhantpawartesting@gmail.com", "Prisidd@2114"));
		email.setSSLOnConnect(true);
		email.setFrom("siddhantpawartesting@gmail.com");
		email.setSubject("Selenium Test Report");
		email.setMsg("This is a test mail from selenium");
		email.addTo("priyanka140592@gmail.com");
		email.send();
		System.out.println("===Email Sent===");
	
	}
	
	

}