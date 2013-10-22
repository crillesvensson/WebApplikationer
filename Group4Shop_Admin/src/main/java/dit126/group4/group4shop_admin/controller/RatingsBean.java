/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dit126.group4.group4shop_admin.controller;

import dit126.group4.group4shop.core.Product;
import dit126.group4.group4shop.core.Rating;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

/**
 *
 * @author Christian
 */
@Named("ratings")
@SessionScoped
public class RatingsBean implements Serializable{
    
    private Long product_id;
    private String product_name;
    
    @Inject
    private Provider<Group4ShopBean> group4shop;
    
    public List<Rating> getRatings(Long id){
        //Rating rating = new Rating(new Long(1), new Long(2), new Long(5), 3, "Best ever");
        List<Rating> ratingList = group4shop.get().getRatingCatalogue().getforProduct(id);
        return ratingList;
    }
    
    
    public int getRating(Long id){
        List<Rating> ratingList = group4shop.get().getRatingCatalogue().getforProduct(id);
        int ratingCount = ratingList.size();
        int rate = 0;
        if(ratingCount != 0){
            for(Rating r : ratingList){
                rate += r.getRating();
            }
            return rate/ratingCount;
        }
        return rate;
    }
    
    
    public void selectedProduct(Long id){
        Product p = group4shop.get().getProductCatalogue().find(id);
        this.product_name = p.getName();
        this.product_id = p.getId();
    }
    
    public Long getProductId(){
        return this.product_id;
    }
    
    public String getProductName(){
        return this.product_name;
    }
    
}
