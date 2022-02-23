package com.bbdd;

import java.sql.*;

public class PruebaBBDD {

	public static void main(String[] args) {
		//Variables
		try {
			
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/productos", "root", "root");
		
			Statement st = conexion.createStatement();
			
			String query = "SELECT * FROM productos";
			ResultSet resultado = st.executeQuery(query);
			
			while(resultado.next()) {
				
				System.out.println("Id de producto: " + resultado.getString(1)
					+ " | Nombre de producto: " + resultado.getString(2)
					+ " | Cantidad en Stock: " + resultado.getString(3)
					+ " | Precio/unidad: " + resultado.getString(4));
			}
			
			query = "INSERT INTO productos(nombre, cantidad, precio) VALUES ('The underground railroad', 24, 39)";
			
			st.executeUpdate(query);
			
			query = "SELECT * FROM productos";
			resultado = st.executeQuery(query);
			
			while(resultado.next()) {
				
				System.out.println("Id de producto: " + resultado.getString(1)
					+ " | Nombre de producto: " + resultado.getString(2)
					+ " | Cantidad en Stock: " + resultado.getString(3)
					+ " | Precio/unidad: " + resultado.getString(4));
			}
			
			
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		
		}

	}

}
