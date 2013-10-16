/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_app.controller;

//import dit126.group4.group4shop.core.User;
import dit126.group4.group4shop_app.view.NewCustomerBackingBean;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Group4
 */
@Named("newcustomerController")
public class NewCustomerController {
    
    @Inject
    private NewCustomerBackingBean newCustomerBackingBean;
    
    //@Inject
    //private Shop shop;
    
    public String register(){
        //User customer = new User();
        //Address address = new Address();
        //Add address to user
        //shop.getCustomerRegister().add(c)
        return "SUCCESS"; // Else something went wrong. 
    }
    
}
