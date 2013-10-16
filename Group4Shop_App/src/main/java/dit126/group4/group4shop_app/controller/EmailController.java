/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_app.controller;

import dit126.group4.group4shop_app.view.ContactBackingBean;
import java.io.Serializable;
import java.util.Date;
import java.util.Properties;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Group4
 */
@Named("emailController")
public class EmailController implements Serializable{
    
    @Inject 
    private ContactBackingBean contactBackingBean;
    
    private String host = FacesContext.getCurrentInstance().getExternalContext().getInitParameter("host");
    private String port = FacesContext.getCurrentInstance().getExternalContext().getInitParameter("port");
    private String user = FacesContext.getCurrentInstance().getExternalContext().getInitParameter("user");
    private String pass = FacesContext.getCurrentInstance().getExternalContext().getInitParameter("pass");
   
    private String recipient = "info@emilbogren.se";
   
    public void sendEmail(){
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        
        Authenticator auth = new Authenticator() {
            @Override
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, pass);
            }
        };
       
        Session session = Session.getInstance(properties, auth);
        
        Message msg = new MimeMessage(session);
        try {
            msg.setFrom(new InternetAddress(contactBackingBean.getFrom()));
            InternetAddress[] toAddresses = { new InternetAddress(recipient) };
            InternetAddress[] fromAddresses = { new InternetAddress(contactBackingBean.getFrom()) };
            msg.setRecipients(Message.RecipientType.TO, toAddresses);
            msg.setReplyTo(fromAddresses);
            msg.setSubject(contactBackingBean.getSubject());
            msg.setSentDate(new Date());
            msg.setText(contactBackingBean.getContent());

            Transport.send(msg);
        } catch (Exception e) {
            // Catch exception.
        }
    }
}
