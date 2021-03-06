package com.job.cartiveweb.model;

import java.util.Date;

public class Viaje {
	
	int id;
	String tipo;
	String destino;
	Date fechapartida;
	String horapartida;
	int numerotickets;	
	int numeroticketsdisponibles;
	int numerohoras;
	int empresa_id;	
	int bus_id;
	int precio;
	
	Empresa empresa=new Empresa();
	
	Bus bus = new Bus();
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public Date getFechapartida() {
		return fechapartida;
	}
	
	public void setFechapartida(Date fechapartida) {
		this.fechapartida = fechapartida;
	}
	
	public String getHorapartida() {
		return horapartida;
	}
	
	public void setHorapartida(String horapartida) {
		this.horapartida = horapartida;
	}
	
	public int getNumerotickets() {
		return numerotickets;
	}
	
	public void setNumerotickets(int numerotickets) {
		this.numerotickets = numerotickets;
	}
	
	public int getNumeroticketsdisponibles() {
		return numeroticketsdisponibles;
	}
	
	public void setNumeroticketsdisponibles(int numeroticketsdisponibles) {
		this.numeroticketsdisponibles = numeroticketsdisponibles;
	}
	
	public int getNumerohoras() {
		return numerohoras;
	}
	
	public void setNumerohoras(int numerohoras) {
		this.numerohoras = numerohoras;
	}
	
	public int getEmpresa_id() {
		return empresa_id;
	}
	
	public void setEmpresa_id(int empresa_id) {
		this.empresa_id = empresa_id;
	}
	
	public int getBus_id() {
		return bus_id;
	}
	
	public void setBus_id(int bus_id) {
		this.bus_id = bus_id;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	@Override
	public String toString() {
		return "Viaje [id=" + id + ", tipo=" + tipo + ", destino=" + destino + ", fechapartida=" + fechapartida
				+ ", horapartida=" + horapartida + ", numerotickets=" + numerotickets + ", numeroticketsdisponibles="
				+ numeroticketsdisponibles + ", numerohoras=" + numerohoras + ", empresa_id=" + empresa_id + ", bus_id="
				+ bus_id + ", precio=" + precio + "]";
	}
	
	public Viaje(int id, String tipo, String destino, Date fechapartida, String horapartida, int numerotickets,
			int numeroticketsdisponibles, int numerohoras, int empresa_id, int bus_id, int precio) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.destino = destino;
		this.fechapartida = fechapartida;
		this.horapartida = horapartida;
		this.numerotickets = numerotickets;
		this.numeroticketsdisponibles = numeroticketsdisponibles;
		this.numerohoras = numerohoras;
		this.empresa_id = empresa_id;
		this.bus_id = bus_id;
		this.precio = precio;
	}
	
	public Viaje() {
		super();
		// TODO Auto-generated constructor stub
	}
}