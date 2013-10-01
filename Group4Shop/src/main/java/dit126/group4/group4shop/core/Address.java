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
public class Address {
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "REGION")
    private String region;
    @Column(name = "POSTALCODE")
    private String postalCode;
    @Column(name = "STREET")
    private String street;
    @Column(name = "STREETNR")
    private String streetNr;
    
    private User user;  
    
}
