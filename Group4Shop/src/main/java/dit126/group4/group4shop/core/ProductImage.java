package dit126.group4.group4shop.core;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import javax.imageio.ImageIO;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 *
 * @author Christian
 * 
 * An image for a product is defined here
 */
@Entity
@Table(name= "PRODUCTIMAGE")
public class ProductImage implements Serializable{
    
    @Id
    @Column(name = "NAME", nullable = false)
    private String name;
    @Lob
    @Column(name = "IMAGEDATA")
    private byte[] imageData;
    
    protected ProductImage(){
        
    }
    
    public ProductImage(String name, Long productId, byte[] image){
        this.name = name;
        //this.productId = productId;
        //this.imageData = this.getImageBytes(image);
        this.imageData = image;
    }
    
    public ProductImage(String name, byte[] image){
        this.name = name;
        this.imageData= image;
    }
    
    
    
    public String getName(){
        return this.name;
    }
    
    public Long getProductId(){
        return null;
    }
    
    public byte[] getImageBytes(){
        return this.imageData;
    }
    
    //Returns the images as an bytearray.
    
    private byte[] getImageBytes(File image){
        byte[] imageInByte = null;
           try{
 
	BufferedImage originalImage = 
                              ImageIO.read(image);
 
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	ImageIO.write( originalImage, "png", baos );
	baos.flush();
	imageInByte = baos.toByteArray();
	baos.close();
 
	}catch(IOException e){
		System.out.println(e.getMessage());
	}finally{
               return imageInByte;
        }
    }

}
