package se.ourwebproject.shopdit126.core;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author emilbogren
 */
public class Customer {
    
    /*
     * Contact info, billing and shipping adress in adressclass  
     * 
     */
    private final String fname; 
    private final String lname;
    private final String email;
    private final Address billingAddress;
    private final Address shippingAddress;
    // cart 
    // newsletter yes no
    // phone nr
    
    public Customer(Address billingAddress, Address shippingAddress, String fname,
            String lname, String email){
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
    } 
    
    public Customer(Long customerId, Address billingAddress, Address shippingAddress, String fname,
            String lname, String email){
        //super(customderId);
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
    } 
    
    //Add product to cart 
    
    //remove product 
    
    //empty cart
    
    public Address getBillingAddress(){
        return billingAddress;
    }
    
    public Address getShippingAddress(){
        return shippingAddress;
    }
    
    public String getFirstName(){
        return fname;
    }
    
    public String getLastName(){
        return lname;
    }
    
    public String getEmail(){
        return email;
    }
    
    //Add more return ?
    
    
    @Override
    public String toString(){
        return "";
    }
    
}
