package dit126.group4.group4shop_app.client;

import dit126.group4.group4shop.core.Group4ShopFactory;
import dit126.group4.group4shop.core.IGroup4Shop;
import dit126.group4.group4shop.core.IProductCatalogue;

/**
 * Singleton Group4Shop
 * 
 * @author David
 */

public class Group4Shop {
    
    private static IGroup4Shop shop = null;
    final static String PU = "group4_shop";

    protected Group4Shop() {
        }
    
    public static IGroup4Shop getInstance() {
      if(shop == null) {
         shop = Group4ShopFactory.getShop(PU);
      }
      return shop;
   }

    public IProductCatalogue getProductCatalogue() {
        return shop.getProductCatalogue();
    }
}

