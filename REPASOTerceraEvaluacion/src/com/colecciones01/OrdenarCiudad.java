package com.colecciones01;

import java.util.Comparator;

public class OrdenarCiudad implements Comparator<DragQueen> {

	@Override
	public int compare(DragQueen o1, DragQueen o2) {
		
		String ciudad = o1.getCiudad();
		String ciudad2 = o2.getCiudad();
		int numero = ciudad.compareToIgnoreCase(ciudad2);
		
		if(numero!=0)
			return numero;
		else
			return o1.getNombre().compareToIgnoreCase(o2.getNombre());
	}

}
