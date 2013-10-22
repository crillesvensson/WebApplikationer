/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_admin.controller;

import dit126.group4.group4shop.core.Product;
import dit126.group4.group4shop.core.ProductImage;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
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
    private String category;
    private ProductImage image;
    
    @Inject
    private Provider<Group4ShopBean> group4shop;
    
    public void selectedProduct(String id){
        Product p = group4shop.get().getProductCatalogue().find(Long.parseLong(id));
        this.id = p.getId();
        this.name = p.getName();
        this.price = p.getPrice();
        this.description = p.getDescription();
        this.category = p.getCategory();
        this.image = p.getImage();
    }
    
    public void deleteProduct(){  
        if(group4shop.get().getOrderItemCatalgoue().getForProduct(this.id).isEmpty()){
            group4shop.get().getProductCatalogue().remove(this.id);
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Can't delete because product is in an OrderItem"));
        }  
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
