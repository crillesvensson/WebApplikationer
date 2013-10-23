package dit126.group4.group4shop.core;

import dit126.group4.group4shop.utils.AbstractDAO;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Christian
 */
public class AddressCatalogue extends AbstractDAO<Address, String> implements IAddressCatalogue{
    
    //private EntityManagerFactory emf;
    
    public AddressCatalogue(String puName){
        //this.emf = Persistence.createEntityManagerFactory(puName);
         super(Address.class, puName); 
    }
    
    @Override
    public List<Address> findAddress(String username){
        EntityManager em = super.emf.createEntityManager();
        return em.createQuery("SELECT p FROM ADDRESS p WHERE p.userId = ?1")
                .setParameter(1, username).getResultList(); 
    }
    
}
