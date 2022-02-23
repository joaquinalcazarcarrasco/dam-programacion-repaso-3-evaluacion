package com.colecciones01;

import java.util.Comparator;

public class OrdenarNombre implements Comparator<DragQueen> {

	@Override
	public int compare(DragQueen o1, DragQueen o2) {
		
		String nombre1 = o1.getNombre();
		String nombre2 = o2.getNombre();
		
		return nombre1.compareTo(nombre2);

		
	}

}
