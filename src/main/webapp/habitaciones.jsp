<%@page import="java.util.ArrayList"%>
<%@page import="com.ipartek.modelo.Habitacion"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Hotel Richi</title>
    <link rel="stylesheet" href="styles/style_productos.css" >
    <link rel="stylesheet" href="styles/style.css" >
</head>
<body>
    
    <%@include file="includes/cabecera.jsp" %>

   	<%@include file="includes/menu.jsp" %>

    <main>
    <h2>Habitaciones disponibles</h2>
       <section class="cuadricula">
			
			<%
				try {
		        	
		        	List<Habitacion> listaHabitaciones = (ArrayList<Habitacion>) request.getAttribute("listaHabitaciones");


					for(Habitacion habitacionDetalle : listaHabitaciones){
			%>
			<article class="producto">
				<div class="Imagen">
					<img alt="Habitacion de hotel" src="imagenes/habitacion.jpg">
			  	</div>
			  	<div class="Metros"><%=habitacionDetalle.getMetros() %> m<sup>2</sup></div>
			  	<div class="Precio"><%=habitacionDetalle.getPrecio() %> €</div>
			  	<div class="NumCamas"><%=habitacionDetalle.getNumeroCamas() %> camas</div>
			  	<div class="EsExterior"><%if(habitacionDetalle.isEsExterior()){%>Esta habitación es exterior<%}%></div>
			</article>
			<% }
	        } catch (Exception e) {
			}%>

		</section>
    </main>

   	<%@include file="includes/pie.jsp" %>

</body>
</html>