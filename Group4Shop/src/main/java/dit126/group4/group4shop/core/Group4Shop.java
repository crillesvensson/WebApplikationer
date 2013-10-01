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
    
    public Group4Shop(String puName){
        this.productCatalogue = new ProductCatalogue(puName);
        this.productImageContainer = new ProductImageContainer(puName);
    }

    public IProductCatalogue getProductCatalogue() {
        return this.productCatalogue;
    }

    @Override
    public IProductImageContainer getProductImageConatiner() {
        return this.productImageContainer;
    }
}
