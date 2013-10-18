package dit126.group4.group4shop.core;

import javax.management.relation.Role;

/**
 *
 * @author Christian
 */
public class Group4ShopFactory {
    
    private Group4ShopFactory(String puName) {
        Group4Shop s = new Group4Shop(puName);
    }
    
    public static IGroup4Shop getShop(String puName) {
        Group4Shop shop = new Group4Shop(puName);
        //init(shop);
        return shop;
    }
    
    private static void init(Group4Shop shop){
    }
}
