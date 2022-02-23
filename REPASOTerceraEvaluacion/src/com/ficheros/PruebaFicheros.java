package com.ficheros;

import java.io.*;

public class PruebaFicheros {

	
	public static void leeFichero() {
		
		try {
			
			FileReader file = new FileReader("/Users/joaquinalcazarcarrasco/eclipse-workspace/dam-programacion/REPASOTerceraEvaluacion/src/com/ficheros/fichero.txt");
		
			int c = file.read();
			
			while(c!=-1) {
				
				
				char letra = (char) c;
				System.out.print(letra);
				c = file.read();			
				
				
			}
			
			file.close();
			
		}catch(FileNotFoundException e) {
			
			System.out.println("No se encontro el fichero.");
			
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		
		leeFichero();
	}

}  
