/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dit126.group4.group4shop_admin.controller;

import dit126.group4.group4shop.core.Users;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

/**
 *
 * @author Christian
 */
@Named("showcustomer")
@SessionScoped
public class ShowCustomerBean implements Serializable{
    
    private String email;
    private String firstName;
    private String lastName;
    
    @Inject
    private Provider<Group4ShopBean> group4shop;
    
    public void selectedCustomer(String email){
        Users user = group4shop.get().getUserRegister().find(email);
        this.email = user.getEmail();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
}
