package com.job.cartiveweb.mapper;

import java.sql.SQLException;
import java.sql.ResultSet;
import org.springframework.jdbc.core.RowMapper;

import com.job.cartiveweb.model.Ticket;

public class TicketMapper implements RowMapper<Ticket>{

	public Ticket mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ticket ti = new Ticket();
		ti.setId(rs.getInt("id"));
		ti.setFecha_vencimiento(rs.getDate("fecha_vencimiento"));
		ti.setViaje_id(rs.getInt("viaje_id"));
		ti.setAsiento_id(rs.getInt("asiento_id"));
		ti.setUsuario_id(rs.getInt("usuario_id"));
		
		return ti;
	}
}