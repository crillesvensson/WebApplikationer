/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop.core;

import dit126.group4.group4shop.utils.IDAO;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface IProductCatalogue extends IDAO<Product, Long>{
    
    public List<Product> getByName(String name);
    
    public List<Product> getByCategory(String category);
    
}
