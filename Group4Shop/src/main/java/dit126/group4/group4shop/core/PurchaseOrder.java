package dit126.group4.group4shop.core;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * This class will be used to complete a purchase with the list of order items.
 * 
 * @author David
 */

@Entity
@Table(name="PURCHASEORDERS")
public class PurchaseOrder implements Serializable{
    
    @Id
    @Column(name="ID", nullable = false)
    Long id;
    
    @ManyToOne(cascade = CascadeType.REFRESH)
    @Column(name="USER")
    private Users user;
    
    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "ORDERITEMS")
    private List<OrderItem> items;
    
    @Column(name = "DATE")
    @Temporal(TemporalType.DATE)
    private Date date;
    
    protected PurchaseOrder(){
    }

    public PurchaseOrder(Long id, Users user, List<OrderItem> items, Date date){
        this.id = id;
        this.user = user;
        this.items = items;
        this.date = date;
    }
    
    public Long getId(){
        return id;
    }
    
    public Users getUser(){
        return user;
    }
    
    public List<OrderItem> getOrderItems(){
        return items;
    }
    
    public Date getDate(){
        return date;
    }
}
