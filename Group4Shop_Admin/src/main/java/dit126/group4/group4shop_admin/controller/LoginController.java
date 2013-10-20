/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_admin.controller;

import dit126.group4.group4shop_admin.view.LoginBackingBean;
import java.io.IOException;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Group4
 */
@Named("loginController")
@RequestScoped
public class LoginController{
    
    @Inject
    private LoginBackingBean loginBackingBean;
    
    public String login() throws IOException{
        FacesContext context = FacesContext.getCurrentInstance();
        
        HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
        try {
            System.out.println("Emil testar och debuggar: " + loginBackingBean.getUsername() + " " +  loginBackingBean.getPassword() );
            
            /*if(request.isUserInRole("Admin")){
                System.out.println("Emil testar och debuggar45 : " );
            }*/
            
            request.login(loginBackingBean.getUsername(), loginBackingBean.getPassword());
            context.getExternalContext().redirect("../../index.xhtml");
        } catch(ServletException e){
            System.out.println("YES SOMETHING IS BLOCKING ME FROM LEGO IN");
            context.addMessage(null, new FacesMessage("Login Failed"));
            return null;
        }
       
        return null;
    }
    
    public void logout() throws IOException{
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        externalContext.invalidateSession();
        //externalContext.redirect("/content/home.xhtml");
        externalContext.redirect("/Group4Shop_Admin/views/login/login.xhtml");
    }
    
}
