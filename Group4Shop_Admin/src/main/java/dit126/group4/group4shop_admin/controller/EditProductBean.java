/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_admin.controller;

import dit126.group4.group4shop.core.Product;
import dit126.group4.group4shop.core.ProductImage;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.SessionScoped;
import javax.imageio.ImageIO;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import javax.servlet.http.Part;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author Christian
 */
@Named("edit")
@SessionScoped
public class EditProductBean implements Serializable{
    
    private Long id;
    private String name; 
    private double price;
    private String description;
    private byte[] imageData;
    private Part image;
    

    
    @Inject
    private Provider<Group4ShopBean> group4shop;
    
    public void selectedProduct(String id) throws IOException{
        Product p = group4shop.get().getProductCatalogue().find(Long.parseLong(id));
        this.id = p.getId();
        this.name = p.getName();
        this.price = p.getPrice();
        this.description = p.getDescription();
        List<ProductImage> imageList = group4shop.get().getProductImageContainer().getForProduct(this.id);

        if(!imageList.isEmpty() && imageList.get(0).getProductId() == this.id){
            this.imageData = imageList.get(0).getImageBytes();
        }else{
            this.imageData = null;
        }
    }
    
    public void editProduct() throws IOException{  
       Product p = new Product(this.id, this.name, this.price, this.description);
       group4shop.get().getProductCatalogue().update(p);
       List<ProductImage> imageList = group4shop.get().getProductImageContainer().getForProduct(p.getId());
       if(!imageList.isEmpty() && image != null){
           group4shop.get().getProductImageContainer().remove(imageList.get(0).getName());
           saveImage();
       }
    }
    
    private void saveImage() throws IOException{
        InputStream stream = this.image.getInputStream();
        byte[] imageByte = IOUtils.toByteArray(stream);
        ProductImage pImage = new ProductImage(this.image.getSubmittedFileName(), this.id, imageByte);
        this.group4shop.get().getProductImageContainer().add(pImage);
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
    
    public StreamedContent getImage() throws IOException{
        if(this.imageData == null){
            String noImageString = "There is no image for this product";
            this.imageData = noImageString.getBytes();
        }
        StreamedContent blobImage = new DefaultStreamedContent(new ByteArrayInputStream(this.imageData), "image/jpg");
        return blobImage;
    }
    
    public Part getImages(){
        return this.image;
    }
    
    public void setImages(Part image){
        this.image = image;
    }
}
