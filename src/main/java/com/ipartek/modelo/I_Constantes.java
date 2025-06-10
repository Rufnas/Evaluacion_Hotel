package com.ipartek.modelo;

public interface I_Constantes {

	// constantes de la BD
	String BD = "jsp_hotel_richi";
	String DRIVER = "com.mysql.cj.jdbc.Driver";
	String CONEXION = "jdbc:mysql://localhost:3306/"+BD;
	String USUARIO = "root";
	String PASS = "1234";
	
	//constantes de los JSP
	String JSP_INDEX = "index.jsp";
	String JSP_HABITACIONES = "habitaciones.jsp";
	
	// contantes tablas, columnas y stores procedures de la BD
	String TABLA_HABITACIONES = "habitaciones";
	String HABITACIONES_ID = "Id";
	String HABITACIONES_NUMERO_HABITACION = "NumeroHabitacion";
	String HABITACIONES_METROS = "Metros";
	String HABITACIONES_PRECIO = "Precio";
	String HABITACIONES_NUMERO_CAMAS = "NumeroCamas";
	String HABITACIONES_EXTERIOR = "Exterior";
	
	String SP_HABITACIONES_OBTENER_TODAS = "call sp_habitaciones_obtener_todas";
}
