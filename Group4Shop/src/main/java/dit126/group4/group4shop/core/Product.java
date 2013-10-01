package dit126.group4.group4shop.core;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Group4
 */

@Entity
<<<<<<< HEAD
@Table(name="PRODUCT")
=======
//@Table("PRODUCT")
>>>>>>> 6a7ec6fe5228e1020eabee32b5dffb230253390e
public class Product {
    @Column(name="ID") private Long id;
    @Column(name="NAME") private String name; 
    @Column(name="PRICE") private Double price;
    @Column(name="DESCRIPTION") private String description;    
    
    
}
