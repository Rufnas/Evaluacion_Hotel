package com.ipartek.modelo;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DB_Helper implements I_Constantes{
	
	
	public Connection conectar() {
		Connection con = null;

		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(CONEXION, USUARIO, PASS);
			System.out.println("BASE DE DATOS CONECTADA");
		} catch (ClassNotFoundException e) {
			System.out.println("NO SE ENCONTRO EL DRIVER");
		} catch (SQLException e) {
			System.out.println("ERROR AL CONECTAR A LA BD");
		}
		
		return con;
	}

	public void desconectar(Connection con) {
		try {
			con.close();
			System.out.println("BASE DE DATOS DESCONECTADA");
		} catch (SQLException e) {
			System.out.println("NO SE PUDO DESCONECTAR");
		}
	}

	public List<Habitacion> obtenerTodasLasHabitaciones(Connection con) {
		CallableStatement cs;
		List<Habitacion> habitaciones = new ArrayList<Habitacion>();
		try {
			cs = con.prepareCall(SP_HABITACIONES_OBTENER_TODAS);
			
			cs.execute();
			
			ResultSet rs = cs.getResultSet();
			
			while (rs.next()) {
				Habitacion habitacionAux = new Habitacion();
				
				habitacionAux.setId(rs.getInt(HABITACIONES_ID));
				habitacionAux.setNumeroHabitacion(rs.getInt(HABITACIONES_NUMERO_HABITACION));
				habitacionAux.setMetros(rs.getInt(HABITACIONES_METROS));
				habitacionAux.setPrecio(rs.getFloat(HABITACIONES_PRECIO));
				habitacionAux.setNumeroCamas(rs.getInt(HABITACIONES_NUMERO_CAMAS));
				habitacionAux.setEsExterior(rs.getBoolean(HABITACIONES_EXTERIOR));
				
				habitaciones.add(habitacionAux);
			}
//			System.out.println(series);
			return habitaciones;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
