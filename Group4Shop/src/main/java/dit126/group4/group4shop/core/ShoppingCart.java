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
public class ShoppingCart /*implements IShoppingCart*/{
 
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
        productFreq.clear();
        return items;
    }
    
    public String getTotalPrice(){
        Double total = 0.0;
        for (OrderItem item : getAsOrderItems()){
            Double subTotal = item.getQuantity() * item.getProduct().getPrice();
            total = total + subTotal;
        }
        return total.toString();
    }

    @Override
    public String toString() {
        return "ShoppingCart{" + "productFreq=" + productFreq.toString() + "}";
    }
}
