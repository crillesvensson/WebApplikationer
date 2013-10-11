/* 
 *  Test basic AJAX call using JQuery
 */

// Possible test with curl first 
    
asyncTest( "Ajax.get", function() {
    var baseUri = "http://localhost:8080/Group4Shop_App/rs/products";
    var deferred = $.get(baseUri);   
    deferred.done(function(xml){
        ok( true, "Test passed");
        start();
    }); 
    deferred.fail(function(){
        ok( false, "Test failed (is Server up??)");
        start();    
    });
});