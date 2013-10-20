/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_app.controller;

import dit126.group4.group4shop_app.model.CurrentUserBackingBean;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author emilbogren
 */
@Named("currentUserController")
@RequestScoped
public class CurrentUserController {
    
    @Inject 
    private CurrentUserBackingBean currentUserBackingBean;
    
}
