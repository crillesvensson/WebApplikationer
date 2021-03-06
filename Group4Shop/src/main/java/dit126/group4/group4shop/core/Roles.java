package dit126.group4.group4shop.core;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Group4
 * 
 * Class for representaion of the user roles (currently user and admin)
 * 
 */

@Entity
@Table(name="Roles")
public class Roles implements Serializable {
    
    @Id
    @Column(name="ROLENAME", nullable = false) 
    private String rolename;
    @Column(name="DESCRIPTION") 
    private String description;
        
    public Roles(){}
    
    public Roles(String rolename, String description){
        this.rolename = rolename;
        this.description = description;
    }
    public String getRolename(){
        return this.rolename;
    }
    
    public String getDescription(){
        return this.description;
    }
}
