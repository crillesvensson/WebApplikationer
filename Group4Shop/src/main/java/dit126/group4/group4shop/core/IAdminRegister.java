/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop.core;

/**
 *
 * @author Group4
 */
public interface IAdminRegister {
    
    public void add(Admin admin);
    
    public void remove(String id);
    
    public Admin find(String id);
    
    public void update(Admin admin);
    
}
