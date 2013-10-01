/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop.core;

/**
 *
 * @author Christian
 */
public class Group4ShopFactory {
        
    private Group4ShopFactory() {
    }

    public static IGroup4Shop getShop(String persistenceUnitName) {
        return new Group4Shop(persistenceUnitName);
    }
}
