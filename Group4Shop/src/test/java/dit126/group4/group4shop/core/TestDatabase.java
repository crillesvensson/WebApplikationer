package dit126.group4.group4shop.core;

import java.io.File;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Group4
 */
public class TestDatabase {

        final static String PU = "group4_test_shop";
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
            Product p = new Product(new Long(1),"Banan", 22.33, "En gul banan");
            
            shop.getProductCatalogue().add(p);
            Product found = shop.getProductCatalogue().find(new Long(1));

            assertTrue(found!=null);
        }
        
        @Test
        public void testAddProductImage(){
            Product p = new Product(new Long(2), "Banana", 22.22, "En gul banan");
            shop.getProductCatalogue().add(p);
            
            File image = new File("/Users/Christian/Documents/school/webbapplikationer/WebApplikationer/Group4Shop/src/resources/banan.png");
            
            ProductImage i = new ProductImage("Test-image", p.getId(),image);
            
            shop.getProductImageConatiner().add(i);
            
            List<ProductImage> list = shop.getProductImageConatiner().find(p.getId());
            assertTrue(list.size() == 1);
            assertTrue(list.get(0).getName().equals("Test-image"));
          
        }



}
