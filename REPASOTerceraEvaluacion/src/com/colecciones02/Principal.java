package com.colecciones02;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Vivienda> viviendas = new LinkedList<Vivienda>();
		
		Vivienda v1 = new Vivienda(1, Categoria.dos_habitaciones, "Calle pepito 42", 650);
		Vivienda v2 = new Vivienda(20, Categoria.tres_habitaciones, "Calle antonia 25", 900);
		Vivienda v3 = new Vivienda(3, Categoria.una_habitacion, "Calle ribera 78", 1200);
		Vivienda v4 = new Vivienda(4, Categoria.una_habitacion, "Calle priscilla 147", 450);
		Vivienda v5 = new Vivienda(5, Categoria.cinco_habitaciones, "Calle mariquita 74", 725);
		Vivienda v6 = new Vivienda(6, Categoria.cuatro_habitaciones, "Calle rollo bollo 98", 870);
		
		viviendas.add(v1);
		viviendas.add(v2);
		viviendas.add(v3);
		viviendas.add(v4);
		viviendas.add(v5);
		viviendas.add(v6);
		
		
		for(Vivienda v : viviendas) {
			
			System.out.println(v.toString());
		}
		
		Collections.sort(viviendas);
		
		System.out.println("\n");
		for(Vivienda v : viviendas) {
			
			System.out.println(v.toString());
		}
		
		
		
		

	}

}
