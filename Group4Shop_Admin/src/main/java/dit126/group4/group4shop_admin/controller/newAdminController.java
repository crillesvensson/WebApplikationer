/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dit126.group4.group4shop_admin.controller;

import dit126.group4.group4shop.core.Address;
import dit126.group4.group4shop.core.Roles;
import dit126.group4.group4shop.core.UserRoles;
import dit126.group4.group4shop.core.Users;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Christian
 */
@Named("newadmincontroller")
@RequestScoped
public class newAdminController {
    
    @Inject
    private NewAdminBean adminBean;
    
    @Inject
    private Group4ShopBean group4shop;
    
    public void addAdmin(){
        Users newAdmin = new Users(adminBean.getEmail(), adminBean.getFirstname(),
               adminBean.getLastname(), adminBean.getPassword());
        Address address = new Address(adminBean.getCountry(), adminBean.getCity(),
                adminBean.getPostalcode(), adminBean.getStreet(), adminBean.getStreetnumber(),
                adminBean.getEmail());
        
        group4shop.getUserRegister().add(newAdmin);
        group4shop.getAddressCatalogue().add(address);
        
        Roles role = group4shop.getRolesRegister().find("admin");
        UserRoles newCustomerWithRole = new UserRoles(newAdmin, role);
        group4shop.getUserRolesRegister().add(newCustomerWithRole);
    }
    
    
}
