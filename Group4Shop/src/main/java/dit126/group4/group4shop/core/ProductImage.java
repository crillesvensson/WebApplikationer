package dit126.group4.group4shop.core;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 *
 * @author Christian
 */
@Entity
@Table(name= "PRODUCTIMAGE")
public class ProductImage implements Serializable{
    
    @Id
    @Column(name = "NAME")
    private String name;
    @Column(name = "PRODUCT")
    private Long productId;
    @Lob
    @Column(name = "IMAGEDATA")
    private byte[] imageData;
    
    protected ProductImage(){
        
    }
    
    public ProductImage(String name, Long productId, File image){
        this.name = name;
        this.productId = productId;
        this.imageData = this.getImageBytes(image);
    }
    
    public String getName(){
        return this.name;
    }
    
    public Long getProductId(){
        return this.productId;
    }
    
    public byte[] getImageBytes(){
        return this.imageData;
    }
    
    
    
    private byte[] getImageBytes(File image){
      /*  FileInputStream fileInputStream=null;
        byte[] imageBytes = new byte[(int) image.length()];
        try {
            fileInputStream = new FileInputStream(image);
            fileInputStream.read(imageBytes);
            fileInputStream.close();
        } catch (Exception ex) {
            Logger.getLogger(ProductImage.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            return imageBytes;
        }*/
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
