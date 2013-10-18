package dit126.group4.group4shop.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Group4
 */
public class TestDatabase {

       /* final static String PU = "group4_test_shop";
        static IGroup4Shop shop;
        
        @BeforeClass
        public static void before(){
              shop = Group4ShopFactory.getShop(PU);
        }
        
        @Test
        public void pointLess(){
            assertTrue(true);
        }
        
        @Test
        public void testAddProduct(){
            Product p = new Product(new Long(1),"Banan", 22.33,"Frukt", "En gul banan");
            
            shop.getProductCatalogue().add(p);
            Product found = shop.getProductCatalogue().find(new Long(1));

            assertTrue(found!=null);
            
            shop.getProductCatalogue().remove(p.getId());
            
            Product removedProduct = shop.getProductCatalogue().find(new Long(1));
            assertTrue(removedProduct==null);
            
       }
        
        
        
        @Test
        public void testAssignRolesToUsers(){
            Users user1 = new Users("emil@tes.se", "Emil", "B", "qwerty");
            Users user2 = new Users("emilb@tes.se", "Bo", "Botest", "qwerty");
            Roles role1 = new Roles("admin", "En admin");
            Roles role2 = new Roles("user", "En user");
            
            shop.getUserRegister().add(user1);
            shop.getUserRegister().add(user2);
            System.out.println("  TEST:  " + shop.getRolesRegister()  );
            shop.getRolesRegister().add(role1);
            shop.getRolesRegister().add(role2);
            
            UserRoles ur1 = new UserRoles(user1, role1);
            UserRoles ur2 = new UserRoles(user2, role2);
            shop.getUserRolesRegister().add(ur1);
            shop.getUserRolesRegister().add(ur2);            
            assertTrue(true);
        }
        
<<<<<<< HEAD
       @Test
=======
        
        @Test
        public void testCompleteUserAdd(){
            //Create user
            Users user1 = new Users("emil@dumt34.se", "Eb", "Eb", "qwerty");
            shop.getUserRegister().add(user1);
            
            Roles role = shop.getRolesRegister().get("user");
            
            UserRoles ur1 = new UserRoles(user1, role);
            
            shop.getUserRolesRegister().add(ur1);
            assertTrue(true);
        }
        
       /*@Test
>>>>>>> 325f4f8ea06f444c65b96441f6758f038ec80c03
        public void testAddProductImage(){
            Product p = new Product(new Long(2), "Banana", 22.22, "En gul banan");
            Product p = new Product(new Long(2), "Banana", 22.22,"Frukt", "En gul banan");


            Product p = new Product(new Long(2), "Banana", 22.22, "En gul banan");

            Product p = new Product(new Long(2), "Banana", 22.22,"Frukt", "En gul banan");

            Product p = new Product(new Long(2), "Banana", 22.22, "En gul banan");
            Product p = new Product(new Long(2), "Banana", 22.22, "Frukt", "En gul banan");
            shop.getProductCatalogue().add(p);
            
            File image = new File("/Users/Christian/Documents/school/webbapplikationer/WebApplikationer/Group4Shop/src/resources/banan.png");
            
            ProductImage i = new ProductImage("Test-image", p.getId(),image);
            
            shop.getProductImageConatiner().add(i);
            
            List<ProductImage> list = shop.getProductImageConatiner().find(p.getId());
            assertTrue(list.size() == 1);
            assertTrue(list.get(0).getName().equals("Test-image"));
        }*/
        
        /*@Test
        public void testAddAddress(){
            Address a = new Address("SWE", "GBG", "fdjbn", "dskgndgs", 2, new Long(2));
            
            shop.getAddressCatalogue().add(a);
            
            List<Address> list = shop.getAddressCatalogue().find(new Long(2));
            
            assertTrue(list.size() == 1);
            assertTrue(list.get(0).getCountry().equals("SWE"));
        }*/

        

}
