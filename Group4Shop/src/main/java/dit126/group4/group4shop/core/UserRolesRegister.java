/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author emilbogren
 */
public class UserRolesRegister implements IUserRolesRegister{
    
    private EntityManagerFactory emf;
    private final Class<UserRoles> clazz;
    
    public UserRolesRegister(String puName){
        this.emf = Persistence.createEntityManagerFactory(puName);
        this.clazz = UserRoles.class;
    }
    
    @Override
    public void add(UserRoles ur) {
         EntityManager em = this.emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(ur);
            em.getTransaction().commit();
        }finally{
            em.close();
        }
    }
    
    public UserRoles get(String email){
        EntityManager em = this.emf.createEntityManager();
        UserRoles ur = null;
        try{
            em.getTransaction().begin();
            ur = em.find(clazz, email);
            em.getTransaction().commit();
        }finally{
            em.close();
            return ur;
        }
    }
}
