/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop.core;

import java.util.List;

/**
 *
 * @author emilbogren
 */
public interface IShoppingCart {
    
    public void add(Product product);
    
    public void remove(Product product);
    
    public List<OrderItem> getAsOrderItems();
}
