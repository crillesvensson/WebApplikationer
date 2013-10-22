package dit126.group4.group4shop.core;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Group4
 * 
 * Class representing the users in database
 */

@Entity
@Table(name="USERS")
public class Users implements Serializable {
    
    //private Long id; email could be id for each customer since we force them to log in 
    @Column(name="FIRSTNAME") 
    private String firstName;
    
    @Column(name="LASTNAME") 
    private String lastName;
    
    @Column(name="PASSWORD") 
    private String password; // should be changed to use a more secure method 
    
    @Transient 
    private transient ShoppingCart cart = new ShoppingCart();
    
    @Id
    @Column(name="EMAIL", nullable = false)
    //@Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@\n" +
      //  "(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Not a valid email!")
    private String email; // key when storing users in table.    
    
    public Users(){}
    
    public Users(String email, String firstname, String lastname, String password){
        this.email = email;
        this.firstName = firstname;
        this.lastName = lastname;
        this.password = password;
    }
    
    public ShoppingCart getCart(){
        return cart;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getPassword(){
        return password;
    }
    
    
    @Override
    public String toString() {
        return "User{" + "firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ",password=" + password + '}';
    }
    
     @Override
    public int hashCode() {
        int hash = 7;
        hash = 113 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Users other = (Users) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }
    

}
