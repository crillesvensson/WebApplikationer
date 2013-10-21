package dit126.group4.group4shop_app.view;

import dit126.group4.group4shop.core.Product;
import dit126.group4.group4shop.core.ShoppingCart;
import dit126.group4.group4shop.core.Users;
import dit126.group4.group4shop_app.model.CurrentUserBackingBean;
import dit126.group4.group4shop_app.model.Group4Shop;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author David
 */

@Named("shoppingCart")
@SessionScoped
public class ShoppingCartBB implements Serializable{
    
    
    @Inject
    private Group4Shop shop;
    
    @Inject
    private CurrentUserBackingBean userBB;
    
    public void buyProduct(Long id) {
        Users currentUser = userBB.getCurrentUser();
        Product prod = shop.getProductCatalogue().find(id);
        currentUser.getCart().add(prod);
        updateCart(currentUser.getCart());
    }
    
    private void updateCart(ShoppingCart cart){
        UIViewRoot viewRoot =  FacesContext.getCurrentInstance().getViewRoot();
        UIComponent link = viewRoot.findComponent("cart");
        String price = cart.getTotalPrice();
        link.getAttributes().put("value", (price + " kr - Cart"));
    }
    
}
