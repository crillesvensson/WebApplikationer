package dit126.group4.group4shop.core;

import java.io.Serializable;

/**
 * @author Christian
 * 
 *  Primary Key class for addresses, to be able to handle them as Entitys
 * 
 * 
 */
public class AddressPK implements Serializable{
    
    private String country;
    private String region;
    private String postalCode;
    private String street;
    private String streetNr;
    
    public AddressPK(){}
    
    public void setCountry(String country){
        this.country = country;
    }
    
    public String getCountry(){
        return this.country;
    }
    
    public void setRegion(String region){
        this.region = region;
    }
    
    public String getRegion(){
        return this.region;
    }
    
    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }
    
    public String getPostalCode(){
        return this.postalCode;
    }
    
    public void setStreet(String street){
        this.street = street;
    }
    
    public String getStreet(){
        return this.street;
    }
    
    public void setStreetNr(String streetNr){
        this.streetNr = streetNr;
    }
    
   public String getStreetNr(){
       return this.streetNr;
   }
   
    @Override
   public int hashCode() {
       String mix = this.country + this.postalCode + this.region + this.street
                      + this.streetNr;
        return (int) mix.hashCode();
   }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof AddressPK)) return false;
        if (obj == null) return false;
        AddressPK pk = (AddressPK) obj;
        return pk.country.equals(this.country) && pk.postalCode.equals(this.postalCode) &&
                pk.region.equals(this.region) && pk.street.equals(this.street) &&
                pk.streetNr.equals(this.streetNr);
    }
}
