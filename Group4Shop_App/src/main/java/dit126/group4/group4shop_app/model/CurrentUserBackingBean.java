/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_app.model;

import dit126.group4.group4shop.core.Address;
import dit126.group4.group4shop.core.Users;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author emilbogren
 */
@Named("currentUserBean")
@RequestScoped
public class CurrentUserBackingBean implements Serializable{
    
    @Inject
    private Group4Shop shop;
    
    private String username = FacesContext.getCurrentInstance().getExternalContext().getRemoteUser();
    
    //private Users user = shop.getUserRegister().find(username);
    
    public Users getCurrentUser(){
        System.out.println("EMil TESTAR OCH DEBUGGAR : " + username + " " + shop.getUserRegister().find(username) );
        return shop.getUserRegister().find(username);
    }     
    
    public List<Address> getCurrentAddress(){
        return shop.getAddressCatalogue().find(username);
    } 
}
