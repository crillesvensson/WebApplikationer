/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop.core;

/**
 *
 * @author Group4
 */
@Entity 
@Table(name="RATING")
public class Rating {
    @Column(name="USER_ID") private Long user_ID;
    @Column(name="RATING") private String rating;
    
    
}
