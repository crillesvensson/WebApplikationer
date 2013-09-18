/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.ourwebproject.shopdit126.utils;

import java.util.Random;

/**
 *
 * @author emilbogren
 */
public class AbstractEntity {
    
    private final Long id; 
    
    protected AbstractEntity(){
        // This is for now, later database will generate
        this.id = new Long(new Random().nextInt(1000));
    }
    
    protected AbstractEntity(Long id){
        this.id = id;
    }
    
}
