$(document).ready(function(){

    $("#menu_button").click(mostrarMenu);

    $(".menu_option_content").click(function(){

        var redirectTo = $(this).attr("redirectTo");
        window.location.href = redirectTo;        
    })
});

function mostrarModal() {

    $(".modal_background").fadeIn(300, function(){

        $(".modal_dialog").fadeIn(300);
        $(".modal_background").click(esconderModal);
    });
}

function esconderModal() {

    $(".modal_dialog").fadeOut(300, function(){

        $(".modal_background").fadeOut(300);
    });
}

function mostrarMenu() {

    $("#menu_background").fadeIn(300, function(){

        $("#menu_content").animate({"left": "0px"}, "fast");
        $("#menu_background").click(esconderMenu);
    });
}

function esconderMenu() {

    $("#menu_content").animate({"left": "-50%"}, "fast");
    $("#menu_background").fadeOut(300);
}

