/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop.core;

import dit126.group4.group4shop.utils.IDAO;
import java.util.List;

/**
 *
 * @author emilbogren
 */
public interface IProductImageContainer extends IDAO<ProductImage, String>{
    public List<ProductImage> getForProduct(Long id);
}
