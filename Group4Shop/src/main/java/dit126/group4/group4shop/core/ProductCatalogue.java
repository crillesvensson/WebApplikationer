package dit126.group4.group4shop.core;

import dit126.group4.group4shop.utils.AbstractDAO;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Christian
 */
public class ProductCatalogue extends AbstractDAO<Product, Long> implements IProductCatalogue{
    

    public ProductCatalogue(String puName){
        super(Product.class, puName);
    }
   
    
    // Query database to get a product by its name

    @Override
    public List<Product> getByName(String name){
        EntityManager em = emf.createEntityManager();
        List<Product> result;
        result = em.createQuery("SELECT p FROM PRODUCT p WHERE p.name = '" + name + "'").getResultList();
        return result;
    }
    
    // Query products depending on category (not used in our implementation right now, but could be usefull..)
    
    @Override
    public List<Product> getByCategory(String category){
        EntityManager em = emf.createEntityManager();
        List<Product> result;
        result = em.createQuery("SELECT p FROM PRODUCT p WHERE p.category='" + category + "'").getResultList();
        return result;
    }
    
}
