package dit126.group4.group4shop.core;

import dit126.group4.group4shop.utils.IDAO;
import java.util.List;

/**
 *
 * @author Christian
 */

// Rating container
public interface IRatingCatalogue extends IDAO<Rating, Long>{
    
    public List<Rating> getforProduct(Long product_id);
    
}
