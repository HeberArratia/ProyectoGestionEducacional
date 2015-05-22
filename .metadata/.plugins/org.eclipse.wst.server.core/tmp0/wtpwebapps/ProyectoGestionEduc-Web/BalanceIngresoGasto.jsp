
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="css/estiloallan.css">
<title>Registro Pago</title>
</head>
<body>
	<div c>
		<div class="pa1">
			<div class="pa2">
				<br>
				<h1 class="titulo">Balance Anual </h1>
			</div>
			<div Class="tabla">
			<table class="table table-bordered tabla" >
		      <thead>
		     <tr>
		      <th>Mes</th>
		      <th>Ingreso</td>
		      <th>Gasto</td>
		      <th>Balance</td>        
		   </tr>
		   </thead>
		   <% String[] mes = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio","julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};%>  
		   
		   <%for (int i = 0; i < mes.length; i++) {  // número de filas%>
				<tr>
			      <td><%=mes[i]%></td>
			      <td>xx</td>
			      <td>xx</td>
			      <td>xx</td>
			   </tr>
		   
			 <%}%>	
		   
		  
		    </table>
		    </div>
		</div>
	</div>
</body>
</html>