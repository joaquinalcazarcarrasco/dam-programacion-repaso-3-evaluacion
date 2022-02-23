package com.colecciones02;

public class Vivienda implements Comparable<Vivienda> {
	//Atributos
	int CodigoVivienda;
	Categoria categoria;
	String direccion;
	int precioAlquiler;
	
	//constructores
	public Vivienda() {}
	
	public Vivienda(int codigoVivienda, Categoria categoria, String direccion, int precioAlquiler) {
		//super();
		CodigoVivienda = codigoVivienda;
		this.categoria = categoria;
		this.direccion = direccion;
		this.precioAlquiler = precioAlquiler;
	}

	public int getCodigoVivienda() {
		return CodigoVivienda;
	}

	public void setCodigoVivienda(int codigoVivienda) {
		CodigoVivienda = codigoVivienda;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getPrecioAlquiler() {
		return precioAlquiler;
	}

	public void setPrecioAlquiler(int precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CodigoVivienda;
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
		Vivienda other = (Vivienda) obj;
		if (CodigoVivienda != other.CodigoVivienda)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vivienda [CodigoVivienda=" + CodigoVivienda + ", categoria=" + categoria + ", direccion=" + direccion
				+ ", precioAlquiler=" + precioAlquiler + "]";
	}

	@Override
	public int compareTo(Vivienda v) {
		
		int numero = this.precioAlquiler - v.getPrecioAlquiler();
		return numero;
	}
	
	
	
	
	
}
