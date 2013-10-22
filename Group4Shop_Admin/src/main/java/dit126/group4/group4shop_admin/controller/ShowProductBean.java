/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dit126.group4.group4shop_admin.controller;

import dit126.group4.group4shop.core.Product;
import dit126.group4.group4shop.core.ProductImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

/**
 *
 * @author Christian
 */
@Named("showProduct")
@SessionScoped
public class ShowProductBean implements Serializable{
    
    private Long id;
    private String name; 
    private double price;
    private String description;
    private String category;
    private byte[] imageData;
    

    
    @Inject
    private Provider<Group4ShopBean> group4shop;
    
    public void selectedProduct(Long id) throws IOException{
        Product p = group4shop.get().getProductCatalogue().find(id);
        this.id = p.getId();
        this.name = p.getName();
        this.price = p.getPrice();
        this.description = p.getDescription();
        this.category = p.getCategory();
        
        //Get product image if there is one, else set image bytes to null
        ProductImage productimage = p.getImage();
        if(productimage != null){
            this.imageData = productimage.getImageBytes();
        }else{
            this.imageData = null;
        }
    }

    
    public Long getId() {
        return this.id;
    }

    
    public String getName() {
        return this.name;
    }

    
    public double getPrice() {
        return this.price;
    }

    
    public String getDescription() {
        return this.description;
    }
    
    public String getCategory(){
        return this.category;
    }

    
    public StreamedContent getImageData() {
        if(this.imageData == null){
            String noImageString = "There is no image for this product";
            this.imageData = noImageString.getBytes();
        }
        StreamedContent blobImage = new DefaultStreamedContent(new ByteArrayInputStream(this.imageData), "image/jpg");
        return blobImage;
    }
    
}
