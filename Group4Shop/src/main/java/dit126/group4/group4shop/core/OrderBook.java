package dit126.group4.group4shop.core;

import dit126.group4.group4shop.utils.AbstractDAO;
import java.util.ArrayList;
import java.util.List;

/**
 * All orders
 *
 * @author hajo
 */
public final class OrderBook extends AbstractDAO<PurchaseOrder, Long> implements IOrderBook {
    
    public OrderBook(String puName) {
        super(PurchaseOrder.class, puName);
    }

    @Override
    public List<PurchaseOrder> getByUser(Users user) {
        List<PurchaseOrder> found = new ArrayList<>();
        for (PurchaseOrder po : getRange(0, getCount())) {
            if (po.getUser().equals(user)) {
                found.add(po);
            }
        }
        return found;
    }
    
}
