package com.bbddFicheros;

import java.sql.*;
import java.io.*;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		//variables
		Set<DragQueen> drags = new TreeSet<DragQueen>();
		Set<DragQueen> drags2 = new TreeSet<DragQueen>(new OrdenEdad());
		DragQueen d1 = new DragQueen("FattyQueer", 37, "Cadiz");
		DragQueen d2 = new DragQueen("ExiguaYdesfasada", 32, "Madrid");
		DragQueen d3 = new DragQueen("MariVulva", 30, "Madrid");
		DragQueen d4 = new DragQueen("La Bella Tattoo", 47, "Cadiz");
		DragQueen d5 = new DragQueen("Puppy Poison", 30, "Madrid");
		DragQueen d6 = new DragQueen("La Pinchos", 33, "Madrid");
		DragQueen d7 = new DragQueen("Farala", 27, "Sevilla");
		DragQueen d8 = new DragQueen("La Yelo", 28, "Murcia");
		DragQueen d9 = new DragQueen("Pepota Bellota", 35, "Santander");
		DragQueen d10 = new DragQueen("CliffHanGay", 28, "Jaen");
		drags.add(d1);
		drags.add(d2);
		drags.add(d3);
		drags.add(d4);
		drags.add(d5);
		drags.add(d6);
		drags.add(d7);
		drags.add(d8);
		drags.add(d9);
		drags.add(d10);
		drags2.addAll(drags);
			
		for(DragQueen drag: drags) {
			
			System.out.println(drag.toString());
			
		}
		
		System.out.println("");
		
		for(DragQueen drag: drags2) {
			
			System.out.println(drag.toString());
			
		}
		
		try {
			
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/dragqueens", "root", "root");
			
			
			//borrar registros para cada vez que compile y ejecute
			String query = "DELETE FROM dragqueens";
			Statement st = conexion.createStatement();
			st.executeUpdate(query);
			
			//insertamos el treeset en la base de datos
			query = "INSERT INTO dragqueens VALUES (?, ?, ?)";
			PreparedStatement ps = conexion.prepareStatement(query);
			
			for(DragQueen drag: drags) {
				
				ps.setString(1, drag.getNombre());
				ps.setInt(2, drag.getEdad());
				ps.setString(3, drag.getCiudad());
				
				ps.executeUpdate();
			}
			
			try {
				String ruta = "/Users/joaquinalcazarcarrasco/dragqueens";
				String archivo = "/dragqueens.txt";
				File d = new File(ruta);
				File f = new File(ruta, archivo);
				
				d.mkdir();
				f.createNewFile();
				
				BufferedWriter bw = new BufferedWriter(new FileWriter(f));
				
				try {
					
					String registro;
					query = "SELECT * FROM dragqueens";
					ResultSet rs = st.executeQuery(query);
					
					while(rs.next()) {
						
						registro = "DragQueen llamada " + rs.getString(1)
						+ " de " + rs.getString(2) + " años de edad, procedente de "
						+ rs.getString(3) + ".";
						
						bw.write(registro);
						bw.newLine();
						
					}
					
				}catch (SQLException e) {
					
					e.printStackTrace();
					
				}catch(Exception e) {
					
					e.printStackTrace();
				
				}
				
				
				bw.close();
				
			}catch(IOException e) {
				
				e.printStackTrace();
				
			}catch(Exception e) {
				
				e.printStackTrace();
				
			}
			
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		
		}catch(Exception e) {
			
			e.printStackTrace();
		}
	}

}
