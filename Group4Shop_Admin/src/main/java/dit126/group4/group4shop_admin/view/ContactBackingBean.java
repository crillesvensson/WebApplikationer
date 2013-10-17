/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_admin.view;


import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author emilbogren
 */
@Named("contactBean")
@RequestScoped
public class ContactBackingBean {
 
    private String from = "group4@emilbogren.se";
    private String subject;
    private String content;
    
    public void setSubject(String subject){
        this.subject = subject;
    }
    
    public void setContent(String content){
        this.content = content;
    }
    
    public String getContent(){
        return content;
    }
    public String getFrom(){
        return from;
    }
    public String getSubject(){
        return subject;
    }
}
