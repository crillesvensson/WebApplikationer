package dit126.group4.group4shop_app.view;

import dit126.group4.group4shop.core.OrderItem;
import dit126.group4.group4shop.core.Product;
import dit126.group4.group4shop.core.ShoppingCart;
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
import javax.inject.Provider;

/**
 *
 * @author David
 */

@Named("shoppingCart")
@SessionScoped
public class ShoppingCartBB implements Serializable{
    
    
    @Inject
    private Provider<Group4Shop> shop;
    
    @Inject
    private CurrentUserBackingBean userBB;
    
    private ShoppingCart cart;
    
    public void buyProduct(Long id) {
        Users currentUser = userBB.getCurrentUser();
        if(currentUser != null){
            if(cart == null){
                cart = currentUser.getCart();
            }
            Product prod = shop.get().getProductCatalogue().find(id);
            cart.add(prod);
            /*     if (currentUser.getCart() != null){
             * currentUser.getCart().add(prod);
             * }*/
        }
    }
    
    /* private void updateCart(){
     * UIViewRoot viewRoot =  FacesContext.getCurrentInstance().getViewRoot();
     * UIComponent link = viewRoot.findComponent("cart");
     * String price = userBB.getCurrentUser().getCart().getTotalPrice();
     * link.getAttributes().put("value", (price + " kr - Cart"));
     * }*/
    
    public String getTotalPrice(){
        String cartTotal = "0";
        if(userBB.getCurrentUser() != null){
            if(cart == null){
                cart = userBB.getCurrentUser().getCart();
            }
            cartTotal = cart.getTotalPrice();
        }
        return cartTotal;
    }
    
    public List<OrderItem> getOrderItems(){
        List<OrderItem> oiList = cart.getAsOrderItems();
        return oiList;
    }
}