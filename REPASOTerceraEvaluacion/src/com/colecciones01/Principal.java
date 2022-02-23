package com.colecciones01;

import java.util.*;

public class Principal {
	
	//teclado de acceso global y estatico
	public static Scanner sc = new Scanner(System.in);
	
	//metodo repetido confirmacion
	public static char confirmar() {
		//variables
		char confirmacion;
		
		System.out.println("\n¿Deseas realizar de nuevo la operacion? Si (s) | No (cualquier tecla)");
		confirmacion = sc.nextLine().charAt(0);
		
		return confirmacion;
	}
	
	//metodo para consultar toda la coleccion
	public static void consultarColeccion(Set<DragQueen> drags) {
		
		System.out.println("\nLISTADO DE DRAGS");
		System.out.println("----------------");
		
		for(DragQueen d : drags) {
			
			System.out.println(d.toString());
		}
	}
	
	//metodo introducir drag
	public static void introducirDrag(Set<DragQueen> drags) {
		//variables
		String nombre;
		int edad;
		String dragHouse;
		int puntosAcumulados;
		String ciudad;
		char confirmacion = 's';
		
		do {
			
			boolean correcto = false;
			boolean existe = false;
			
			System.out.println("\nDATOS PARA NUEVA DRAGQUEEN");
			System.out.println("--------------------------");
			
			System.out.print("\nIntroduce nombre: ");
			nombre = sc.nextLine();
			
			for(DragQueen d : drags) {
				
				if(d.getNombre().equalsIgnoreCase(nombre)) {
					System.out.println("\nYa existe una drag llamada " + nombre + " en la coleccion. No pueden repetirse nombres.");
					existe = true;
				}
					
			}
			
			if(!existe) {
			
				System.out.print("\nIntroduce edad: ");
				edad = Integer.parseInt(sc.nextLine());
				System.out.print("\nIntroduce familia drag: ");
				dragHouse = sc.nextLine();
				System.out.print("\nIntroduce puntos acumulados: ");
				puntosAcumulados = Integer.parseInt(sc.nextLine());
				System.out.print("\nIntroduce ciudad: ");
				ciudad = sc.nextLine();
				
				
				
				DragQueen dq = new DragQueen(nombre, edad, dragHouse, puntosAcumulados, ciudad);
				drags.add(dq);
				
				for(DragQueen pos : drags) {
					
					if(dq.equals(pos)) {
						
						System.out.println("\nDrag introducida correctamente: ");
						System.out.println(pos.toString());
						correcto = true;
						
					}			
					
				}
				if(!correcto)
					System.out.println("\nNo se introdujo correctamente el registro");
			}
			
			confirmacion = confirmar();
			
			
		}while(confirmacion == 's' || confirmacion == 'S');
		
	
	}
	
	//metodo para consultar drag por el nombre
	public static void consultarDragNombre(Set<DragQueen> drags) {
		//variables
		String nombre;
		char confirmacion;

		do {
			
			boolean existe = false;
			
			System.out.println("\nIntroduce el nombre de la drag a buscar: ");
			nombre = sc.nextLine();
			
			for(DragQueen d : drags) {
				
				if(d.getNombre().equalsIgnoreCase(nombre)) {
					
					System.out.println("\nDatos de " + nombre + ":");
					System.out.println(d.toString());
					existe = true;
					
				}
				
			}
			
			if(!existe)
				System.out.println("No se ha encontrado ninguna drag llamada " + nombre + ".");
			
			confirmacion = confirmar();
			
		}while(confirmacion == 's' || confirmacion == 'S');			
	
		
	}
	
	//metodo para consultar drag por el nombre
	public static void consultarDragCiudad(Set<DragQueen> drags) {
		//variables
		String ciudad;
		char confirmacion;
		
		do {
			
			boolean existe = false;
			
			System.out.println("\nIntroduce la ciudad de la drag a buscar: ");
			ciudad = sc.nextLine();
			
			System.out.println("\nDrags pertenecientes a " + ciudad + ":\n");
			
			for(DragQueen d : drags) {
				
				if(d.getCiudad().equalsIgnoreCase(ciudad)) {
					
					System.out.println(d.toString());
					existe = true;
					
				}
				
			}
			
			if(!existe)
				System.out.println("No se ha encontrado ninguna drag perteneciente a " + ciudad + ".");
			
			confirmacion = confirmar();
			
		}while(confirmacion == 's' || confirmacion == 'S');			
	
		
	}
		
	//metodo para modificar puntuacion
	public static void modificarPuntos(Set<DragQueen> drags) {
		//variables
		String nombre;
		int puntos;
		char confirmacion;
		
		do {
			
			boolean existe = false;
			
			System.out.println("\nIntroduce el nombre de la drag sobre la que quieres modificar sus puntos: ");
			nombre = sc.nextLine();
			
			for(DragQueen d : drags) {
				
				if(d.getNombre().equalsIgnoreCase(nombre)) {
					
					System.out.println("\nPuntos actuales de " + nombre + ":");
					System.out.println(d.getPuntosAcumulados());
					System.out.println("\nIntroduce nueva puntuacion: ");
					puntos = Integer.parseInt(sc.nextLine());
					d.setPuntosAcumulados(puntos);
					System.out.println("\nRegistro modificado:");
					System.out.println(d.toString());
					existe = true;
					
				}
				
			}
			
			if(!existe)
				System.out.println("No se ha encontrado ninguna drag llamada " + nombre + ".");
			
			confirmacion = confirmar();
			
		}while(confirmacion == 's' || confirmacion == 'S');	

		
	}
	
	//metodo para borrar drags con puntos dentro de un rango de valores
	public static void borrarDragRango(Set<DragQueen> drags) {
		//Variables
		int min, max, puntos;
		char confirmacion;
		
		do {
			
			boolean existe = false;
			
			System.out.println("Introduce valor minimo del rango:");
			min = Integer.parseInt(sc.nextLine());
			System.out.println("Introduce valor maximo del rango:");
			max = Integer.parseInt(sc.nextLine());
			
			Iterator<DragQueen> it = drags.iterator();
			
			while(it.hasNext()) {
				
				DragQueen d = it.next();
				puntos = d.getPuntosAcumulados();
				
				if(puntos > min && puntos < max) {
					
					it.remove();
					existe = true;
				}
				
			}
			
			if(!existe)
				System.out.println("No se encontraron drags con puntuacion entre " + min + " y " + max + ".");
			else
				System.out.println("Se borraron las drags con puntuacion entre " + min + " y " + max + ".");
			
			confirmacion = confirmar();
			
		}while(confirmacion == 's' || confirmacion == 'S');	
		
	}
	
	
	//metodo borrar toda la coleccion
	public static void borrarColeccion(Set<DragQueen> drags) {
		
		if(drags.isEmpty())
			System.out.println("\nLa coleccion ya esta vacia.");
		else {
			
			drags.removeAll(drags);
			if(drags.isEmpty())
				System.out.println("\nLa coleccion ha sido borrada exitosamente.");
			else
				System.out.println("\nHubo algun problema y no se borro la coleccion.");
		}		
		
	}
	
	//metodo salirMenu
	public static char salirMenu() {
		
		char confirmacion;
		
		System.out.println("\n¿Confirmas que deseas salir? Si (s) | No (cualquier tecla):");
		System.out.print("> ");
		confirmacion = sc.nextLine().charAt(0);
		return confirmacion;
		
	}

	public static void main(String[] args) {
		//Variables
		Set<DragQueen> drags = new TreeSet<DragQueen>(new OrdenarCiudad());
		int opcion;
		char confirmacion = 'n';
		
		DragQueen d1 = new DragQueen("ExiguaYdesfasada", 32, "LasMatas Drags", 234, "Madrid");
		DragQueen d2 = new DragQueen("FattyQueer", 37, "House of Fanegas", 327, "Cadiz");
		DragQueen d3 = new DragQueen("La Yelo", 27, "Yelo House", 3258, "Murcia");
		DragQueen d4 = new DragQueen("Inti", 34, "Bolivian Drags", 147, "La Paz");
		
		drags.add(d1);
		drags.add(d2);
		drags.add(d3);
		drags.add(d4);
		
		do {
			
			System.out.println("\nMENU DRAGQUEENS");
			System.out.println("---------------");
			System.out.print("\nConsultar coleccion (0)"
					+ "\nIntroducir nueva drag (1)"
					+ "\nConsultar drag por nombre (2)"
					+ "\nConsultar drag por ciudad (3)"
					+ "\nModificar puntos acumulados (4)"
					+ "\nBorrar drag en determinado rango de puntos (5)"
					+ "\nBorrar toda la coleccion (6)"
					+ "\nSalir (7)"
					+ "\n> ");
			
			opcion = Integer.parseInt(sc.nextLine());
			
			switch(opcion) {
			case 0:
				consultarColeccion(drags);
				break;
			case 1:
				introducirDrag(drags);
				break;
			case 2:
				consultarDragNombre(drags);
				break;
			case 3:
				consultarDragCiudad(drags);
				break;
			case 4:
				modificarPuntos(drags);
				break;
			case 5:
				borrarDragRango(drags);
				break;
			case 6:
				borrarColeccion(drags);
				break;
			case 7:
				confirmacion = salirMenu();
				break;
			default:
				System.out.println("\nLa opcion no es correcta. Elija una opcion valida (1-7)");
				break;
			}
		
		}while(confirmacion != 's' && confirmacion != 'S');

		
		System.out.println("Hasta otra...");
	}

}
