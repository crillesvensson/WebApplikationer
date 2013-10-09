/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop.core;

/**
 *
 * @author Christian
 */
public class Group4Shop implements IGroup4Shop{
    
    private IProductCatalogue productCatalogue;
    private IProductImageContainer productImageContainer;
    private IAddressCatalogue addressCatalogue;
    private IAdminRegister adminRegister;
    private IUserRegister userregister;
    private IRolesRegister rolesRegister;
    private IUserRolesRegister userRolesRegister;
    private IOrderBook orderBook;
    
    public Group4Shop(String puName){
        this.productCatalogue = new ProductCatalogue(puName);
        this.productImageContainer = new ProductImageContainer(puName);
        this.addressCatalogue = new AddressCatalogue(puName);
        this.adminRegister = new AdminRegister(puName);
        this.userregister = new UserRegister(puName);
        this.rolesRegister = new RolesRegister(puName);
        this.userRolesRegister = new UserRolesRegister(puName);
        this.orderBook = new OrderBook(puName);
    }
    
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
    public IAdminRegister getAdminRegister() {
        return this.adminRegister;
    }
    
    @Override
    public IUserRegister getUserRegister() {
        return this.userregister;
    }
    
    @Override
    public IRolesRegister getRolesRegister() {
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
    
}
