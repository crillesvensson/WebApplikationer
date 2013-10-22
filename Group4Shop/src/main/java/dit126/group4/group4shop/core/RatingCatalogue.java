/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dit126.group4.group4shop.core;

import dit126.group4.group4shop.utils.AbstractDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Christian
 * 
 * Catalogue class with all ratings, access methods as follows.
 * 
 */
public class RatingCatalogue extends AbstractDAO<Rating, Long> implements IRatingCatalogue{
 
    public RatingCatalogue(String puName){
        super(Rating.class, puName);
    }
    
    @Override
    public List<Rating> getforProduct(Long product_id) {
        List<Rating> found = new ArrayList<>();
        for (Rating r : getRange(0, getCount())) {
            if (r.getProductId().equals(product_id)) {
                found.add(r);
            }
        }
        return found;
    }
    
}
