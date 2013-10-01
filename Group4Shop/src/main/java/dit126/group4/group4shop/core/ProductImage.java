/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop.core;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Christian
 */
@Entity
@Table(name = "PRODUCTIMAGE")
public class ProductImage implements Serializable{
    
    @Id
    @Column(name = "NAME")
    private String name;
    @Column(name = "PRODUCT")
    private Long productId;
    @Column(name = "IMAGEDATA")
    private byte[] imageData;

}