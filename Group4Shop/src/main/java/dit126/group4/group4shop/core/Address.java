package dit126.group4.group4shop.core;

import java.io.Serializable;
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
public class Address implements Serializable{
    
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
    private int streetNr;
    @Column(name = "USER")
    @ManyToOne
    private User user;
    
    
    protected Address(){}
    
    public Address(String country, String region,
                   String postalCode, String street,
                   int streetNr){
        this.country = country;
        this.region = region;
        this.postalCode = postalCode;
        this.street = street;
        this.streetNr = streetNr;
    }
}
