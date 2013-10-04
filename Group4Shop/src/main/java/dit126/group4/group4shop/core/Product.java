package dit126.group4.group4shop.core;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Group4
 */

@Entity(name="PRODUCT")
@Table(name="PRODUCT")
public class Product implements Serializable {
    
    @Id
    @Column(name="ID", nullable = false) 
    private Long id;
    @Column(name="NAME") private String name; 
    @Column(name="PRICE") private Double price;
    @Column(name="DESCRIPTION") private String description;    
    
    protected Product(){}
    
    public Product(Long id, String name, Double price, String description){
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }
    
    public Long getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public Double getPrice(){
        return price;
    }
    
    public String getDescription(){
        return description;
    }
    
    @Override
    public String toString() {
        return "Product{" + "id=" + getId() + ", name=" + name + ", price=" + price + ", description=" + getDescription() + '}';
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
        final Product other = (Product) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
