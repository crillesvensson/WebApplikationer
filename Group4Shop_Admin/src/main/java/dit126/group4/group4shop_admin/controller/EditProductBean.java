package dit126.group4.group4shop_admin.controller;

import dit126.group4.group4shop.core.Product;
import dit126.group4.group4shop.core.ProductImage;
import dit126.group4.group4shop_admin.view.ProductBackingBean;
import java.io.IOException;
import java.io.InputStream;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.servlet.http.Part;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author Christian
 */
@Named("edit")
@SessionScoped
public class EditProductBean extends ProductBackingBean{
    
    private Part imagePart;
     
    /*Edit an existing product*/
    public void editProduct() throws IOException{ 
        ProductImage newproductImage = this.image;
        if(this.imagePart != null){
            System.out.println("NO IMAGE PART!!!!");
            newproductImage = createProductImage();    
        }
        Product product = new Product(this.id, this.name, this.price,this.category, this.description,newproductImage);
        getShop().getProductCatalogue().update(product);
    }
    
    
    /*Creates an ProductImage from Part*/
    private ProductImage createProductImage() throws IOException{   
        InputStream stream = this.imagePart.getInputStream();
        byte[] imageBytes = IOUtils.toByteArray(stream);
        return  new ProductImage(this.imagePart.getSubmittedFileName(), imageBytes);
    }
    
     public Part getImages(){
        return this.imagePart;
    }
    
    public void setImages(Part image){
        this.imagePart = image;
    }
}
