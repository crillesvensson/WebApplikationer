package dit126.group4.group4shop.core;

/**
 *
 * @author emilbogren
 */
public interface IUserRolesRegister {

    public void add(UserRoles ur);
    
    public UserRoles get(String email);
}
