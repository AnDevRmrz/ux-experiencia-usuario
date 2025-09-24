$(document).ready(function(){

    $("#eliminar_medicamento").click(function(){
        mostrarModal();
    });

    $(".modal_action").click(esconderModal);

    $("#seguimiento_button").click(function(){

        window.location.href = "seguimiento_medicamento.html";
    });    
});