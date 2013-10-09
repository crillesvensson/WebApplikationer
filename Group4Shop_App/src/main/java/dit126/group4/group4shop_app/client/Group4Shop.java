package dit126.group4.group4shop_app.client;

import dit126.group4.group4shop.core.Group4ShopFactory;
import dit126.group4.group4shop.core.IGroup4Shop;
import dit126.group4.group4shop.core.IProductCatalogue;

/**
 * Singleton Group4Shop
 * 
 * @author David
 */
public enum Group4Shop {
    INSTANCE;
    
    private final IGroup4Shop shop;
    private final String PU = "group4_shop";
    private final String TEST_PU = "group4_test_shop";
    
    private Group4Shop(){
        shop = Group4ShopFactory.getShop(TEST_PU);
    }
    
    public IProductCatalogue getProductCatalogue(){
        return shop.getProductCatalogue();
    }
}
