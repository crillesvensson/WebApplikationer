/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop.core;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Christian
 */
public class AddressCatalogue implements IAddressCatalogue{
    
    private EntityManagerFactory emf;
    
    public AddressCatalogue(String puName){
        this.emf = Persistence.createEntityManagerFactory(puName);
    }

    @Override
    public void add(Address address) {
        EntityManager em = this.emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(address);
            em.getTransaction().commit();
        }finally{
            em.close();
        }
    }

    @Override
    public void remove(AddressPK addressPK) {
        EntityManager em = this.emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.remove(em.find(Address.class, addressPK));
            em.getTransaction().commit();
        }finally{
            em.close();
        }
    }

    @Override
    public List<Address> find(Long id) {
        EntityManager em = this.emf.createEntityManager();
        return em.createQuery("SELECT p FROM Address p WHERE p.userId = ?1")
                .setParameter(1, id).getResultList();
    }
    
}
