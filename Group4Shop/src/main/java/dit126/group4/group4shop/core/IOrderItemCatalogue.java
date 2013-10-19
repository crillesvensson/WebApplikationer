/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dit126.group4.group4shop.core;

import dit126.group4.group4shop.utils.IDAO;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface IOrderItemCatalogue extends IDAO<OrderItem, Long>{
    
    public List<OrderItem> getForPurchaseOrder(Long id);
    
}
