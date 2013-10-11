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
import org.apache.commons.io.IOUtils;
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
    private Part image;
    //private List<BufferedImage> images;
    //private List<byte[]> dataImages;
    

    
    @Inject
    private Provider<Group4ShopBean> group4shop;
    
    public void selectedProduct(String id) throws IOException{
        Product p = group4shop.get().getProductCatalogue().find(Long.parseLong(id));
        this.id = p.getId();
        this.name = p.getName();
        this.price = p.getPrice();
        this.description = p.getDescription();
        List<ProductImage> imageList = group4shop.get().getProductImageContainer().find(Long.parseLong(id));
        //this.dataImages = new ArrayList<byte[]>();
        
        
        if(!imageList.isEmpty()){
            this.imageData = imageList.get(0).getImageBytes();
        }
        
        if(image != null && !imageList.isEmpty()){
            ProductImage img = imageList.get(0);
            InputStream stream = image.getInputStream();
            byte[] imageByte = IOUtils.toByteArray(stream);
            ProductImage updateImg = new ProductImage(img.getName(), img.getProductId(), imageByte);
            group4shop.get().getProductImageContainer().update(updateImg);
            
        }
        
        /*for(ProductImage pI : imageList){
            dataImages.add(pI.getImageBytes());
                    //images.add(ImageIO.read(new ByteArrayInputStream(pI.getImageBytes())));
        }*/
        
        
       /* if(!imageList.isEmpty() && imageList.size() == 3){
            this.imageData0 = imageList.get(0).getImageBytes();
            InputStream in0 = new ByteArrayInputStream(this.imageData0);
            this.image0 = null;
            
            this.imageData1 = imageList.get(1).getImageBytes();
            InputStream in1 = new ByteArrayInputStream(this.imageData1);
            this.image1 = null;
            
            this.imageData2 = imageList.get(2).getImageBytes();
            InputStream in2 = new ByteArrayInputStream(this.imageData2);
            this.image2 = null;*/
            
 
               /* this.image0 = ImageIO.read(in0);
                this.image1 = ImageIO.read(in1);
                this.image2 = ImageIO.read(in2);*/
        

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
    
    public StreamedContent getImage(){
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
