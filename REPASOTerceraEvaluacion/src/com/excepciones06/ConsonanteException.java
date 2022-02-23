package com.excepciones06;

public class ConsonanteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String mensaje;
	
	public ConsonanteException() {}
	
	public ConsonanteException(String mensaje) {
		
		this.mensaje = mensaje;
	}
	
	@Override
	public String toString() {
		
		return "Excepcion: " + mensaje;
	}

}
