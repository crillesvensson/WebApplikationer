/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop.core;

import dit126.group4.group4shop.utils.AbstractDAO;

/**
 *
 * @author emilbogren
 */
public class ReceiptCatalogue extends AbstractDAO<Receipt, String> implements IReceiptCatalogue {
    
    public ReceiptCatalogue(String persistanceUnitName){
        super(Receipt.class, persistanceUnitName);
    }
    
    
    
}
