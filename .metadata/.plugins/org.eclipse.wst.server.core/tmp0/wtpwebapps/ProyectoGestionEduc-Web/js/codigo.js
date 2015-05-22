
$(document).ready(function(){
// HTML 
	//alert("probando");
	var bandera = 0;
	$("#boton1").on("click",function(){
		
		 if (bandera==1){
		 	$("#submenu1").slideUp("slow");
		 	$("#boton1").css("color","#0C6395");
		 	$("#boton1 i").attr("class","fa fa-angle-down");
		 	bandera = 0;
		 } else{
		 	$("#boton1 i").attr("class","fa fa-angle-up");
		 	$("#boton2 i").attr("class","fa fa-angle-down");
		 	$("#boton3 i").attr("class","fa fa-angle-down");
		 	$("#boton4 i").attr("class","fa fa-angle-down");

		 	$("#boton1").css("color","#031a5a");
            $("#boton2").css("color","#0C6395");
            $("#boton3").css("color","#0C6395");
            $("#boton4").css("color","#0C6395");
            $("#submenu1").slideDown("slow");
            $("#submenu2").slideUp("slow");
            $("#submenu3").slideUp("slow");
            $("#submenu4").slideUp("slow");
            bandera = 1;  
		 }
		      
	});

	$("#boton2").on("click",function(){
			
		 if (bandera==2){
		 	$("#boton2 i").attr("class","fa fa-angle-down");
		 	$("#submenu2").slideUp("slow");
		 	$("#boton2").css("color","#0C6395");
		 	bandera = 0;
		 } else{
		 	$("#boton2 i").attr("class","fa fa-angle-up");
		 	$("#boton1 i").attr("class","fa fa-angle-down");
		 	$("#boton3 i").attr("class","fa fa-angle-down");
		 	$("#boton4 i").attr("class","fa fa-angle-down");

		 	$("#boton2").css("color","#031a5a");
            $("#boton1").css("color","#0C6395");
            $("#boton3").css("color","#0C6395");
            $("#boton4").css("color","#0C6395");
		    $("#submenu2").slideDown("slow");
            $("#submenu1").slideUp("slow");
            $("#submenu3").slideUp("slow");
            $("#submenu4").slideUp("slow");
            bandera = 2;  
		 }

		 
	});

	$("#boton3").on("click",function(){
		 if (bandera==3){
		 	$("#boton3 i").attr("class","fa fa-angle-down");
		 	$("#submenu3").slideUp("slow");
		 	$("#boton3").css("color","#0C6395");
		 	bandera = 0;
		 } else{
		 	$("#boton3 i").attr("class","fa fa-angle-up");
		 	$("#boton1 i").attr("class","fa fa-angle-down");
		 	$("#boton2 i").attr("class","fa fa-angle-down");
		 	$("#boton4 i").attr("class","fa fa-angle-down");

		 	$("#boton3").css("color","#031a5a");
            $("#boton1").css("color","#0C6395");
            $("#boton2").css("color","#0C6395");
            $("#boton4").css("color","#0C6395");
		    $("#submenu3").slideDown("slow");
            $("#submenu1").slideUp("slow");
            $("#submenu2").slideUp("slow");
            $("#submenu4").slideUp("slow");
            bandera = 3;  
		 }

		 
	});
	$("#boton4").on("click",function(){
		 if (bandera==4){
		 	$("#boton4 i").attr("class","fa fa-angle-down");
		 	$("#submenu4").slideUp("slow");
		 	$("#boton4").css("color","#0C6395");
		 	bandera = 0;
		 } else{
		 	$("#boton4 i").attr("class","fa fa-angle-up");
		 	$("#boton1 i").attr("class","fa fa-angle-down");
		 	$("#boton3 i").attr("class","fa fa-angle-down");
		 	$("#boton2 i").attr("class","fa fa-angle-down");

		 	$("#boton4").css("color","#031a5a");
         	$("#boton1").css("color","#0C6395");
         	$("#boton2").css("color","#0C6395");
         	$("#boton3").css("color","#0C6395");
		 	$("#submenu4").slideDown("slow");
		 	$("#submenu3").slideUp("slow");
		 	$("#submenu2").slideUp("slow");
         	$("#submenu1").slideUp("slow");
            bandera = 4;  
		 }
         
	});

});

/* Se va a añidir un evento a "boton" llamando a una 
funcion de "afuera" */


