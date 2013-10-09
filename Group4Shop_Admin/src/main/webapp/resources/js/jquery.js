var addFunction;
$(document).ready(function() {
    addFunction = function(){
        var addForm = $("#inputImageFile");
        var newAdd = '<h:outputText value="Image" styleClass="formTextCustom"/>' +
                '<h:inputFile value="#{add.image}" id="Image"/>' +
                '<h:message for="Image"/>';
        
        $(newAdd).last(newAdd);

       return false;
    };
});