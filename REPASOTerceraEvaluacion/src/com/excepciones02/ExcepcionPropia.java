package com.excepciones02;

public class ExcepcionPropia extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cadena;
	
	public ExcepcionPropia() {
		super();
		cadena = "Soy una cadena";
	}
	
	public ExcepcionPropia(String cadena) {
		super();
		this.cadena = cadena;
	}
	
	public void lanzarExcepcion() {
		
		System.out.println(cadena);
	}
	
	@Override
	public String toString() {
		
		return cadena;
	}
	
}
