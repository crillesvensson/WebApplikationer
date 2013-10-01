/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop.core;

import java.util.List;

/**
 *
 * @author Christian
 */
public interface IProductCatalogue {
    public void add(Product t);

    public void remove(Long id);

    public void update(Product t);

    public Product find(Long id);

    public List<Product> getRange(int first, int nItems);

    public int getCount();
}
