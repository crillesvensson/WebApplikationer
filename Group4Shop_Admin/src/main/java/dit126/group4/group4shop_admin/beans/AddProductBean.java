/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_admin.beans;

import dit126.group4.group4shop.core.Product;
import dit126.group4.group4shop_admin.util.Group4ShopBean;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Christian
 */
@Named("addProduct")
@RequestScoped
public class AddProductBean {
    
    private Long id;
    private String name; 
    private Double price;
    private String description;
    
    @Inject
    private Group4ShopBean group4shop;
    
    public void saveProduct(){     
       Product p = new Product(this.id, this.name, this.price, this.description);
        this.group4shop.getProductCatalogue().add(p);
    }
}
