package dit126.group4.group4shop.core;

import java.io.Serializable;
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
public class Rating implements Serializable {
    
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name="USER_ID") private String user_Email;
    @Column(name="PRODUCT_ID") private Long product_ID;
    @Column(name="RATING") private int rating;
    @Column(name="COMMENT") private String comment;
    
    protected Rating(){}
    
    public Rating(Long id, String user_Email, Long product_id, int rating, String comment){
        this.id = id;
        this.user_Email = user_Email;
        this.product_ID = product_id;
        this.rating = rating; 
        this.comment = comment; 
    }
    
    public Long getId(){
        return this.id;
    }
    
    public String getUserId(){
        return this.user_Email;
    }
    
    public int getRating(){
        return this.rating;
    }
    
    public Long getProductId(){
        return this.product_ID;
    }
    
}
