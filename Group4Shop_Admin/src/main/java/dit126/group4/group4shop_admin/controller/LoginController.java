/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_admin.controller;

import dit126.group4.group4shop_admin.view.LoginBackingBean;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author emilbogren
 */
public class LoginController {
    
    
    @Inject
    private LoginBackingBean loginBackingBean;
    
    public String login(){
        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
        try {
            request.login(loginBackingBean.getUsername(), loginBackingBean.getPassword());
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
