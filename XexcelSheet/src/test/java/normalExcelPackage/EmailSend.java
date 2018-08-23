package normalExcelPackage;

import javax.mail.Authenticator;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailSend {

	public static void main(String[] args) throws EmailException {
		
		System.out.println("Test Started");
		Email e=new SimpleEmail();
		e.setHostName("smtp.gmail.com");
		e.setSmtpPort(465);
		e.setAuthenticator(new DefaultAuthenticator("kdinebab@gmail.com","H@rwoods0s"));
		e.setSSL(true);
		e.setFrom("kdinebab@gmail.com");
		e.setSubject("Test Subject");
		e.setMsg("Test message");
		e.addTo("ckmdineshbabu@gmail.com");
		e.send();
		System.out.println("Test Completed");
		
		

	}

}
