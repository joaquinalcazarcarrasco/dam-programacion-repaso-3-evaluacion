package com.bbddFicheros;

import java.util.Comparator;

public class OrdenEdad implements Comparator<DragQueen> {

	@Override
	public int compare(DragQueen o1, DragQueen o2) {
		
		int e1 = o1.getEdad();
		int e2 = o2.getEdad();
		
		int numero = e1 - e2;
		
		if(numero!=0)
			return numero;
		else {
			
			String n1 = o1.getNombre();
			String n2 = o2.getNombre();
			
			return n1.compareToIgnoreCase(n2);
			
		}
			
	}
	
	
}
