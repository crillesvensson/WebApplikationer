/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
@Table(name="ADMINS")
public class Admin implements Serializable {
    @Id
    @Column(name="EMAIL") 
    private String email;
    @Column(name="PASSWORD") private String password; // Should be changed to a more secure 
    @Column(name="FIRSTNAME") private String firstname; 
    @Column(name="LASTNAME") private String lastname;  


}
