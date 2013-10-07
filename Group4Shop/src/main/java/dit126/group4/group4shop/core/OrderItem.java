package dit126.group4.group4shop.core;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * A class that will be used when adding things to the shopping cart. A product
 * with a quantity
 * 
 * @author David
 */

@Entity
@Table(name="ORDERITEMS")
public class OrderItem implements Serializable{
    
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;
    
    @ManyToOne
    @Column(name = "PRODUCT")
    private Product product;
    
    @Column(name = "QUANTITY")
    private int quantity;
    
    protected OrderItem(){
    }
    
    public OrderItem(Long id, Product prod, int quantity){
        this.id = id;
        product = prod;
        this.quantity = quantity;
    }
    
    public Product getProduct(){
        return product;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    @Override
    public String toString(){
        return "OrderItem{" + "product=" + product + ", quantity=" + quantity + "}";
    }
    
}
