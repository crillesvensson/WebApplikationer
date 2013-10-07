/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop.core;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Group4
 */
@Entity
@Table(name="USERROLES")
public class UserRoles implements Serializable {
    
    @Id
    @OneToOne
    private Users user_name; 
    
    @OneToOne
    private Roles role;
    
    public UserRoles(){}
    
    public UserRoles(Users user, Roles role){
        this.user_name = user;
        this.role = role;
    }


}