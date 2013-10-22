package dit126.group4.group4shop_app.view;

import dit126.group4.group4shop.core.OrderItem;
import dit126.group4.group4shop.core.Product;
import dit126.group4.group4shop.core.Users;
import dit126.group4.group4shop_app.model.CurrentUserBackingBean;
import dit126.group4.group4shop_app.model.Group4Shop;
import java.io.Serializable;
import java.util.List;
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
        if(currentUser != null){
            Product prod = shop.getProductCatalogue().find(id);
            currentUser.getCart().add(prod);
        }
        // updateCart();
    }
    
    /* private void updateCart(){
     * UIViewRoot viewRoot =  FacesContext.getCurrentInstance().getViewRoot();
     * UIComponent link = viewRoot.findComponent("cart");
     * String price = userBB.getCurrentUser().getCart().getTotalPrice();
     * link.getAttributes().put("value", (price + " kr - Cart"));
     * }*/
    
    public String getTotalPrice(){
        String cart = "";
        if(userBB.getCurrentUser() != null){
            cart = userBB.getCurrentUser().getCart().getTotalPrice() + " kr - Cart";
        }
        return cart;
    }
    
    public List<OrderItem> getOrderItems(){
        List<OrderItem> oiList = userBB.getCurrentUser().getCart().getAsOrderItems();
        return oiList;
    }
}