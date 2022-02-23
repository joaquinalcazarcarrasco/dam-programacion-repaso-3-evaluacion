package com.colecciones04;

import java.util.Comparator;

public class OrdenNombre implements Comparator<Pelicula> {

	@Override
	public int compare(Pelicula o1, Pelicula o2) {
		
		String n1 = o1.getNombre();
		String n2 = o2.getNombre();
		
		return n1.compareToIgnoreCase(n2);
	}
	
	

}
