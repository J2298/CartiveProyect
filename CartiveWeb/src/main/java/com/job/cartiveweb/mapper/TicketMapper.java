package com.job.cartiveweb.mapper;

import java.sql.SQLException;
import java.sql.ResultSet;
import org.springframework.jdbc.core.RowMapper;

import com.job.cartiveweb.model.Asiento;
import com.job.cartiveweb.model.Ticket;
import com.job.cartiveweb.model.User;
import com.job.cartiveweb.model.Viaje;

public class TicketMapper implements RowMapper<Ticket>{

	public Ticket mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ticket ti = new Ticket();
	//	ti.setId(rs.getInt("id"));
		ti.setFecha_vencimiento(rs.getDate("fecha_vencimiento"));
		ti.setViaje_id(rs.getInt("viaje_id"));
		ti.setAsiento_id(rs.getInt("asiento_id"));
		ti.setUsuario_id(rs.getInt("usuario_id"));
		
		Asiento as = new Asiento();
		as.setNum_asiento(rs.getInt("num_asiento"));
		
		Viaje vi = new Viaje();
		vi.setDestino(rs.getString("destino"));
		vi.setFechapartida(rs.getDate("fechapartida"));
		vi.setHorapartida(rs.getString("horapartida"));

		
		User us = new User();
		us.setNombres(rs.getString("nombres"));
		us.setApellidos(rs.getString("apellidos"));
		
		ti.setAsiento(as);
		ti.setViaje(vi);
		ti.setUser(us);
		return ti;
	}
}