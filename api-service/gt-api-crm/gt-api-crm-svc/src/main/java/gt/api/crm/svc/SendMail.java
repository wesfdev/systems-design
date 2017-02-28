/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.api.crm.svc;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
/**
 *
 * @author wesly
 */
public class SendMail {

    final String username = "wesly.fernandez1@gmail.com";
    final String password = "wesfer1994**";
    
    public void sendEmail(){

        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("wesly.fernandez1@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("wesly_fernandez1@outlook.com"));
            message.setSubject("Testing Subject");

            Multipart multipart = new MimeMultipart();
            
            MimeBodyPart messageBodyPart  = new MimeBodyPart();            
            messageBodyPart.setText("Dear Mail Wes, No spam to my email, please!");
            
            //MimeBodyPart attachmentBodyPart= new MimeBodyPart();
            //String path = SendMail.class.getResource("/META-INF/test.txt").getPath();
            //System.out.println(path);        
            //String file = path;
            //String fileName = "DocumentoAdjunto";
            //DataSource source = new FileDataSource(file);
            
            
            //attachmentBodyPart.setDataHandler(new DataHandler(source));
            //attachmentBodyPart.setFileName(fileName);
            multipart.addBodyPart(messageBodyPart);
            //multipart.addBodyPart(attachmentBodyPart);
            message.setContent(multipart);

            System.out.println("Sending");

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }        
        
    }
    
}
