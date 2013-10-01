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
@Table(name="USER")
public class User {
    
    //private Long id; email could be id for each customer since we force them to log in 
    @Column(name="FIRSTNAME") private String firstName;
    @Column(name="LASTNAME") private String lastName;
    @Column(name="PASSWORD") private String password; // shoule be changed to use a more secure method 
    @Column(name="EMAIL") @Id private String email; // key when storing users in table.  
}
