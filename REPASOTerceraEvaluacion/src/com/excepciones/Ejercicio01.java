package com.excepciones;

public class Ejercicio01 {

	public static void main(String[] args) {
		//variables
		int[] numeros1al10 = {1,2,3,4,5,6,7,8,9,10};
		
		try {
			
			for(int i=0;i<=10;i++) {
				System.out.println(numeros1al10[i] + "");
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Se ha sobrepasado la capacidad del array.");
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}

	}

}
