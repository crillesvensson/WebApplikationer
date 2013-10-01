/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop.core;

import javax.persistence.Column;

/**
 *
 * @author Christian
 */
public class ProductImage {
    
    @Column(name = "NAME")
    private String name;
    @Column(name = "PRODUCT")
    private Product product;
    @Column(name = "IMAGEDATA")
    private byte[] imageData;

}
