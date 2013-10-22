var shop = (function(){
    
    var baseUri = "http://localhost:8080/Group4Shop_App/rs/";  //change when deciding pattern
    var products = new ProductCatalogue(baseUri + "products");
    
    return {
        getProductCatalogue : function(){
            return products;
        },
        getBaseUri : function(){
            return baseUri;
        }
    };    
})();