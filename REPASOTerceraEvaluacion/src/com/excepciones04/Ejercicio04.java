package com.excepciones04;


public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teclado t = new Teclado();
		int resultado;

		do {
			
			resultado = t.leeEntero();
			
			if(resultado == 1)
				System.out.println("Muy bien, has pillado la pauta");
			else
				System.out.println("No has introducido un numero entero.");
			
		}while(resultado == 0);
	}

}
