package dit126.group4.group4shop.core;

import java.io.Serializable;
import javax.persistence.CascadeType;
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
@Table(name="ORDERITEM")
public class OrderItem implements Serializable{
    
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;
    
    @ManyToOne
    private Product product;
    
    @Column(name = "QUANTITY", nullable = false)
    private int quantity;
    
   /* @Column(name ="PURCHASE_ORDER_ID", nullable = false)
    private Long purchase_order;
    */
    protected OrderItem(){
    }
    
    public OrderItem(Long id, Product prod, int quantity){
        this.id = id;
        product = prod;
        this.quantity = quantity;
        //this.purchase_order = purchase_order;
    }
    
    public Long getId(){
        return this.id;
    }
    
    public Product getProduct(){
        return product;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public Double getTotal(){
        return quantity*product.getPrice();
    }
    
 /*   public Long getPurchaseOrderId(){
        return this.purchase_order;
    }
   */ 
    @Override
    public String toString(){
        return "OrderItem{" + "product=" + product + ", quantity=" + quantity + "}";
    }
    
}
