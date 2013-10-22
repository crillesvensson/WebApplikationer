$(function(){
    $('#aboutmenu li a').on('click', function(e){
        e.preventDefault();
        var page_url=$(this).prop('href');
        $('#info-text-box').load(page_url);
    });
});

