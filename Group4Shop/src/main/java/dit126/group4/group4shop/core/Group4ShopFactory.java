package dit126.group4.group4shop.core;

/**
 *
 * @author Christian
 */
public class Group4ShopFactory {
    
    private Group4ShopFactory(String puName) {
        Group4Shop s = new Group4Shop(puName);
    }
    
    public static IGroup4Shop getShop(String puName) {
        Group4Shop shop = new Group4Shop(puName);
        //init(shop);
        return shop;
    }
    /*
    private static void init(Group4Shop shop){
        shop.getProductCatalogue().add(new Product(new Long(5), "Rock", 22.00, "Hard"));
        shop.getProductCatalogue().add(new Product(new Long(10), "Feather", 30.00, "We had.. eh.. have a hen in our backyard that sometimes drops these.. by itself"));
        shop.getProductCatalogue().add(new Product(new Long(15), "Water", 42.00, "Freshly harvested from last weeks rain"));
        shop.getProductCatalogue().add(new Product(new Long(25), "Fire", 82.00, "Order a fire online, we will deliver it to you around midnight when we are sure that you are asleep"));
        shop.getProductCatalogue().add(new Product(new Long(30), "Bench", 100.00, "The kind you sit on"));
<<<<<<< HEAD
<<<<<<< HEAD
        shop.getProductCatalogue().add(new Product(new Long(35), "Air", 1000.00, "Luxury air"));
        shop.getUserRegister().add(new Users("crillesvensson22@gmail.com", "Christian", "Svensson", "christiansvensson"));
        shop.getRatingCatalogue().add(new Rating(new Long(1), "crillesvensson22@gmail.com", new Long(5), 3, "Best ever"));
        shop.getOrderBook().add(new PurchaseOrder(new Long(1), new Users("crillesvensson22@gmail.com", "Christian", "Svensson", "christiansvensson")));
        shop.getOrderItemCatalogue().add(new OrderItem(new Long(1), new Product(new Long(5), "Rock", 22.00, "Hard"), 2, new Long(1)));
        shop.getOrderItemCatalogue().add(new OrderItem(new Long(2), new Product(new Long(10), "Feather", 30.00, "We had.. eh.. have a hen in our backyard that sometimes drops these.. by itself"), 1, new Long(1)));
        
    }
=======
        shop.getUserRegister().add(new Users("crillesvensson22@gmail.com", "Christian", "Svensson", "christiansvensson"));
=======
        shop.getUserRegister().add(new Users("crillesvensson22@gmail.com", "Christian", "Svensson", "christiansvensson"));
>>>>>>> 325f4f8ea06f444c65b96441f6758f038ec80c03
       // shop.getRatingCatalogue().add(new Rating(new Long(1), new Long(1), new Long(5), 3, "Best ever"));
        shop.getRatingCatalogue().add(new Rating(new Long(1), new Long(1), new Long(5), 3, "Best ever"));
        shop.getProductCatalogue().add(new Product(new Long(35), "Air", 1000.00, "Luxury air"));
    }*/
}
