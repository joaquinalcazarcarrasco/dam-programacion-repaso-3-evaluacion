package com.ficheros;

import java.io.*;

public class PruebaEscrituraFichero {

	public static void escribirFichero() {
		
		String frase = "Pues me parece que la vida es muy bonita";
		
		try {
			
			FileWriter file = new FileWriter("/Users/joaquinalcazarcarrasco/eclipse-workspace/dam-programacion/REPASOTerceraEvaluacion/src/com/ficheros/fichero2.txt");
		
			for(int i=0;i<frase.length();i++) {
				
				file.write(frase.charAt(i));
			}
			
			file.close();
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void leerFichero() {
		
		
		try {
			
			FileReader file = new FileReader("/Users/joaquinalcazarcarrasco/eclipse-workspace/dam-programacion/REPASOTerceraEvaluacion/src/com/ficheros/fichero2.txt");
			
			int c = file.read();
			
			while(c!=-1) {
				
				char letra = (char) c;
				System.out.print(letra);
				
				c = file.read();
				
			}
			
			
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		escribirFichero();
		leerFichero();

	}

}
