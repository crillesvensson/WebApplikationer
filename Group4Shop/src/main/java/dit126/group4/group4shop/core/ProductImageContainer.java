    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop.core;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Group4
 */
public class ProductImageContainer implements IProductImageContainer{
    
    private EntityManagerFactory emf;
        
    public ProductImageContainer(String persistanceUnitName){
        this.emf = Persistence.createEntityManagerFactory(persistanceUnitName);    
    }
    
    
    @Override
    public void add(ProductImage img) {
        EntityManager em = this.emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(img);
            em.getTransaction().commit();
        }finally{
            em.close();
        }
    }

    @Override
    public void remove(String id) {
      EntityManager em = this.emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.remove(em.find(ProductImage.class, id));
            em.getTransaction().commit();
        }finally{
            em.close();
        
        }   
    }

    @Override
    public List<ProductImage> find(Long id) {
        EntityManager em = this.emf.createEntityManager();
        return em.createQuery("SELECT p FROM ProductImage p WHERE p.productId = ?1")
                .setParameter(1, id).getResultList();
    }
    
    @Override
    public ProductImage findImage(String id){
        EntityManager em = emf.createEntityManager();
        ProductImage pi = null;
        try{
            em.getTransaction().begin();
            pi = em.find(ProductImage.class, id);
            em.getTransaction().commit();
        }finally{
            em.close();
            return pi;
        }
    }
    
    @Override
    public void update(ProductImage img) {
        EntityManager em = emf.createEntityManager();
        try{
                em.getTransaction().begin();
                em.merge(img);
                em.getTransaction().commit();
        }finally{
            em.close();
        }
    }
        

    
}
