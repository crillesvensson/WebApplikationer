package dit126.group4.group4shop.core;

import dit126.group4.group4shop.utils.IDAO;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface IOrderItemCatalogue extends IDAO<OrderItem, Long>{
    
    public List<OrderItem> getForPurchaseOrder(Long id);
    
    public List<OrderItem> getForProduct(Long id);

}
