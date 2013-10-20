/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_admin.controller;

import dit126.group4.group4shop.core.Product;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Christian
 */
@Named("products")
@RequestScoped
public class ProductBean implements Serializable{
    
    
    private final static String[] categories = {"Other", "Pants", "Shirts"};
    
    @Inject
    private Group4ShopBean group4shop;
    
    public ProductBean(){
    }
    
    @PostConstruct
    public void post() {

    }
    
    public List<Product> getProducts(){
        int count = group4shop.getProductCatalogue().getCount();
        List<Product> productList = group4shop.getProductCatalogue().getRange(0, count);     
        return productList;
    } 
    
 
    
    private static Map<String,Object> filterOptions;
	static{
		filterOptions = new LinkedHashMap<String,Object>();
                filterOptions.put("None", "None");
		filterOptions.put("Other", "Other"); 
		filterOptions.put("Pants", "Pants");
		filterOptions.put("Shirts", "Shirts");
	}
 
    public Map<String,Object> getFilterOptions() {
	return filterOptions;
    }
    
    public SelectItem[] createFilterOptions()  {  
        /*SelectItem[] options = new SelectItem[categories.length + 1];  
  
        options[0] = new SelectItem("", "Select");  
        for(int i = 0; i < categories.length; i++) {  
            options[i + 1] = new SelectItem(categories[i], categories[i]);  
        } */ 
  
        return null;  
    }
    
}
