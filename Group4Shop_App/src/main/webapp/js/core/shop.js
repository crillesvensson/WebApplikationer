/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
var shop = (function(){
    
    var baseUri = "http://localhost:8080/Group4Shop/rs/";  
    var products = new ProductCatalogue(baseUri + "products");
    //var orderBook = new OrderBook(baseUri);
    // etc ...
    
    return {
        getProductCatalogue : function(){
            return products;
        },
        getBaseUri : function(){
            return baseUri;
        }
    };    
})();



