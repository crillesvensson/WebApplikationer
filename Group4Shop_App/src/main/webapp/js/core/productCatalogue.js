/***********************************************
 *  
 *  A proxy representing the product service (model)
 *   NOTE: All methods return deferred object, see JQuery
 *  
 */

var ProductCatalogue = function(baseUri){
    this.baseUri = baseUri;
};


ProductCatalogue.prototype = (function(){ 

    return{
    
        getCount: function(){
           return $.getJSON(this.baseUri + "/count");
        },
    
        getRange: function(first, nItems){
           return $.getJSON(this.baseUri + "/range?fst=" + first + "&max=" + nItems);
        },
    
        find: function(id){
           return $.getJSON(this.baseUri + "/" + id);
        },
    
        getByName: function(name){
           return $.getJSON(this.baseUri + "?name=" + name);
        }
    };
})();
