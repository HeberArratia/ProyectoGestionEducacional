<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
</body>
</html>
<html>
<head>
  <meta charset="utf-8"> 
  <!-- Estilos -->
  <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
  <link rel="stylesheet" type="text/css" href="css/estilocaso2.css">
  <!-- JS -->

  <!--<link href='http://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>-->
  <title>Secretaria: Registrar pago mensualidad</title>
</head>
<body>
  <!-- Titulo -->
  <header class="text-center principal">
    <h1>Secretaria</h1>
  </header>
  <div id="menu">
  <a href="index.jsp"><span><img src="images/Home.png" alt=""></span>Inicio</a>
  </div>
<!-- Contenido -->
<div id="contenido" class="container">
<!-- Inicio panel --> 
  <div class="panel panel-default">
    <!-- Titulo panel -->
        <div class="panel-heading">Registrar pago mensualidad</div>
          <!--Panel content-->
        <div class="panel-body">
          <!--Inicio formulario-->
          <form>  
          </form>
           <!--Maquetado -->
          <label for="exampleInput">Rut Estudiante:</label>
                <div class="form-inline">   
                   <input type="text" class="ancho200 form-control" name="rut" required></imput>
                   <button type="submit" class="btn btn-primary">Ingresar</button>
                </div> 
                <div class="separar"></div>
           <div class="imprimirestudiante alert alert-info" role="alert">
         <!-- Se muetra la información del estudiante -->
         
        <strong>Información del estudiante</strong>
        <p>Nombre: ${nombre}</p>
        <p>Apellido: ${apellido}</p>
        <p>Rut: ${rut}</p>
        <p>Estado Matrícula: ${estado}</p>
        </div>     
        
           <strong>Seleccione mes</strong>
          <select class="form-control ancho100">
         
  <option>Enero</option>
  <option>Febrero</option>
  <option>3</option>
  <option>4</option>
  <option>5</option>
</select>
  <div class="separar"></div>
         <p>Monto por curso: $10.000</p>
         <p>Total pagado: <strong>${total}</strong></p>
        </div>
          <button id="boton" type="submit" class="btn btn-primary btn-lg"
            >Registrar pago</button>  
 <div class="separar"></div>
 
  </div>  <!-- Fin del panel -->  



</div>  <!-- Fin del contenido -->
</body>
</html>