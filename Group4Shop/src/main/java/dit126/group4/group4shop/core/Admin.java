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

// Subclass - Same variables in both classes. 

@Entity
@Table(name="ADMINS")
public class Admin implements Serializable {
    @Id
    @Column(name="EMAIL", nullable = false)
    //@Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@\n" +
        //"(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Not a valid email!")
    private String email;
    @Column(name="PASSWORD") private String password; // Should be changed to a more secure 
    @Column(name="FIRSTNAME") private String firstname; 
    @Column(name="LASTNAME") private String lastname;  
    
    protected Admin(){}
    
    protected Admin(String email, String firstname, String lastname, String password){
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
    }
}
