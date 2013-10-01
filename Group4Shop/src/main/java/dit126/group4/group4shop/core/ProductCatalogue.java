/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop.core;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Christian
 */
public class ProductCatalogue implements IProductCatalogue{
 
    
    private EntityManagerFactory emf;
    private final Class<Product> clazz;
    
    public ProductCatalogue(String puName){
        this.emf = Persistence.createEntityManagerFactory(puName);
        this.clazz = Product.class;
    }
    
}
