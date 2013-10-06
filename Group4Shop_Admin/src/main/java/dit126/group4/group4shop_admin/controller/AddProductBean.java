/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_admin.controller;

import dit126.group4.group4shop.core.Product;
import javax.enterprise.context.RequestScoped;



import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Christian
 */
@Named("add")
@RequestScoped
public class AddProductBean {
    
    private Long id;
    private String name; 
    private double price;
    private String description;
    
    @Inject
    private Group4ShopBean group4shop;
    
    public void saveProduct(){     
       Product p = new Product(this.id, this.name, this.price, this.description);
       this.group4shop.getProductCatalogue().add(p);
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

