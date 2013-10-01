package dit126.group4.group4shop.core;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Christian
 */
@Entity
@Table(name = "PRODUCTIMAGE")
public class ProductImage implements Serializable{
    
    @Id
    @Column(name = "NAME")
    private String name;
    @Column(name = "PRODUCT")
    private Long productId;
    @Column(name = "IMAGEDATA")
    private byte[] imageData;
    
    protected ProductImage(){
        
    }
    
    public ProductImage(String name, Long productId, File image){
        this.name = name;
        this.productId = productId;
        this.imageData = this.getImageBytes(image);
    }
    
    
    
    private byte[] getImageBytes(File image){
        byte[] imageBytes = null;
        try {
           imageBytes = Files.readAllBytes(image.toPath());
        } catch (IOException ex) {
            Logger.getLogger(ProductImage.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            return imageBytes;
        }
    }

}
