/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dit126.group4.group4shop.core;

import java.util.ArrayList;
import java.util.List;
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
        
        Roles role1 = new Roles("admin", "En admin");
        Roles role2 = new Roles("user", "En user");
        shop.getRolesRegister().add(role1);
        shop.getRolesRegister().add(role2);
        
        Users user = new Users("crillesvensson22@gmail.com", "Christian", "Svensson", "christiansvensson");
        Address address = new Address("Sweden", "Gothenburg", "41315", "Eldaregatan", "5A", "crillesvensson22@gmail.com" );
        
        shop.getUserRegister().add(user);
        shop.getAddressCatalogue().add(address);
        
        Roles adminRole = shop.getRolesRegister().find("admin");
        
        UserRoles adminUserRole = new UserRoles(user, adminRole);
        shop.getUserRolesRegister().add(adminUserRole);
        //shop.getProductCatalogue().add(new Product(new Long(10), "Feather", 30.00, "We had.. eh.. have a hen in our backyard that sometimes drops these.. by itself"));
        //shop.getProductCatalogue().add(new Product(new Long(15), "Water", 42.00, "Freshly harvested from last weeks rain"));
        //shop.getProductCatalogue().add(new Product(new Long(25), "Fire", 82.00, "Order a fire online, we will deliver it to you around midnight when we are sure that you are asleep"));
        //shop.getProductCatalogue().add(new Product(new Long(30), "Bench", 100.00, "The kind you sit on"));
        //shop.getProductCatalogue().add(new Product(new Long(35), "Air", 1000.00, "Luxury air"));
        
       /* Product product = new Product(new Long(5), "Rock", 22.00, "Hard");
        Product product2 = new Product(new Long(10), "Feather", 30.00, "We had.. eh.. have a hen in our backyard that sometimes drops these.. by itself");
        Product product3 = new Product(new Long(15), "Water", 42.00, "Freshly harvested from last weeks rain");
        Product product4 = new Product(new Long(25), "Fire", 82.00, "Order a fire online, we will deliver it to you around midnight when we are sure that you are asleep");
        Product product5 = new Product(new Long(30), "Bench", 100.00, "The kind you sit on");
        Product product6 = new Product(new Long(35), "Air", 1000.00, "Luxury air");
        
        
        Rating rating = new Rating(new Long(1), user.getEmail(), product.getId(), 3, "Good");
        Rating rating2 = new Rating(new Long(2), user.getEmail(), product2.getId(), 0, "Worst ever");
        Rating rating3 = new Rating(new Long(3), user.getEmail(), product3.getId(), 5, "Amazing");
        Rating rating4 = new Rating(new Long(4), user.getEmail(), product4.getId(), 2, "Ok");
        Rating rating5 = new Rating(new Long(5), user.getEmail(), product5.getId(), 4, "Best");
        Rating rating6 = new Rating(new Long(6), user.getEmail(), product6.getId(), 1, "Not good");
        
        OrderItem orderItem = new OrderItem(new Long(1),product, 2);
        
        List<OrderItem> orderItemList = new ArrayList<>();
        
        orderItemList.add(orderItem);
        
        PurchaseOrder purchaseOrder = new PurchaseOrder(user, orderItemList);
        
        
        shop.getProductCatalogue().add(product);
        shop.getProductCatalogue().add(product2);
        shop.getProductCatalogue().add(product3);
        shop.getProductCatalogue().add(product4);
        shop.getProductCatalogue().add(product5);
        shop.getProductCatalogue().add(product6);
        
        
        
        
        
        shop.getRatingCatalogue().add(rating);
        shop.getRatingCatalogue().add(rating2);
        shop.getRatingCatalogue().add(rating3);
        shop.getRatingCatalogue().add(rating4);
        shop.getRatingCatalogue().add(rating5);
        shop.getRatingCatalogue().add(rating6);
        
        shop.getOrderBook().add(purchaseOrder);
        
        //shop.getOrderItemCatalogue().add(orderItem);
        
        
        */
        assertTrue(true);
    }
    
}
