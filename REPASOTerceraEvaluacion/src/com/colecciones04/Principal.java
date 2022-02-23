package com.colecciones04;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		//Variables
		Pelicula p1 = new Pelicula("La trinchera infinita", 2020, "La productora");
		Pelicula p2 = new Pelicula("Una joven prometedora", 2021, "Otra productora");
		Pelicula p3 = new Pelicula("Kill Bill", 2000, "Esa misma");
		Pelicula p4 = new Pelicula("Aladdin", 1990, "Disney Productions");
		Pelicula p5 = new Pelicula("Tu madre se ha comido a mi perro", 1987, "Cutre de cojones");
		Pelicula p6 = new Pelicula("Kick Ass", 2012, "Lalala Land");
		Pelicula p7 = new Pelicula("Un beso, un cigarro y a llorar", 2017, "Me aburro Company");
		Pelicula p8 = new Pelicula("FattyQueer, origen de una diva", 2034, "Wigs and Lashes");
		
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		
		//Agrego las 4 cuatro primeras al principio de la lista
		System.out.println("\nAgregando peliculas al principio de la lista:");
		peliculas.add(0, p1);
		System.out.println("\n...agregando " + p1.getNombre());
		peliculas.add(0, p2);
		System.out.println("...agregando " + p2.getNombre());
		peliculas.add(0, p3);
		System.out.println("...agregando " + p3.getNombre());
		peliculas.add(0, p4);
		System.out.println("...agregando " + p4.getNombre());
		
		System.out.println("\nListado de peliculas:");
		for(Pelicula p : peliculas) {
			System.out.println(p.toString());
		}
				
		
		//Agrego las 4 siguientes al final de la lista
		System.out.println("\nAgregando peliculas al final de la lista:");
		peliculas.add(p5);
		System.out.println("\n...agregando " + p5.getNombre());
		peliculas.add(p6);
		System.out.println("...agregando " + p6.getNombre());
		peliculas.add(p7);
		System.out.println("...agregando " + p7.getNombre());
		peliculas.add(p8);
		System.out.println("...agregando " + p8.getNombre());
		
		System.out.println("\nListado de peliculas:");
		for(Pelicula p : peliculas) {
			System.out.println(p.toString());
		}
		
		//Obtener el primer elemento de la lista
		System.out.println("\nPrimer elemento de la lista");
		System.out.println(peliculas.get(0).toString());
		
		//Obtener el ultimo elemento de la lista
		System.out.println("\nUltimo elemento de la lista");
		System.out.println(peliculas.get(peliculas.size()-1).toString());
		
		//Ordenar lista por año ascendente
		peliculas.sort(new OrdenPeliculas());
		System.out.println("\nListado de peliculas ordenadas por anyo ascendente:");
		for(Pelicula p : peliculas) {
			System.out.println(p.getAnyo() + ": " + p.getNombre());
		}
		
		//Ordenar lista por año descendente
		peliculas.sort(new OrdenPeliculasI());
		System.out.println("\nListado de peliculas ordenadas por anyo descendente:");
		for(Pelicula p : peliculas) {
			System.out.println(p.getAnyo() + ": " + p.getNombre());
		}
		
		//Ordenar lista por nombre ascendente
		peliculas.sort(new OrdenNombre());
		System.out.println("\nListado de peliculas ordenadas por nombre ascendente:");
		for(Pelicula p : peliculas) {
			System.out.println(p.getNombre());
		}
		
		//Ordenar lista por nombre descendente
		peliculas.sort(new OrdenNombreI());
		System.out.println("\nListado de peliculas ordenadas por nombre descendente:");
		for(Pelicula p : peliculas) {
			System.out.println(p.getNombre());
		}
		
		//agregamos dos peliculas con mismo anyo para comprobar si funciona bien la ordenacion por anyo+nombre
		System.out.println("\nAgregando dos pelis nuevas...");
		Pelicula p9 = new Pelicula("El camino de la tortuga invertida", 2020, "Holi Productions");
		Pelicula p10 = new Pelicula("La aventura de Panete", 1990, "Mediocre Films");
		peliculas.add(p9);
		peliculas.add(p10);
		
		//Ordenamos por anyo y si se repite por nombre.
		System.out.println("\nOrdenando por anyo, y si se repite, por nombre...");
		peliculas.sort(new OrdenPeliculas());
		for(Pelicula p : peliculas) {
			System.out.println(p.getAnyo() + ": " + p.getNombre());
		}
	}

}
