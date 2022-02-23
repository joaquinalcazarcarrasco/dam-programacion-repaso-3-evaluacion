package com.excepciones02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 0;
		
		try {
		
			while(numero<20) {
				
				if(numero==5) {
					
					throw new ExcepcionPropia("Salimos por que es un 5");
					
				}else {
				
					System.out.println(numero);
				
				}
				
				numero++;
				
			}
		}catch(ExcepcionPropia e) {
			
			System.out.println(e.toString());
			e.lanzarExcepcion();
		}			
		
		
	}

}
