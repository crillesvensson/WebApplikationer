/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dit126.group4.group4shop_admin.controller;

import dit126.group4.group4shop.core.Rating;
import java.io.Serializable;
import java.util.ArrayList;
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
   /* private Long user_ID;
    private Long product_ID;
    private int rating;
    private String comment;*/
    
    @Inject
    private Provider<Group4ShopBean> group4shop;
    
    public List<Rating> getRatings(Long id){
        //Rating rating = new Rating(new Long(1), new Long(2), new Long(5), 3, "Best ever");
        List<Rating> ratingList = group4shop.get().getRatingCatalogue().getforProduct(id);
        return ratingList;
    }
    
    public void selectedProduct(Long id){
        this.product_id = id;
    }
    
    public Long getProductId(){
        return this.product_id;
    }
    
}
