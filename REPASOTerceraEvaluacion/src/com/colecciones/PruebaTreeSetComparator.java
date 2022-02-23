package com.colecciones;

import java.util.*;

public class PruebaTreeSetComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1 = new Persona(1, "Juan");
		Persona p2 = new Persona(2, "Maria");
		Persona p3 = new Persona(3, "Susana");
		Persona p4 = new Persona(4, "Roberto");
		
		Set<Persona> s = new TreeSet<Persona>(new OrdenaNombre());
		
		s.add(p1);
		s.add(p2);
		s.add(p3);
		s.add(p4);
		
		for(Persona p : s) {
			
			System.out.println(p.getNombre());
		}

	}
	
	
}

class Persona{
	
	private int codigo;
	private String nombre;
	
	public Persona() {}
	public Persona(int codigo, String nombre) {
		
		this.codigo = codigo;
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}

class OrdenaNombre implements Comparator<Persona>{

	@Override
	public int compare(Persona o1, Persona o2) {
		
		String nombre1 = o1.getNombre();
		String nombre2 = o2.getNombre();		
		
		return nombre1.compareTo(nombre2);
	}
	
	
}