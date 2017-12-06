package com.job.cartiveweb.model;

public class Bus {
	
	int id;
	String placa;
	int cap_bus;
	String mod_bus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getCap_bus() {
		return cap_bus;
	}
	public void setCap_bus(int cap_bus) {
		this.cap_bus = cap_bus;
	}
	public String getMod_bus() {
		return mod_bus;
	}
	public void setMod_bus(String mod_bus) {
		this.mod_bus = mod_bus;
	}
	public Bus(int id, String placa, int cap_bus, String mod_bus) {
		super();
		this.id = id;
		this.placa = placa;
		this.cap_bus = cap_bus;
		this.mod_bus = mod_bus;
	}
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}