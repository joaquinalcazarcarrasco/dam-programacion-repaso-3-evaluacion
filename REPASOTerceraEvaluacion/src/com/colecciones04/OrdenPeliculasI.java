package com.colecciones04;

import java.util.Comparator;

public class OrdenPeliculasI implements Comparator<Pelicula>{
	@Override
	public int compare(Pelicula o1, Pelicula o2) {
		
		int anyo1 = o1.getAnyo();
		int anyo2 = o2.getAnyo();
		String n1 = o1.getNombre();
		String n2 = o2.getNombre();
		
		int numero = anyo2 - anyo1;
		
		if(numero != 0)
			return numero;
		else
			return n2.compareToIgnoreCase(n1);
		
	}
}
