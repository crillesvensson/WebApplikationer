package dit126.group4.group4shop.core;

import dit126.group4.group4shop.utils.IDAO;
import java.util.List;


/**
 *
 * @author Christian
 */
public interface IAddressCatalogue extends IDAO<Address, String> {
    
    
   public List<Address> findAddress(String name);
    
}
