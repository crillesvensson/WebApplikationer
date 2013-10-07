package dit126.group4.group4shop.core;

import dit126.group4.group4shop.utils.IDAO;

/**
 *
 * @author Group4
 */
public interface IUserRegister extends IDAO<Users, Long>{
    
    public void remove(String id);
    
    public Users find(String id);
    
}
