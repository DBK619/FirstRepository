package normalExcelPackage;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class EmailAttachmentsss {

	

	public static void main(String[] args) throws EmailException {
		  // Create the attachment
		  EmailAttachment attachment = new EmailAttachment();
		  attachment.setPath("C:\\Users\\Dinesh\\Music\\example.PNG");
		  attachment.setDisposition(EmailAttachment.ATTACHMENT);
		  attachment.setDescription("Picture of John");
		  attachment.setName("John");

		  // Create the email message
		  MultiPartEmail e = new MultiPartEmail();
		  e.setHostName("smtp.gmail.com");
			e.setSmtpPort(465);
			e.setAuthenticator(new DefaultAuthenticator("kdinebab@gmail.com","H@rwoods0s"));
			e.setSSL(true);
			e.setFrom("kdinebab@gmail.com");
			e.setSubject("Test Subject");
			e.setMsg("Test message");
			e.addTo("ckmdineshbabu@gmail.com");
			e.send();

		  // add the attachment
		  e.attach(attachment);

		  // send the email
		  e.send();

	}

}
