package com.colecciones03;

import java.util.ArrayList;

public class Libro {
	//atributos
	private int ISBN;
	String titulo;
	int anyoEdicion;
	ArrayList<String> personajes;
	ArrayList<String> autores;
	
	//constructores
	public Libro() {}
	public Libro(int ISBN, String titulo, int anyoEdicion, ArrayList<String> personajes, ArrayList<String> autores) {
		
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.anyoEdicion = anyoEdicion;
		this.personajes = personajes;
		this.autores = autores;
		
	}
	
	//getters y setters
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAnyoEdicion() {
		return anyoEdicion;
	}
	public void setAnyoEdicion(int anyoEdicion) {
		this.anyoEdicion = anyoEdicion;
	}
	public ArrayList<String> getPersonajes() {
		return personajes;
	}
	public void setPersonajes(ArrayList<String> personajes) {
		this.personajes = personajes;
	}
	public ArrayList<String> getAutores() {
		return autores;
	}
	public void setAutores(ArrayList<String> autores) {
		this.autores = autores;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ISBN;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (ISBN != other.ISBN)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", titulo=" + titulo + ", anyoEdicion=" + anyoEdicion + ", personajes="
				+ personajes + ", autores=" + autores + "]";
	}
	
	

}
