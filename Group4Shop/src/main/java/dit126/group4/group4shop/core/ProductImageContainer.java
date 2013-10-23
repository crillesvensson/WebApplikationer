package dit126.group4.group4shop.core;

import dit126.group4.group4shop.utils.AbstractDAO;

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
}
