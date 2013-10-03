package dit126.group4.group4shop.core;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;

/**
 *
 * @author Group4
 */

@Entity
@Table(name="PRODUCT")
public class Product implements Serializable {
    
    @Id
    @NotNull
    @Column(name="ID") 
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
        return this.id;
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
    
}
