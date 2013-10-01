/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Christian
 */
@Entity
@Table(name = "ADDRESS")
@IdClass(AddressPK.class)
public class Address {
    
    @Id
    @Column(name = "COUNTRY")
    private String country;
    @Id
    @Column(name = "REGION")
    private String region;
    @Id
    @Column(name = "POSTALCODE")
    private String postalCode;
    @Id
    @Column(name = "STREET")
    private String street;
    @Id
    @Column(name = "STREETNR")
    private String streetNr;
    @Column(name = "USER")
    @ManyToOne
    private User user;
    
    
    public Address(){}
}
