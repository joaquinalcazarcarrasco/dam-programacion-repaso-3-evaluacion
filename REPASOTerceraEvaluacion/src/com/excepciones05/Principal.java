package com.excepciones05;

import java.util.Scanner;

public class Principal {
	
	public static void isPar(int a) throws ParException, ImparException{
		
		if(a%2==0)
			throw new ParException("El numero introducido es par");
		else
			throw new ImparException("El numero introducido es impar");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Introduce un numero entero:");
		System.out.print("> ");
		numero = sc.nextInt();
		sc.close();
		
		try {
			
			isPar(numero);
			
		}catch(ParException e) {
			
			System.out.println(e.toString());
			
		}catch(ImparException e) {
			
			System.out.println(e.toString());
			
		}
		
		
		
	}

}
