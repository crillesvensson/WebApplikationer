/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_admin.controller;

import dit126.group4.group4shop.core.Product;
import dit126.group4.group4shop.core.ProductImage;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.SessionScoped;
import javax.imageio.ImageIO;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

/**
 *
 * @author Christian
 */
@Named("edit")
@SessionScoped
public class EditProductBean  implements Serializable{
    
    private Long id;
    private String name; 
    private double price;
    private String description;
    private byte[] imageData;
    private BufferedImage image;

    
    @Inject
    private Provider<Group4ShopBean> group4shop;
    
    public void selectedProduct(String id){
        Product p = group4shop.get().getProductCatalogue().find(Long.parseLong(id));
        this.id = p.getId();
        this.name = p.getName();
        this.price = p.getPrice();
        this.description = p.getDescription();
        List<ProductImage> imageList = group4shop.get().getProductImageContainer().find(Long.parseLong(id));
        
        if(!imageList.isEmpty()){
            this.imageData = imageList.get(0).getImageBytes();
            InputStream in = new ByteArrayInputStream(this.imageData);
            this.image = null;
            try {
                this.image = ImageIO.read(in);
            } catch (IOException ex) {
                Logger.getLogger(EditProductBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
    public void editProduct(){  
       Product p = new Product(this.id, this.name, this.price, this.description);
       group4shop.get().getProductCatalogue().update(p);
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
    
    /*public byte[] getImage(){
        return this.imageData;
    }
    
    public void setImage(byte[] imageData){
        this.imageData = imageData;
    }*/
    
    public StreamedContent getImage(){
        StreamedContent blobImage = new DefaultStreamedContent(new ByteArrayInputStream(this.imageData), "image/jpg");
        return blobImage;
    }
}
