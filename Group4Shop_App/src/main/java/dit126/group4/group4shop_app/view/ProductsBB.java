/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_app.view;

import dit126.group4.group4shop.core.Product;
import dit126.group4.group4shop_app.model.Group4Shop;
import dit126.group4.group4shop_app.controller.ContainerNavigator;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

/**
 * Must have in session scope, has state (in ContainerNavigator)!
 * @author hajo
 */
@Named("products")
@SessionScoped  // NOTE enterprise package, else disaster!!!
public class ProductsBB implements Serializable{
    
    private ContainerNavigator cn;

    private Group4Shop shop;
    private String productfilter = "all";
    
    @PostConstruct
    public void post() {
        // We know all injection are done so shop not null (hopefully)
        //cn = new ContainerNavigator(0, 3, shop.getProductCatalogue());
    }
    
     public void setProductfilter(String filter){
        this.productfilter = filter;
    }
    
    
    public String getProductfilter(){
        return this.productfilter;
    }
    
   
    
    public List<Product> getProducts(){
        int count = shop.getProductCatalogue().getCount();
        List<Product> productList = shop.getProductCatalogue().getRange(0, count);     
        return productList;
        if(productfilter.equals("all")){
            int count = shop.getProductCatalogue().getCount();
            List<Product> productList = shop.getProductCatalogue().getRange(0, count);
            return productList;
        } else {
            List<Product> productList = shop.getProductCatalogue().getByCategory(productfilter);
            return productList;
        }
        
    }
    /*
     * public List<Product> getByCategory(String cat){
     * List<Product> productList = shop.getProductCatalogue().getByCategory(cat);
     * return productList;
     * }
     */
    
    public List<Product> next() {
       // inte säker på att ny cn behöver skapas
       cn = new ContainerNavigator(0, 3, shop.getProductCatalogue());
       return cn.next();
    }
    
    public List<Product> prev() {
       cn = new ContainerNavigator(0, 3, shop.getProductCatalogue());
       return cn.previous();
    }
    
    public String navigate(String target) {
        return target;
    }
}
