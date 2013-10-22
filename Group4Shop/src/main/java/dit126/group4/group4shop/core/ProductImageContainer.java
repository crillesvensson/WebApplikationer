    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop.core;

import dit126.group4.group4shop.utils.AbstractDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Group4
 * 
 * Class for accessing the image for a specific product. Returns a list (with only one item)
 * Could be possible to add more than one image per product..
 * 
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
