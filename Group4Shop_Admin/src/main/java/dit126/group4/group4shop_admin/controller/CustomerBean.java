
package dit126.group4.group4shop_admin.controller;

import dit126.group4.group4shop_admin.model.Group4Shop;
import dit126.group4.group4shop.core.Users;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Christian
 */
@Named("customers")
@RequestScoped
public class CustomerBean implements Serializable{
    
    @Inject
    private Group4Shop group4shop;
    
    @PostConstruct
    public void post() {

    } 
    
    
   public List<Users> getCustomers(){
        return getUsers("user");
    }
   
   public List<Users> getAdmins(){
       return getUsers("admin");
   }
   
   
   private List<Users> getUsers(String role){
       int count = group4shop.getUserRegister().getCount();
        List<Users> chosenUsers = new ArrayList<>();
        if(count > 0){
            for(Users u : group4shop.getUserRegister().getRange(0, count)){
                if(group4shop.getUserRolesRegister().get(u.getEmail()).getRole().getRolename().equals(role))
                    chosenUsers.add(u);
            }  
        }
        return chosenUsers;
   }
}
