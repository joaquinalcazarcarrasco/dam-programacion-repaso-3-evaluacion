package com.colecciones03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Principal {

	public static void main(String[] args) {
		//variables
		ArrayList<String> personajes = new ArrayList<String>();
		personajes.add("Susana");
		personajes.add("Roberta");
		personajes.add("Juana");
		ArrayList<String> autores = new ArrayList<String>();
		autores.add("Sonia de la Mesa");
		Libro l1 = new Libro(0001, "La marea del molino", 1987, personajes, autores);
		Libro l2 = new Libro(0002, "El cojin volador", 2000, personajes, autores);
		Libro l3 = new Libro(0003, "Las aventuras de Flan y Piña", 2021, personajes, autores);
		Libro l4 = new Libro(0004, "Mundo onirico", 2012, personajes, autores);
		Libro l5 = new Libro(0005, "Dedos, para que os quiero", 1974, personajes, autores);
		
		LinkedList<Libro> biblioteca = new LinkedList<Libro>();
		biblioteca.add(l1);
		biblioteca.add(l2);
		biblioteca.add(l3);
		biblioteca.add(l4);
		biblioteca.add(l5);
		
		System.out.println("\nLibros en la biblioteca.");
		for(Libro l : biblioteca) {
			
			System.out.println(l.toString());
		}
		
		//Eliminemos libros por su ISBN
		int id = 0005;
		
		System.out.println("\nBuscando y eliminando libro con ISBN " + id + "...");
		
		ListIterator<Libro> it = biblioteca.listIterator();
		while(it.hasNext()) {
			
			Libro l = it.next();
			
			if(id == l.getISBN())
				it.remove();
			
		}
		
		System.out.println("\n...Libro borrado:");
		System.out.println("\nLibros en la biblioteca.");
		for(Libro l : biblioteca) {
			
			System.out.println(l.toString());
		}
		
		System.out.println("\nEl total de libros almacenados en la biblioteca es " + biblioteca.size() + ".");

	}

}
