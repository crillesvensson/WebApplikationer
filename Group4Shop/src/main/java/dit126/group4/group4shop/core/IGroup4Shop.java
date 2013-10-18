package dit126.group4.group4shop.core;

/**
 *
 * @author Christian
 */
public interface IGroup4Shop {
    
    public IProductCatalogue getProductCatalogue();
    
    public IProductImageContainer getProductImageConatiner();
    
    public IAddressCatalogue getAddressCatalogue();
    
    public IUserRegister getUserRegister();
    
    public IRolesRegister getRolesRegister();
    
    public IUserRolesRegister getUserRolesRegister();
    
    public IOrderBook getOrderBook();
    
    public IRatingCatalogue getRatingCatalogue();
    
<<<<<<< HEAD
=======

>>>>>>> 325f4f8ea06f444c65b96441f6758f038ec80c03
    public IShoppingCart getShoppingCart();
    
    public IOrderItemCatalogue getOrderItemCatalogue();
}
