package dit126.group4.group4shop_app.model;

import dit126.group4.group4shop.core.Group4ShopFactory;
import dit126.group4.group4shop.core.IGroup4Shop;
import dit126.group4.group4shop.core.IProductCatalogue;
//import dit126.group4.group4shop.core.IShoppingCart;
import dit126.group4.group4shop.core.IUserRegister;
import java.io.Serializable;
import javax.inject.Singleton;


/**
 * Singleton Group4Shop
 * 
 * @author David
 */

@Singleton
public class Group4Shop implements Serializable{
    
    private final String PU = "group4_shop";
    private final IGroup4Shop shop; 
    
    
    private Group4Shop() {
        this.shop = Group4ShopFactory.getShop(PU);
    }
    
    public IProductCatalogue getProductCatalogue() {
        return this.shop.getProductCatalogue();
    }

    
    public IUserRegister getUserRegister(){
        return this.shop.getUserRegister();
    }
    
//    public IShoppingCart getIShoppingCart(){
//        return shop.getShoppingCart();
//    } 
}

