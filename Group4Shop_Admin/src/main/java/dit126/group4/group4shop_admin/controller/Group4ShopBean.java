/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_admin.controller;

import dit126.group4.group4shop.core.Group4ShopFactory;
import dit126.group4.group4shop.core.IGroup4Shop;
import dit126.group4.group4shop.core.IProductCatalogue;
import java.io.Serializable;
import javax.inject.Singleton;

/**
 *
 * @author Christian
 */
@Singleton
public class Group4ShopBean implements Serializable{
    
    private final IGroup4Shop grou4shop;
    private final String PU_NAME = "group4_shop";
    
    private Group4ShopBean(){
        this.grou4shop = Group4ShopFactory.getShop(PU_NAME);
    }
    
    public IProductCatalogue getProductCatalogue(){
        return this.grou4shop.getProductCatalogue();
    }
    
}
