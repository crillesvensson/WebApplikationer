
package dit126.group4.group4shop_admin.controller;

import dit126.group4.group4shop.core.Users;
import java.io.Serializable;
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
    private Group4ShopBean group4shop;
    
    @PostConstruct
    public void post() {

    } 
    
    
   public List<Users> getCustomers(){
        int count = group4shop.getUserRegister().getCount();
        List<Users> usersList = group4shop.getUserRegister().getRange(0, count);
        System.out.println(usersList.get(0).getEmail());
        return usersList;
    }
}
