package dit126.group4.group4shop.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Simple shopping cart
 * 
 * @author hajo
 */
public class ShoppingCart {
 
    private final Map<Product, Integer> productFreq = new HashMap<>();

    public void add(Product product) {
        int i = 1;
        if( productFreq.containsKey(product)) {
            i = productFreq.get(product) + 1;     
        }
        productFreq.put(product, i);
    }

    public void remove(Product product) {       
        int i = productFreq.get(product);
        if( i > 1){
            productFreq.put(product, --i);
        }else{
            productFreq.remove(product);
        }
    }

    public List<OrderItem> getAsOrderItems() {
        List<OrderItem> items = new ArrayList<>();
        for (Map.Entry<Product, Integer> e : productFreq.entrySet()) {
            Long id = e.getKey().getId();
            items.add(new OrderItem(id, e.getKey(), e.getValue()));
        }
        return items;
    }
    
    public String getTotalPrice(){
        Double total = 0.0;
        for (OrderItem item : getAsOrderItems()){
            total = total + item.getTotal();
        }
        return total.toString();
    }

    public void clearShoppingCart(){
        productFreq.clear();
    }
    
    @Override
    public String toString() {
        return "ShoppingCart{" + "productFreq=" + productFreq.toString() + "}";
    }
}
