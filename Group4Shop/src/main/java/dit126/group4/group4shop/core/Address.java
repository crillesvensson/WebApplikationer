/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Christian
 */
@Entity
@Table(name = "ADDRESS")
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
    @Column(name = "USER")
    @ManyToOne
    private User user;
    
}
