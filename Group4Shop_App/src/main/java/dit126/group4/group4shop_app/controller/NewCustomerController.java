/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_app.controller;

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
    
    public void register(){
        /**
         * Add user and register.
         * 
         */
        try{
            
        } catch(Exception e){
            /**
             * if something went wrong ? 
             */
        }
    }
    
}
