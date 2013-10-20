/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_admin.controller;

import dit126.group4.group4shop.core.Product;
import dit126.group4.group4shop.core.ProductImage;
import java.io.ByteArrayOutputStream;
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
    
    private Long id;
    private String name; 
    private double price;
    private String description;
    private String category;
    
    private List<Part> images = new ArrayList<Part>();
    private Part image;
    
    @Inject
    private Group4ShopBean group4shop;
    
    public void saveProduct() throws IOException{     
       Product p = new Product(this.id, this.name, this.price, this.category, this.description);     
       this.group4shop.getProductCatalogue().add(p);
       if(!images.isEmpty()){
         saveImages();
       }
    }
    
    
    private void saveImages() throws IOException{
        for(Part p : images){
            System.out.println("" + p.getName());
            InputStream stream = p.getInputStream();
            byte[] imageByte = IOUtils.toByteArray(stream);
            ProductImage pImage = new ProductImage(p.getSubmittedFileName(), this.id, imageByte);
            this.group4shop.getProductImageContainer().add(pImage);
        }
    }

    private static Map<String,Object> productCategories;
	static{
		productCategories = new LinkedHashMap<String,Object>();
		productCategories.put("Other", "Other"); //label, value
		productCategories.put("Pants", "Pants");
		productCategories.put("Shirts", "Shirts");
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
    
    public Part getImages(){
        return this.image;
    }
    
    public void setImages(Part image){
        this.images.add(image);
    }

}

