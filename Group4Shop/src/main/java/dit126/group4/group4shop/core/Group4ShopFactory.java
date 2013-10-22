package dit126.group4.group4shop.core;

/**
 *
 * @author Christian
 * 
 * 
 * 
 * 
 */
public class Group4ShopFactory {
    
    // Factory for shop
    
    private Group4ShopFactory(String puName) {
        Group4Shop s = new Group4Shop(puName);
    }
    
    public static IGroup4Shop getShop(String puName) {
        Group4Shop shop = new Group4Shop(puName);
        return shop;
    }
}