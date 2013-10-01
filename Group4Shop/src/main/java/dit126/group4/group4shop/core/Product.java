package dit126.group4.group4shop.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Group4
 */

@Entity
@Table(name="PRODUCT")
public class Product {
    @Column(name="ID") private Long id;
    @Column(name="NAME") private String name; 
    @Column(name="PRICE") private Double price;
    @Column(name="DESCRIPTION") private String description;    
    
    
}
