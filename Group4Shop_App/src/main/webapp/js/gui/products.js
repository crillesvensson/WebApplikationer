/*
 * All js for the products.html page 
 */

// Run after DOM constructed (same as $(document).ready())
$(function() {

    var nav = new Navigator(shop.getProductCatalogue());
    nav.prev(createTable, fail);
    function fail() {
        createErrorDialog("Can't list!!").dialog("open");
    }
    /*************************************
     * 
     * Components (from JQueryUI) and eventhandling
     */
    $("#next-button")
            .button()
            .click(function() {
        nav.next(createTable, fail);
        function fail() {
            createErrorDialog("Can't list!!").dialog("open");
        }
    });

    $("#prev-button")
            .button()
            .click(function() {
        nav.prev(createTable, fail);
        function fail() {
            createErrorDialog("Can't list!!").dialog("open");
        }
    });

    /**********************************************
     *   
     *   Functions for rendering tables, dialogs and helper functions
     */
    function createTable(products) {
        $("#products tbody > tr").remove();
        $.each(products, function(index, prod){
            $("<tr>"
                    + "<td>" + prod.id + "</td>"
                    + "<td>" + prod.name + "</td>"
                    + "<td>" + prod.price + "</td>"
                    + "<td>" + prod.category + "</td>"
                    + "<td>" + prod.description + "</td>").appendTo("#products tbody").click({product : prod}, function(event){
                          createEditDeleteDialog(event.data.product)});
        });
    }

    function createErrorDialog(message) {
        // Using JQueryUI dialog
        $("#dialog-message").dialog({
            autoOpen: false,
            modal: true,
            stack: true,
            buttons: {
                Cancel: function() {
                    $(this).dialog("close");
                },
                Ok: function() {
                    $(this).dialog("close");
                }
            }
        });
        $('#dialog-message').dialog('option', 'title', 'Something went wrong!');
        $("#dialog-message #msg").text(message);
        return $('#dialog-message');
    }
});