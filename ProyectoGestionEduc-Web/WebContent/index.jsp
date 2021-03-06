<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8"> 
	<!-- Estilos -->
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css/estilo.css">
	<link rel="stylesheet" type="text/css" href="css/font-awesome.css">
	<link rel="stylesheet" type="text/css" href="css/fonts.css">
	<!-- JS -->
	<script type="text/javascript" src="js/jquery-2.1.3.min.js"></script>
	<script type="text/javascript" src="js/codigo.js"></script>
	<title>Bienvenido</title>
</head>
<body>
	<!-- Titulo -->
	<header class="text-center principal">
		<h1>Bienvenido</h1>
	</header>
<!-- Contenido -->
<div id="contenido" class="container">
<section id="usuarios" class="">	
	<!-- Titulo Contenido -->
	<header>
		<img src="images/user.png" alt="">
		<h3>Seleccione perfil</h3>
	</header>
	<!-- Inicio formulario -->
	<form>
  		 <div id="boton1" class="userboton"><i class="fa fa-angle-down"></i></i> DIRECTOR</div>
 		 <div id="submenu1" class="">
 		 	<p class="seleccione">Seleccione tarea:</p>
 		 	<ul> 			 
    			<li><a href="MorososMatricula.jsp"><i class="fa fa-hand-o-right"></i> Obtener reporte estudiantes morosos en los pagos de matrícula. </p></a></li>
    			<li><a href="MorososMensualidad.jsp"><i class="fa fa-hand-o-right"></i> Obtener reporte estudiantes morosos en los pagos de mensualidad. </p></a></li>
    			<li><a href="ReporteSueldoPorProfesor.jsp"><i class="fa fa-hand-o-right"></i> Conocer pagos profesores por curso y si fue realizado. </p></a></li>
    			<li><a href="DesactivarCurso.jsp"><i class="fa fa-hand-o-right"></i> Desactivar curso. </p></a></li>
    			<li><a href="BalanceIngresoGasto.jsp"><i class="fa fa-hand-o-right"></i> Obtener balance de ingreso y gasto. </p></a></li>
    		</ul>  
  		 </div>
  
        <div id="boton2" class="userboton"><i class="fa fa-angle-down"></i></i> JEFE ADM</div>
		<div id="submenu2" class="">
			<p class="seleccione">Seleccione tarea:</p>
   			<ul> 			 
    			<li><a href="RegistrarSueldo.jsp"><i class="fa fa-hand-o-right"></i> Registrar sueldo profesor por curso. </p></a></li>
    			<li><a href="CrearCurso.jsp"><i class="fa fa-hand-o-right"></i> Crear curso y asignar profesor. </p></a></li>
    		</ul>  
  		</div>

  		<div id="boton3" class="userboton"><i class="fa fa-angle-down"></i></i> PROFESOR</div>
		<div id="submenu3" class="">
			<p class="seleccione">Seleccione tarea:</p>
   			<ul> 			 
    			<li><a href="InscribirAlumno.jsp"><i class="fa fa-hand-o-right"></i> Inscribir alumno en un curso.</p></a></li>
    		</ul>  
  		</div>

  		<div id="boton4" class="userboton"><i class="fa fa-angle-down"></i></i> SECRETARIA</div>
		<div id="submenu4" class="">
			<p class="seleccione">Seleccione tarea:</p>
   			<ul> 			 
    			<li><a href="PagoMatricula.jsp"><i class="fa fa-hand-o-right"></i> Registrar pago matrícula del estudiante.</p></a></li>
    			<li><a href="PagoMensualidad.jsp"><i class="fa fa-hand-o-right"></i> Registrar pago mensualidad del estudiante.</p></a></li>
    		</ul>  
  		</div>
  		    <!-- BOTON -->
  		 	<!--<button type="button" class="btn btn-primary">Entrar</button>-->
	</form> <!-- Fin formulario -->
</section>
</div> <!-- Fin Contenido -->
<footer>
	Heber Arratia - UFRO
</footer>
</body>
</html>