package com.job.cartiveweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.job.cartiveweb.model.Bus;
import com.job.cartiveweb.model.Empresa;
import com.job.cartiveweb.model.Viaje;

public class ViajeMapper implements RowMapper<Viaje>{

	public Viaje mapRow(ResultSet rs, int rowNum) throws SQLException {
		Viaje via = new Viaje();
		via.setId(rs.getInt("id"));
		via.setTipo(rs.getString("tipo"));
		via.setDestino(rs.getString("destino"));
		via.setFechapartida(rs.getDate("fechapartida"));
		via.setHorapartida(rs.getString("horapartida"));
		via.setNumerotickets(rs.getInt("numerotickets"));	
		via.setNumeroticketsdisponibles(rs.getInt("numeroticketsdisponibles"));
		via.setNumerohoras(rs.getInt("numerohoras"));
		via.setEmpresa_id(rs.getInt("empresa_id"));
		via.setBus_id(rs.getInt("bus_id"));
		via.setPrecio(rs.getInt("precio"));
		
		Empresa emp = new Empresa();
		emp.setImagen(rs.getString("imagen"));
		emp.setNombre(rs.getString("nombre"));
		emp.setTelefono(rs.getInt("telefono"));
		emp.setPuntuacion(rs.getDouble("puntuacion"));
		
		Bus bus = new Bus();
		bus.setPlaca(rs.getString("placa"));
		bus.setMod_bus(rs.getString("mod_bus"));
		
		via.setEmpresa(emp);
		return via;
	}
}