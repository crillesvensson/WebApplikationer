package dit126.group4.group4shop.core;

/**
 *
 * @author Christian
 * 
 * Shop is defined here
 * 
 */
public class Group4Shop implements IGroup4Shop{
    
    private IProductCatalogue productCatalogue;
    private IProductImageContainer productImageContainer;
    private IAddressCatalogue addressCatalogue;
    private IUserRegister userregister;
    private RolesRegister rolesRegister;
    private IUserRolesRegister userRolesRegister;
    private IOrderBook orderBook;
    private IRatingCatalogue ratingCatalogue;
    private IOrderItemCatalogue orderItemCatalogue;
    
    public Group4Shop(String puName){
        this.productCatalogue = new ProductCatalogue(puName);
        this.productImageContainer = new ProductImageContainer(puName);
        this.addressCatalogue = new AddressCatalogue(puName);
        this.userregister = new UserRegister(puName);
        this.rolesRegister = new RolesRegister(puName);
        this.userRolesRegister = new UserRolesRegister(puName);
        this.orderBook = new OrderBook(puName);
        this.ratingCatalogue = new RatingCatalogue(puName);
        this.orderItemCatalogue = new OrderItemCatalogue(puName);
    }
    
    // Methods for interface access
    
    @Override
    public IProductCatalogue getProductCatalogue() {
        return this.productCatalogue;
    }
    
    @Override
    public IProductImageContainer getProductImageConatiner() {
        return this.productImageContainer;
    }
    
    @Override
    public IAddressCatalogue getAddressCatalogue() {
        return this.addressCatalogue;
    }
    
    @Override
    public IUserRegister getUserRegister() {
        return this.userregister;
    }
    
    @Override
    public RolesRegister getRolesRegister() {
        return this.rolesRegister;
    }
    
    @Override
    public IUserRolesRegister getUserRolesRegister() {
        return this.userRolesRegister;
    }
    
    @Override
    public IOrderBook getOrderBook() {
        return this.orderBook;
    }

    @Override
    public IRatingCatalogue getRatingCatalogue(){
        return this.ratingCatalogue;
    }
    
    @Override
    public IOrderItemCatalogue getOrderItemCatalogue(){
        return this.orderItemCatalogue;
    }
    
}
