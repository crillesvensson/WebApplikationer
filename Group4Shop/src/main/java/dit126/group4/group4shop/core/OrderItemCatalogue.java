/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dit126.group4.group4shop.core;

import dit126.group4.group4shop.utils.AbstractDAO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Christian
 */
public class OrderItemCatalogue extends AbstractDAO<OrderItem, Long> implements IOrderItemCatalogue{
    
    public OrderItemCatalogue(String puName){
        super(OrderItem.class, puName);
    }

    @Override
    public List<OrderItem> getForPurchaseOrder(Long id) {
        List<OrderItem> found = new ArrayList<>();
   /*     for (OrderItem oi : getRange(0, getCount())) {
            if (oi.getPurchaseOrderId().equals(id)) {
                
                found.add(oi);
            }
        }
*/        return found;
    }
    
}
