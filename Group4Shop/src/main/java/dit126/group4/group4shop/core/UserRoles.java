package dit126.group4.group4shop.core;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Group4
 * 
 * Class for pairing users with a userrole
 */
@Entity
@Table(name="USERROLES")
public class UserRoles implements Serializable {
    
    @Id
    @OneToOne
    @JoinColumn(name="EMAIL")
    
    private Users username; 
    
    @OneToOne
    @JoinColumn(name="ROLENAME")
    private Roles role;
    
    public UserRoles(){}
    
    public UserRoles(Users user, Roles role){
        this.username = user;
        this.role = role;
    }
    
    public Users getUsername(){
        return this.username;
    }

    public Roles getRole(){
        return this.role;
    }
}