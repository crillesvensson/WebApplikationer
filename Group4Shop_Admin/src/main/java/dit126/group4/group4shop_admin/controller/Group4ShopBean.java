/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_admin.controller;

import dit126.group4.group4shop.core.Group4ShopFactory;
import dit126.group4.group4shop.core.IAddressCatalogue;
import dit126.group4.group4shop.core.IGroup4Shop;
import dit126.group4.group4shop.core.IOrderBook;
import dit126.group4.group4shop.core.IOrderItemCatalogue;
import dit126.group4.group4shop.core.IProductCatalogue;
import dit126.group4.group4shop.core.IProductImageContainer;
import dit126.group4.group4shop.core.IRatingCatalogue;
import dit126.group4.group4shop.core.RolesRegister;
import dit126.group4.group4shop.core.IUserRegister;
import dit126.group4.group4shop.core.IUserRolesRegister;
import java.io.Serializable;
import javax.inject.Singleton;

/**
 *
 * @author Christian
 */
@Singleton
public class Group4ShopBean implements Serializable{
    
    private final IGroup4Shop group4shop;
    private final String PU_NAME = "group4_shop";
    
    private Group4ShopBean(){
        this.group4shop = Group4ShopFactory.getShop(PU_NAME);
    }
    
    public IProductCatalogue getProductCatalogue(){
        return this.group4shop.getProductCatalogue();
    }
    
    public IProductImageContainer getProductImageContainer(){
        return this.group4shop.getProductImageConatiner();
    }
    
    public IUserRegister getUserRegister(){
        return this.group4shop.getUserRegister();
    }
    
    public IOrderBook getOrderBook(){
        return this.group4shop.getOrderBook();
    }
    
    public IRatingCatalogue getRatingCatalogue(){
        return this.group4shop.getRatingCatalogue();
    }
    
   public IOrderItemCatalogue getOrderItemCatalgoue(){
       return this.group4shop.getOrderItemCatalogue();
   }
   
   public IAddressCatalogue getAddressCatalogue(){
       return this.group4shop.getAddressCatalogue();
   }
   
   public IUserRolesRegister getUserRolesRegister(){
       return this.group4shop.getUserRolesRegister();
   }
   
   public RolesRegister getRolesRegister(){
        return this.group4shop.getRolesRegister();
    }
            
    
}
