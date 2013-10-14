/* 
 * Test of ProductCatalogue
 */

// Possible test with curl first 
asyncTest("ProductCatalogue.count", function() {
    var deferred = shop.getProductCatalogue().getCount();
    deferred.done(function(nProducts) {
        ok(nProducts.value === 5, ("Test passed, nr=" + nProducts.value));
        //ok( true, "Test passed");
        start();
    });
    deferred.fail(function() {
        ok(false, "Test failed (is Server up??)");
        start();
    });
});

asyncTest("ProductCatalogue.getRange", function() {
    var deferred = shop.getProductCatalogue().getRange(0, 2);
    deferred.done(function(products) {
        ok(products.length === 2, ("Test passed, length=" + products.length));
        //ok( true, "Test passed");
        start();
    });
    deferred.fail(function() {
        ok(false, "Test failed (is Server up??)");
        start();
    });
});


asyncTest("ProductCatalogue.find", function() {
    var deferred = shop.getProductCatalogue().find(25);
    deferred.done(function(product) {
        ok(product.id === 25, "Test passed");
        start();
    });
    deferred.fail(function() {
        ok(false, "Test failed (is Server up??)");
        start();
    });
});


