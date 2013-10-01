package dit126.group4.group4shop.core;

/**
 *
 * @author Group4
 */

//Entity
//Table( name = "USER" )
public class User {
    
    //private Long id; email could be id for each customer since we force them to log in 
    private String firstName;
    private String lastName;
    private String password; // shoule be changed to use a more secure method 
    private String email; // key when storing users in table.  
}
