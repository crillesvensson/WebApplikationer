/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop.core;

import java.util.List;

/**
 *
 * @author emilbogren
 */
public interface IProductImageContainer {
    
    public void add(ProductImage img);
    
    public void remove(String id);
    
    public List<ProductImage> find(Long id);
    
    public ProductImage findImage(String id);
    
    public void update(ProductImage img);
}
