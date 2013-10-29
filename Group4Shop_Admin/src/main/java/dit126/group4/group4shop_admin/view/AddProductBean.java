/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_admin.view;

import dit126.group4.group4shop_admin.model.Group4Shop;
import dit126.group4.group4shop.core.Product;
import dit126.group4.group4shop.core.ProductImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
    
    //Product information
    private Long id;
    private String name; 
    private double price;
    private String description;
    private String category;
    
    //Product image
    private Part image;
    
    /*Product categories*/
     private static final Map<String,Object> productCategories;
	static{
		productCategories = new LinkedHashMap<>();
		productCategories.put("Other", "Other"); 
		productCategories.put("Pants", "Pants");
		productCategories.put("Shirts", "Shirts");
	}
    
    @Inject
    private Group4Shop group4shop;
    
    /*
    * 
    */
    public void saveProduct() throws IOException{   
       ProductImage newproductImage = null;
       if(this.image != null)
           newproductImage = createProductImage();
       Product p = new Product(this.id, this.name, this.price, this.category, this.description, newproductImage);     
       this.group4shop.getProductCatalogue().add(p);
    }
    
    
    private ProductImage createProductImage() throws IOException{   
        InputStream stream = this.image.getInputStream();
        byte[] imageBytes = IOUtils.toByteArray(stream);
        return  new ProductImage(this.image.getSubmittedFileName(), imageBytes);
    }
 
    public Map<String,Object> getProductCategories() {
	return productCategories;
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
    
    public String getCategory(){
        return this.category;
    }
    
    public void setCategory(String category){
        this.category = category;
    }
    
    public Part getImage(){
        return this.image;
    }
    
    public void setImage(Part image){
        this.image = image;
    }

}

