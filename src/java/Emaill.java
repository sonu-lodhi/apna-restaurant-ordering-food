import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Emaill {
public static boolean send(String to,String subject,String msg){
boolean flag=true;
        final String username = "kapiltank34@gmail.com";
        final String password = "9770201337";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("fromSomeone@gmail.com"));
            message.setContent(msg, "text/html; charset=utf-8");
            message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(to));
            message.setSubject(subject);
            //message.setText(msg);

            Transport.send(message);

            System.out.println("Done");

        } 

        catch (MessagingException e) 
        {
            flag=false;
            // throw new RuntimeException(e);
            System.out.println("Username or Password are incorrect ... exiting !");
        }
	return  flag;
}
}
