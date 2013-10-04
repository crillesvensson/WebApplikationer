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
@Table(name="USERS")
public class User implements Serializable {
    
    //private Long id; email could be id for each customer since we force them to log in 
    @Column(name="FIRSTNAME") private String firstName;
    @Column(name="LASTNAME") private String lastName;
    @Column(name="PASSWORD") private String password; // shoule be changed to use a more secure method 
    
    @Id
    @Column(name="EMAIL", nullable = false)
    @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@\n" +
        "(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Not a valid email!")
    private String email; // key when storing users in table.    
    
    protected User(){}
    
    protected User(String email, String firstname, String lastname, String password){
        this.email = email;
        this.firstName = firstname;
        this.lastName = lastname;
        this.password = password;
    }
    
}
