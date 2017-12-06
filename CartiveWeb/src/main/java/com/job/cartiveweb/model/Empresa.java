package com.job.cartiveweb.model;

public class Empresa {
	
	int id;
	String nombre;
	String direccion;
	int telefono;
	double puntuacion;
	String imagen;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public double getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public Empresa(int id, String nombre, String direccion, int telefono, double puntuacion, String imagen) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.puntuacion = puntuacion;
		this.imagen = imagen;
	}
	public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}