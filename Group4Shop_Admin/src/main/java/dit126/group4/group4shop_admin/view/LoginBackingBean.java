/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_admin.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Group4
 */
@Named("auth")
@RequestScoped
public class LoginBackingBean {
    
    private String username;
    private String password;
    
    
    public String getUsername(){
        return this.username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
}
