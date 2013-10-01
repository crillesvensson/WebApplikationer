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
    
    public Group4Shop(String puName){
        this.productCatalogue = new ProductCatalogue(puName);
    }

    public IProductCatalogue getProductCatalogue() {
        return this.productCatalogue;
    }
}
