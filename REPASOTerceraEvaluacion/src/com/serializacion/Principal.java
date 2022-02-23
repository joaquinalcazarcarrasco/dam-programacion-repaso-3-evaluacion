package com.serializacion;

import java.io.*;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		//variables
		String ruta = "/Users/joaquinalcazarcarrasco/pruebaSerializacion";
		String archivo = "/drags.dat";
		File d = new File(ruta);
		File f = new File(ruta, archivo);
		ArrayList<DragQueen> drags = new ArrayList<DragQueen>();
		DragQueen d1 = new DragQueen("FattyQueer", 37, "Cadiz");
		DragQueen d2 = new DragQueen("Exigua y desfasada", 32, "Madrid");
		DragQueen d3 = new DragQueen("MariVulva", 30, "Madrid");
		DragQueen d4 = new DragQueen("La Yelo", 28, "Murcia");
		DragQueen d5 = new DragQueen("LaBellaTatoo", 47, "Cadiz");
		drags.add(d1);
		drags.add(d2);
		drags.add(d3);
		drags.add(d4);
		drags.add(d5);
		
		try {
			
			d.mkdir();
			f.createNewFile();
			
			try {
				
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
				
				for(DragQueen drag : drags) {
					
					oos.writeObject(drag);
				}
														
				oos.close();
				
				try {
					
					ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
					String registro;
					Boolean fin = false;
					
					while(!fin) {
						
						try {
						registro = ois.readObject().toString();
						System.out.println(registro);
						
						
						}catch(EOFException e) {
							
							fin = true;
							
						}catch(Exception e) {
							
							e.printStackTrace();
						}
						
					}
					
					ois.close();
					
				}catch(IOException e) {
					
					e.printStackTrace();
					
				}catch(Exception e) {
					
					e.printStackTrace();
				}
				
			}catch(IOException e) {
				
				e.printStackTrace();
				
			}catch(Exception e) {
				
				e.printStackTrace();
			
			}
			
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
