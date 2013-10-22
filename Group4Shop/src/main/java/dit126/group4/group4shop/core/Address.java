package dit126.group4.group4shop.core;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 *
 * @author Christian
 * 
 * Representing a adress in database
 * 
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
    private String streetNr;
    //@ManyToMany(cascade = CascadeType.ALL)
    @Column(name = "USERID")
    private String userId;
    
    
    protected Address(){}
    
    public Address(String country, String region,
                   String postalCode, String street,
                   String streetNr, String userId){
        this.country = country;
        this.region = region;
        this.postalCode = postalCode;
        this.street = street;
        this.streetNr = streetNr;
        this.userId = userId;
    }
    
    public String getCountry(){
        return this.country;
    }

    public String getRegion() {
        return region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getStreet() {
        return street;
    }

    public String getStreetNr() {
        return streetNr;
    }

    public String getUserId() {
        return userId;
    }
}
