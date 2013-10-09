/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_admin.controller;

import dit126.group4.group4shop.core.Product;
import dit126.group4.group4shop.core.ProductImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.enterprise.context.RequestScoped;



import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.Part;
import org.apache.commons.io.IOUtils;

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
    private Part image;
    
    @Inject
    private Group4ShopBean group4shop;
    
    public void saveProduct() throws IOException{     
       Product p = new Product(this.id, this.name, this.price, this.description);
       InputStream stream = image.getInputStream();
       byte[] imageByte = IOUtils.toByteArray(stream);
       ProductImage pImage = new ProductImage("Test", this.id, imageByte);
       this.group4shop.getProductCatalogue().add(p);
       this.group4shop.getProductImageContainer().add(pImage);
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
    
    public Part getImage(){
        return this.image;
    }
    
    public void setImage(Part image){
        this.image = image;
    }

}

