package com.fichero01;

import java.io.*;

public class PruebaStream {

	public static void main(String[] args) {
		//variables
		String ruta = "/Users/joaquinalcazarcarrasco/pruebaFicheros";
		String fichero = "/pruebaStream.dat";
		File d = new File(ruta);
		File f = new File(ruta, fichero);
		
		try {
			
			d.mkdir();
			f.createNewFile();
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
			
			String texto = "Voy a contar del 1 al 25. Me doy cuenta de que rima. Sin embargo, no caere"
					+ " en esa estupidez."
					+ "\n1, 2, 3, 4, 5, 6, 7, 8, 9,"
					+ "\n10, 11, 12, 13, 14, 15, 16, 17, 18, 19,"
					+ "\n20, 21, 22, 23, 24, 25."
					+ "\nFin.";
			
			oos.writeObject(texto);			
			
			oos.close();
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
			
			//String contenido = ois.readObject().toString();
			//System.out.println(contenido);
			System.out.println(ois.readObject());				
			
			ois.close();
			
			
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}

	}

}
