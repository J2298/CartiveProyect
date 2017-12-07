package com.job.cartiveweb.model;

import java.util.Date;

public class Ticket {
	
	int id;
	Date fecha_vencimiento;
	int viaje_id;
	int asiento_id;
	int usuario_id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha_vencimiento() {
		return fecha_vencimiento;
	}
	public void setFecha_vencimiento(Date fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}
	public int getViaje_id() {
		return viaje_id;
	}
	public void setViaje_id(int viaje_id) {
		this.viaje_id = viaje_id;
	}
	public int getAsiento_id() {
		return asiento_id;
	}
	public void setAsiento_id(int asiento_id) {
		this.asiento_id = asiento_id;
	}
	public int getUsuario_id() {
		return usuario_id;
	}
	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", fecha_vencimiento=" + fecha_vencimiento + ", viaje_id=" + viaje_id
				+ ", asiento_id=" + asiento_id + ", usuario_id=" + usuario_id + "]";
	}
	public Ticket(int id, Date fecha_vencimiento, int viaje_id, int asiento_id, int usuario_id) {
		super();
		this.id = id;
		this.fecha_vencimiento = fecha_vencimiento;
		this.viaje_id = viaje_id;
		this.asiento_id = asiento_id;
		this.usuario_id = usuario_id;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
