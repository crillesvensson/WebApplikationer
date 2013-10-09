package dit126.group4.group4shop.core;

/**
 *
 * @author Christian
 */
public class Group4ShopFactory {
    
    private Group4ShopFactory(String puName) {
        Group4Shop s = new Group4Shop(puName);
    }

    public static IGroup4Shop getShop(String puName) {
        return new Group4Shop(puName);
    }
}
