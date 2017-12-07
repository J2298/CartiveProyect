package com.job.cartiveweb.model;

public class Asiento {
	
	int id;
	int num_asiento;
	String estado;
	int bus_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNum_asiento() {
		return num_asiento;
	}
	public void setNum_asiento(int num_asiento) {
		this.num_asiento = num_asiento;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getBus_id() {
		return bus_id;
	}
	public void setBus_id(int bus_id) {
		this.bus_id = bus_id;
	}
	@Override
	public String toString() {
		return "Asiento [id=" + id + ", num_asiento=" + num_asiento + ", estado=" + estado + ", bus_id=" + bus_id + "]";
	}
	
	

}
