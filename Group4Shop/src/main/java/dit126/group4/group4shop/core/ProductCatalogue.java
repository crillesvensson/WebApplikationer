package dit126.group4.group4shop.core;

import dit126.group4.group4shop.utils.AbstractDAO;

/**
 *
 * @author Christian
 */
public class ProductCatalogue extends AbstractDAO<Product, Long> implements IProductCatalogue{
    

    public ProductCatalogue(String puName){
        super(Product.class, puName);
    }
}
