/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_admin.controller;

import dit126.group4.group4shop.core.Product;
import dit126.group4.group4shop.core.ProductImage;
import dit126.group4.group4shop_admin.view.ProductBackingBean;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

/**
 *
 * @author Christian
 */
@Named("delete")
@SessionScoped
public class DeleteProductBean extends ProductBackingBean{
    
    /*Deletes product if it is not part of an orderitem*/
    public void deleteProduct(){  
        if(getShop().getOrderItemCatalgoue().getForProduct(this.id).isEmpty()){
            getShop().getProductCatalogue().remove(this.id);
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Can't delete because product is in an OrderItem"));
        }  
    }
}
