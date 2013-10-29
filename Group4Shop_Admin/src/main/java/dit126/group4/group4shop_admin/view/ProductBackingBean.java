package dit126.group4.group4shop_admin.view;

import dit126.group4.group4shop.core.Product;
import dit126.group4.group4shop.core.ProductImage;
import dit126.group4.group4shop_admin.model.Group4Shop;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import javax.inject.Inject;
import javax.inject.Provider;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

/**
 *
 * @author Christian
 */
public class ProductBackingBean implements Serializable{
    //Product
    protected Long id;
    protected String name; 
    protected double price;
    protected String description;
    protected String category;
    protected ProductImage image;
    
    //Image data
    protected byte[] imageData;
    
    @Inject
    private Provider<Group4Shop> group4shop;
    
    public void selectedProduct(String id){
        Product p = group4shop.get().getProductCatalogue().find(Long.parseLong(id));
        this.id = p.getId();
        this.name = p.getName();
        this.price = p.getPrice();
        this.category = p.getCategory();
        this.description = p.getDescription();
        this.image = p.getImage();
        
        if(image != null){
            this.imageData = this.image.getImageBytes();
        }else{
            imageData = null;
        }
    }
    
    protected Group4Shop getShop(){
        return this.group4shop.get();
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
            return null;
        }
        StreamedContent blobImage = new DefaultStreamedContent(new ByteArrayInputStream(this.imageData), "image/jpg");
        return blobImage;
    }
}
