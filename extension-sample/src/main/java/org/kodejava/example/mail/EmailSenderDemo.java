package org.kodejava.example.mail;

import javax.mail.Session;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;
import java.util.Properties;

public class EmailSenderDemo {
    public static void main(String[] args) {
        String from = "user@some-domain.com";
        String to = "user@some-domain.com";
        String subject = "Hi There...";
        String text = "How are you?";

        //
        // A properties to store mail server smtp information such 
        // as the host name and the port number. With this properties 
        // we create a Session object from which we'll create the 
        // Message object.
        //
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.some-domain.com");
        properties.put("mail.smtp.port", "25");
        Session session = Session.getDefaultInstance(properties, null);

        try {
            //
            // Message is a mail message to be send through the 
            // Transport object. In the Message object we set the 
            // sender address and the recipient address. Both of
            // this address is a type of InternetAddress. For the 
            // recipient address we can also set the type of 
            // recipient, the value can be TO, CC or BCC. In the next
            // two lines we set the email subject and the content text.
            //
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));
            message.setSubject(subject);
            message.setText(text);

            //
            // Send the message to the recipient.
            //
            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}