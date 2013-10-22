package dit126.group4.group4shop.core;

import dit126.group4.group4shop.utils.AbstractDAO;

/**
 *
 * @author Group4
 */
public class UserRegister extends AbstractDAO<Users, String> implements IUserRegister {
    
    public UserRegister(String puName){
        super(Users.class, puName);
    }

}
