package dit126.group4.group4shop.core;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name="ID", nullable = false)
    private Long id;
    
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Users user;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "PURCHASEORDER")
    private List<OrderItem> items;
    
    @Column(name = "DATE")
    @Temporal(TemporalType.DATE)
    private Date date;
    
    @Column(name="HANDLED")
    private boolean handled;
    
    protected PurchaseOrder(){
    }
    
    public PurchaseOrder(Users user, List<OrderItem> items){
        this.user = user;
        this.items = items;
        this.date = new Date();
        this.handled = false;
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
    
    public boolean getHandled(){
        return this.handled;
    }
    
    public void setHandled(boolean handled){
        this.handled = handled;
    }
    
    @Override
    public String toString() {
        return "PurchaseOrder{" + "id=" + getId() + ", date=" + date
                + ", items=" /*+ items*/ + ", user=" + user +"}";
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 113 * hash + Objects.hashCode(this.id);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PurchaseOrder other = (PurchaseOrder) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
