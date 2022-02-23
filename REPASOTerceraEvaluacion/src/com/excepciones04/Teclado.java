package com.excepciones04;

import java.util.Scanner;

public class Teclado {
	
	
	public Teclado() {
		super();
	}
	
	public int leeEntero() {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		try {
			System.out.println("Introduce un numero entero");
			System.out.print("> ");
			numero = Integer.parseInt(sc.nextLine());
			
			numero++;
			System.out.println("El numero incrementado en 1 es " + numero);
			
			sc.close();
			
		}catch(NumberFormatException e) {
			
			return 0;
			
		}catch(Exception e) {
			
			return 0;
			
		}
				
		return 1;
	}
	
}
