    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop.core;

import dit126.group4.group4shop.utils.AbstractDAO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Group4
 */
public class ProductImageContainer extends AbstractDAO<ProductImage, String> implements IProductImageContainer{
        
    public ProductImageContainer(String persistanceUnitName){
        super(ProductImage.class, persistanceUnitName);   
    }
    
    @Override
    public List<ProductImage> getForProduct(Long id){
        List<ProductImage> found = new ArrayList<>();
        for (ProductImage pi : getRange(0, getCount())) {
            if (pi.getProductId().equals(id)) {
                found.add(pi);
            }
        }
        return found;
    }
}
