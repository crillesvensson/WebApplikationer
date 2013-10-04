/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_admin.beans;

import dit126.group4.group4shop_admin.util.Group4ShopBean;
import java.io.Serializable;
import javax.faces.bean.SessionScoped;

import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Christian
 */
@Named("products")
@SessionScoped
public class ProductBean implements Serializable{
    
    @Inject
    private Group4ShopBean group4shop;
    
    
    
  
    
}
