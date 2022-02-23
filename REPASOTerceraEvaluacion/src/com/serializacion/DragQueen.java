package com.serializacion;

import java.io.Serializable;

public class DragQueen implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	//atributos
	private String nombre;
	private int edad;
	private String ciudad;
	
	//constructores
	public DragQueen() {}
	public DragQueen(String nombre, int edad, String ciudad) {
		this.nombre = nombre;
		this.edad = edad;
		this.ciudad = ciudad;		
	}
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		DragQueen other = (DragQueen) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "DragQueen [nombre=" + nombre + ", edad=" + edad + ", ciudad=" + ciudad + "]";
	}
	
	

}
