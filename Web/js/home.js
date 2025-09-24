$(document).ready(function(){

    $(".option_image").click(function(){

        var redirectTo = $(this).attr("redirectTo");
        window.location.href = redirectTo;        
    })
});