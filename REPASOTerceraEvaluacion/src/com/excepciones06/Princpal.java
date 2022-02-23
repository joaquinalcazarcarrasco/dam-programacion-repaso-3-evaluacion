package com.excepciones06;

import java.util.Scanner;

public class Princpal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char letra;
		
		System.out.println("Escribe una letra:");
		System.out.print("> ");
		letra = sc.nextLine().charAt(0);
		sc.close();
		
		try {
		
			esVocal(letra);
		
		}catch(VocalException e) {
			
			System.out.println(e.toString());
			
		}catch(ConsonanteException e) {
			
			System.out.println(e.toString());
			
		}
	}
	
	public static void esVocal(char a) throws VocalException, ConsonanteException {
		
			switch(a) {
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				throw new VocalException("Es una vocal");
			default:
				throw new ConsonanteException("Es una consonante");
			}
		
	}

}
