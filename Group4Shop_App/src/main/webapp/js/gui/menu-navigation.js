$(function(){
    $('#content').load("content/home.html");
    
    $('#mainmenu li a').on('click', function(e){
        e.preventDefault();
        var page_url=$(this).prop('href');
        $('#content').load(page_url);

    });
});

