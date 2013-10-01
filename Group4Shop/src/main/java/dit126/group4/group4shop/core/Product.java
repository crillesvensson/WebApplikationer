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
    
    protected Product(String name, Double price, String description){
        this.name = name;
        this.price = price;
        this.description = description;
    }
    
    
    
    
}
