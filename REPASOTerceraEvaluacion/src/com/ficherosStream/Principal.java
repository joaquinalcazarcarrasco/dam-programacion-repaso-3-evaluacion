package com.ficherosStream;

import java.io.*;
import java.util.*;

public class Principal {
	
	public static String ruta = "/Users/joaquinalcazarcarrasco/";

	public static void main(String[] args) {
		//Array de Integer para guardar los bytes de la imagen
		ArrayList<Integer> bytesEntrada = new ArrayList<Integer>();
		
		try {
			//FileInputStream para convertir png en bytes
			FileInputStream fis = new FileInputStream(ruta + "FotoCarnet.png");
			Integer byteEntrada;
			boolean fin = false;
			
			while(!fin) {
				
				//Inicializamos variable de tipo Integer con lectura de byte
				byteEntrada = fis.read();
				
				//El metodo read() devuelve -1 cuando no hay mas bytes que leer
				//cuando no sea -1 almacenamos byte en arraylist
				if(byteEntrada!=-1) {
					
					bytesEntrada.add(byteEntrada);
					
				} else
					//cuando sea -1 cambiamos fin a true para salir del bucle
					fin = true;		
				
			}
			
			//cerramos fileinputstream
			fis.close();
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		
		
		try {
			
			//creamos objeto de tipo fileoutputstream para crear copia de imagen
			FileOutputStream fos = new FileOutputStream(ruta + "FotoCarnet_copia.png");
			
			//recorremos el arraylist
			for(Integer pos : bytesEntrada) {
				
				//Escribimos cada byte en fos
				fos.write(pos);
			}	
			
			//Cerramos fos
			fos.close();
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		

	}

}
