package dit126.group4.group4shop_app.client;

import javax.faces.application.FacesMessage;
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
public class LoginController {
    
    @Inject
    private LoginBackingBean loginBackingBean;
    
    @Inject 
    private NavigationController navigationController;
    
    public String login(){
        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
        try {
            System.out.println("Emil testar och debuggar: " + loginBackingBean.getUsername() + " " +  loginBackingBean.getPassword() );     
            request.login(loginBackingBean.getUsername(), loginBackingBean.getPassword());
        } catch(ServletException e){
            System.out.println("YES SOMETHING IS BLOCKING ME FROM LEGO IN");
            context.addMessage(null, new FacesMessage("Login Failed"));
            return navigationController.loginFailed();
        }
        return navigationController.loginSuccess();
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
