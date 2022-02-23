package com.mapa;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		//variables
		Map<String, String> diccionario = new HashMap<String, String>();
		
		diccionario.put("Book", "Libro");
		diccionario.put("Sky", "Cielo");
		diccionario.put("Window", "Ventana");
		diccionario.put("Boring", "Aburrido/a");
		diccionario.put("Feminist", "Feminista");
		diccionario.put("Year", "Año");
		diccionario.put("Moon", "Luna");
		diccionario.put("Tree", "Arbol");
		diccionario.put("Funny", "Divertido/a");
		
		//Este metodo devuelve el mapa como un listado tipo set
		//diccionario.entrySet();
		
		System.out.println("Diccionario Ingles - Espanol");
		System.out.println("----------------------------\n");
		
		//Para recorrer se  usa un for-each cuyo tipo de dato sera Map.Entry<K,V>
		///y recorrera un set, por eso se usa entrySet()		
		for(Map.Entry<String, String> registro : diccionario.entrySet()) {
			
			System.out.println(registro.getKey() + " - " + registro.getValue());
			
		}
		
		
		System.out.println("\nCreando ArrayList de claves...");
		
		//Se crea un arraylist de String para almacenar claves a eliminar del HashMap
		List<String> clavesEliminar = new ArrayList<String>();
		clavesEliminar.add("Book");
		clavesEliminar.add("Window");
		clavesEliminar.add("Year");
		
		System.out.println("\n...ArrayList de claves creado.");
		
		
		System.out.println("\nBorrando claves...");
		//int contador=0;
		
		//Se buscan las claves y se eliminan
		Iterator<String> itA = clavesEliminar.iterator();
		while(itA.hasNext()) {
			
			String clave = itA.next();
			
			Iterator<Map.Entry<String, String>> itB = diccionario.entrySet().iterator();
			while(itB.hasNext()) {
				
				String clave2 = itB.next().getKey();
				
				if(clave.equals(clave2)) {
					
					itB.remove();
					break;					
				}
				
				//contador++;
				
			}
			
		}
		
		//System.out.println("\ncontador: " + contador);
		System.out.println("\n...Claves borradas");
		
		System.out.println("\nDiccionario Ingles - Espanol");
		System.out.println("----------------------------\n");
		//Mostramos de nuevo el hashMap
		for(Map.Entry<String, String> registro : diccionario.entrySet()) {
			
			System.out.println(registro.getKey() + " - " + registro.getValue());
			
		}
		
		System.out.println("\nAgregando clave repetida...");
		diccionario.put("Funny", "Divertido/a");
		
		System.out.println("\n...Comprobando si permite inserciones repetidas:");
		
		System.out.println("\nDiccionario Ingles - Espanol");
		System.out.println("----------------------------\n");
		//Mostramos de nuevo el hashMap
		for(Map.Entry<String, String> registro : diccionario.entrySet()) {
			
			System.out.println(registro.getKey() + " - " + registro.getValue());
			
		}
		
		System.out.println("\nNo las permite...");
		
		
		
	}

}
