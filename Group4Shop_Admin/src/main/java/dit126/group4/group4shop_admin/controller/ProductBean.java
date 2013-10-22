/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_admin.controller;

import dit126.group4.group4shop.core.Product;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Christian
 */
@Named("products")
@RequestScoped
public class ProductBean implements Serializable{
 
    @Inject
    private Group4ShopBean group4shop;
    
    public ProductBean(){
    }
    
    @PostConstruct
    public void post() {
        //buildSortOrder();
    }
    
    public List<Product> getProducts(){
        int count = group4shop.getProductCatalogue().getCount();
        List<Product> productList = group4shop.getProductCatalogue().getRange(0, count);     
        return productList;
    }      
}
