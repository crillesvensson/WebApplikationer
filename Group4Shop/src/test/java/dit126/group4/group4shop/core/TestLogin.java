/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dit126.group4.group4shop.core;

import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Christian
 */
public class TestLogin {
    
    private static final String PU_NAME = "group4_shop";
    
    static IGroup4Shop shop;
        
    @BeforeClass
   public static void before(){
        shop = Group4ShopFactory.getShop(PU_NAME);
   }
   
   @Test
   public void testAddAdminUser(){
       //shop.getProductCatalogue().add(new Product(new Long(10), "Feather", 30.00, "We had.. eh.. have a hen in our backyard that sometimes drops these.. by itself"));
        //shop.getProductCatalogue().add(new Product(new Long(15), "Water", 42.00, "Freshly harvested from last weeks rain"));
        //shop.getProductCatalogue().add(new Product(new Long(25), "Fire", 82.00, "Order a fire online, we will deliver it to you around midnight when we are sure that you are asleep"));
        //shop.getProductCatalogue().add(new Product(new Long(30), "Bench", 100.00, "The kind you sit on"));
        //shop.getProductCatalogue().add(new Product(new Long(35), "Air", 1000.00, "Luxury air"));
       
       
       
        Product product = new Product(new Long(5), "Rock", 22.00, "Hard");
        Users user = new Users("crillesvensson22@gmail.com", "Christian", "Svensson", "christiansvensson");
        Address address = new Address("Sweden", "Gothenburg", "41315", "Eldaregatan", "5A", "crillesvensson22@gmail.com" );
        Rating rating = new Rating(new Long(1), user.getEmail(), product.getId(), 3, "Best ever");   
        PurchaseOrder purchaseOrder = new PurchaseOrder(new Long(1), user);
        OrderItem orderItem = new OrderItem(new Long(1), product, 2, purchaseOrder.getId());
        Roles role = new Roles("admin", "admin role");
        shop.getRolesRegister().add(role);
        Roles adminRole = shop.getRolesRegister().get("admin");
        
        UserRoles adminUserRole = new UserRoles(user, adminRole);
       
        shop.getProductCatalogue().add(product);
              
        shop.getUserRegister().add(user);
        
        shop.getAddressCatalogue().add(address);
        
        shop.getRatingCatalogue().add(rating);
       
        shop.getOrderBook().add(purchaseOrder);
        
        shop.getOrderItemCatalogue().add(orderItem);
        
        shop.getUserRolesRegister().add(adminUserRole);
    
        assertTrue(true);
}
    
}
