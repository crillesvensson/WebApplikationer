package dit126.group4.group4shop_app.controller;

import dit126.group4.group4shop.core.Address;
import dit126.group4.group4shop.core.Roles;
import dit126.group4.group4shop.core.UserRoles;
import dit126.group4.group4shop.core.Users;
import dit126.group4.group4shop_app.model.Group4Shop;
import dit126.group4.group4shop_app.view.LoginBackingBean;
import dit126.group4.group4shop_app.view.NewCustomerBackingBean;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

/**
 *
 * @author Group4
 */
@Named("newcustomerController")
@RequestScoped
public class NewCustomerController {
    
    @Inject
    private NewCustomerBackingBean newCustomerBackingBean;
    
    @Inject
    private Provider<Group4Shop> shop;
    
    @Inject
    private Provider<LoginController> loginController;
    
    @Inject
    private LoginBackingBean loginBackingBean;
    
    
    public void register(){
        Users newCustomer = new Users(newCustomerBackingBean.getEmail(), newCustomerBackingBean.getFirstname(),
               newCustomerBackingBean.getLastname(), newCustomerBackingBean.getPassword());
        Address address = new Address(newCustomerBackingBean.getCountry(), newCustomerBackingBean.getCity(),
                newCustomerBackingBean.getPostalcode(), newCustomerBackingBean.getStreet(), newCustomerBackingBean.getStreetnumber(),
                newCustomerBackingBean.getEmail());
        
        shop.get().getUserRegister().add(newCustomer);
        shop.get().getAddressCatalogue().add(address);
        
        Roles role = shop.get().getRolesRegister().get("user");
        UserRoles newCustomerWithRole = new UserRoles(newCustomer, role);
        shop.get().getUserRoleRegister().add(newCustomerWithRole);
        
        loginRegisteredUser();
        
    }
    
    
    private void loginRegisteredUser(){
        try{
            loginBackingBean.setUsername(newCustomerBackingBean.getEmail());
            loginBackingBean.setPassword(newCustomerBackingBean.getPassword());
   
            loginController.get().login();
        } catch(Exception e){
            System.out.println("Failed to login newly registered user! " + e.getMessage());
        }
        
    }
    
}
