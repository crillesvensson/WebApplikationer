/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_admin;

import javax.ejb.Stateless;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;



/**
 *
 * @author Group4
 */

@Stateless
@Named
public class LoginBean {
    
    private String username;
    private String password;
    
    
    /**
     * Getter and setters
     *  
     */
    public String getUsername(){
        return this.username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void setPassword(){
        this.password = password;
    }
    
    /**
     * Login process 
     * All code from http://docs.oracle.com/javaee/6/tutorial/doc/glxce.html#glxdh
     */
    
    public String login(){
        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
        try {
            request.login(this.username, this.password);
        } catch(ServletException e){
            /*
            */
            context.addMessage(null, new FacesMessage("Login Failed"));
            return "error";
        }
        return "admin/index";
    }
    
    public void logout() {
        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) 
        context.getExternalContext().getRequest();
        try {
          request.logout();
        } catch (ServletException e) {
          /*
           */
          context.addMessage(null, new FacesMessage("Logout failed."));
        }
  }

    
    
}
