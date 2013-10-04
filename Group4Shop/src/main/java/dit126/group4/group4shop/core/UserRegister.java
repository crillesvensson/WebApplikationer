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
 * @author Group4
 */
public class UserRegister implements IUserRegister {
    
    private EntityManagerFactory emf;
    private final Class<Users> clazz;
    
    public UserRegister(String puName){
        this.emf = Persistence.createEntityManagerFactory(puName);
        this.clazz = Users.class;
    }
    
    @Override
    public void add(Users user) {
        EntityManager em = this.emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
        }finally{
            em.close();
        }
    }
    
    @Override
    public void remove(String id) {
        EntityManager em = this.emf.createEntityManager();
        Users user = em.find(clazz, id);
        try{
            em.getTransaction().begin();
            em.remove(user);
            em.getTransaction().commit();
        }finally{
            em.close();
        }
    }

    @Override
    public void update(Users user) {
        EntityManager em = this.emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.merge(user);
            em.getTransaction().commit();
        }finally{
            em.close();
        }
    }

    @Override
    public Users find(String id) {
        EntityManager em = this.emf.createEntityManager();
        Users user = null;
        try{
            em.getTransaction().begin();
            user = em.find(clazz, id);
            em.getTransaction().commit();
        }finally{
            em.close();
            return user;
        }
    }
    
}
