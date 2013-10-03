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
public class AdminRegister implements IAdminRegister {
    
    private EntityManagerFactory emf;
    private final Class<Admin> clazz;
    
    public AdminRegister(String puName){
        this.emf = Persistence.createEntityManagerFactory(puName);
        this.clazz = Admin.class;
    }

    @Override
    public void add(Admin admin) {
        EntityManager em = this.emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(admin);
            em.getTransaction().commit();
        }finally{
            em.close();
        }
    }

    @Override
    public void remove(String id) {
        EntityManager em = this.emf.createEntityManager();
        Admin admin = em.find(clazz, id);
        try{
            em.getTransaction().begin();
            em.remove(admin);
            em.getTransaction().commit();
        }finally{
            em.close();
        }
    }

    @Override
    public Admin find(String id) {
        EntityManager em = this.emf.createEntityManager();
        Admin admin = null;
        try{
            em.getTransaction().begin();
            admin = em.find(clazz, id);
            em.getTransaction().commit();
        }finally{
            em.close();
            return admin;
        }
        
    }

    @Override
    public void update(Admin admin) {
        EntityManager em = this.emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.merge(admin);
            em.getTransaction().commit();
        }finally{
            em.close();
        }
    }
    
}
