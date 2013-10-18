package dit126.group4.group4shop_app.controller;

import dit126.group4.group4shop.core.Address;
import dit126.group4.group4shop.core.Users;
import dit126.group4.group4shop_app.model.Group4Shop;
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
    
    @Inject
    private Group4Shop shop;
    
    public void register(){
        Users customer = new Users(newCustomerBackingBean.getEmail(), newCustomerBackingBean.getFirstname(),
               newCustomerBackingBean.getLastname(), newCustomerBackingBean.getPassword());
//        Address address = new Address(newCustomerBackingBean.getCountry(), newCustomerBackingBean.getCity(),
//                newCustomerBackingBean.getPostalcode(), newCustomerBackingBean.getStreet(), newCustomerBackingBean.getStreetnumber(),
//                newCustomerBackingBean.getEmail());
 
        shop.getUserRegister().add(customer);
        //shop. Add address
        //return "SUCCESS"; // Else something went wrong.
        System.out.println("SUCCESS");
    }
    
}
