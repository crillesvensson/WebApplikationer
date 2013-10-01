/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Group4
 */
@Entity 
@Table(name="RATING")
public class Rating {
    
    @Id
    private Long id;
    @Column(name="USER_ID") private Long user_ID;
    @Column(name="RATING") private String rating;
    
    
}
