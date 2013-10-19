/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_admin.controller;

import dit126.group4.group4shop.core.Product;
import dit126.group4.group4shop.core.ProductImage;
import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

/**
 *
 * @author Christian
 */
@Named("delete")
@SessionScoped
public class DeleteProductBean implements Serializable{
    
    private Long id;
    private String name; 
    private double price;
    private String description;
    
    @Inject
    private Provider<Group4ShopBean> group4shop;
    
    public void selectedProduct(String id){
        Product p = group4shop.get().getProductCatalogue().find(Long.parseLong(id));
        this.id = p.getId();
        this.name = p.getName();
        this.price = p.getPrice();
        this.description = p.getDescription();
        
        List<ProductImage> imageList = group4shop.get().getProductImageContainer().getForProduct(this.id);
        
        for(ProductImage pI : imageList){
            group4shop.get().getProductImageContainer().remove(pI.getName());
        }
        
        
    }
    
    public void deleteProduct(){  
       group4shop.get().getProductCatalogue().remove(this.id);
    }
    
    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
}
