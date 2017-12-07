package com.job.cartiveweb.dao.jdbc;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.job.cartiveweb.dao.CartiveDAO;
import com.job.cartiveweb.exception.DAOException;
import com.job.cartiveweb.exception.EmptyResultException;
import com.job.cartiveweb.mapper.TicketMapper;
import com.job.cartiveweb.mapper.ViajeMapper;
import com.job.cartiveweb.model.Ticket;
import com.job.cartiveweb.model.Viaje;

@Repository
public class CartiveDAOImpl implements CartiveDAO {

	private static final Logger logger = LoggerFactory.getLogger(CartiveDAOImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;


//	@Override
//	public Employee findEmployee(int employee_id) throws DAOException, EmptyResultException {
//
//		String query = "SELECT employee_id, login, password, first_name, last_name, salary, department_id "
//				+ " FROM employees WHERE employee_id = ?";
//
//		Object[] params = new Object[] { employee_id };
//
//		try {
//
//			Employee emp = (Employee) jdbcTemplate.queryForObject(query, params, new EmployeeMapper());
//			//
//			return emp;
//			//return null;
//
//		} catch (EmptyResultDataAccessException e) {
//			throw new EmptyResultException();
//		} catch (Exception e) {
//			logger.info("Error: " + e.getMessage());
//			throw new DAOException(e.getMessage());
//		}
//	}
//
//
//	@Override
//	public void create(String login, String password, String lastname, String firstname, int salary, int dptId) throws DAOException {
//
//		String query = "INSERT INTO employees (login, password, first_name, last_name, salary, department_id)  VALUES ( ?,?,?,?,?,? )";
//
//		Object[] params = new Object[] { login, password, lastname, firstname, salary, dptId };
//
//		//Employee emp = null;
//		
//		try {
//			// create
//			jdbcTemplate.update(query, params);
//
//		} catch (Exception e) {
//			logger.error("Error: " + e.getMessage());
//			throw new DAOException(e.getMessage());
//		}
//		
//
//	}
//
//	@Override
//	public void delete(String login) throws DAOException {
//
//		String query = "DELETE FROM  employees WHERE login = ? ";
//
//		Object[] params = new Object[] { login };
//
//		try {
//			jdbcTemplate.update(query, params);
//		} catch (Exception e) {
//			logger.info("Error: " + e.getMessage());
//			throw new DAOException(e.getMessage());
//		}
//	}
//
//	@Override
//	public void update(String  login, String password, String lastname, String firstname, int salary, int dptId) throws DAOException {
//
//		String query = "UPDATE employees SET password = ?, first_name =?, last_name = ?, salary = ? WHERE login = ?";
//
//		Object[] params = new Object[] { password, lastname, firstname, salary, login };
//
//		
//		try {
//			jdbcTemplate.update(query, params);
//		} catch (Exception e) {
//			logger.info("Error: " + e.getMessage());
//			throw new DAOException(e.getMessage());
//		}
//	}
//
//
//	@Override
//	public Employee findEmployeeByLogin(String login) throws DAOException, EmptyResultException {
//
//		String query = "SELECT employee_id, login, password, first_name, last_name, salary, department_id "
//				+ " FROM employees WHERE login = ? ";
//
//		Object[] params = new Object[] { login };
//
//		try {
//
//			Employee employee = jdbcTemplate.queryForObject(query, params, new EmployeeMapper());
//			//
//			return employee;
//
//		} catch (EmptyResultDataAccessException e) {
//			throw new EmptyResultException();
//		} catch (Exception e) {
//			logger.info("Error: " + e.getMessage());
//			throw new DAOException(e.getMessage());
//		}
//	}
//	
//	@Override
//	public List<Employee> findAllEmployees() throws DAOException, EmptyResultException {
//
//		String query = "SELECT employee_id, login, password, first_name, last_name, salary, department_id FROM employees ";
//
//		try {
//
//			List<Employee> employees = jdbcTemplate.query(query, new EmployeeMapper());
//			//
//			return employees;
//
//		} catch (EmptyResultDataAccessException e) {
//			throw new EmptyResultException();
//		} catch (Exception e) {
//			logger.info("Error: " + e.getMessage());
//			throw new DAOException(e.getMessage());
//		}
//	}
// consulta join empresas y viajes
//	SELECT v.*, e.* FROM viajes v join empresas e on e.id = v.empresa_id
	//final SELECT v.*, e.*, b.* FROM viajes v join empresas e on e.id = v.empresa_id join buses b on v.bus_id = b.id
	@Override
	public List<Viaje> findViajeByDestino(String desnom, String fecha) throws DAOException, EmptyResultException {

		String query = "SELECT v.*, e.*, b.* FROM viajes v join empresas e on e.id = v.empresa_id join buses b on v.bus_id = b.id WHERE upper(v.destino) like upper(?) and v.fechapartida like ? ";
		//String query = "SELECT * FROM viajes WHERE upper(destino) like upper(?) and fechapartida like ? ";

		Object[] params = new Object[] { desnom, fecha };

		try {

			List<Viaje> viajes = jdbcTemplate.query(query, params, new ViajeMapper());
			//
			return viajes;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public Viaje findViaje(int viaje_id) throws DAOException, EmptyResultException {

		String query = "SELECT v.*, e.*, b.* FROM viajes v join empresas e on e.id = v.empresa_id join buses b on v.bus_id = b.id WHERE v.id = ?";
//		String query = "SELECT employee_id, login, password, first_name, last_name, salary, department_id "
//				+ " FROM employees WHERE employee_id = ?";

		Object[] params = new Object[] { viaje_id };

		try {

			Viaje via = (Viaje) jdbcTemplate.queryForObject(query, params, new ViajeMapper());
			//
			return via;
			//return null;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}
	
	@Override
	public List<Ticket> findTicket(int ticket_id) throws DAOException, EmptyResultException {
		String query = "SELECT v.*, a.*, u.*, t.* FROM viajes v JOIN tickets t on v.id = t.viaje_id JOIN asientos a on a.id = t.asiento_id JOIN usuarios u on u.id = t.usuario_id WHERE t.usuario_id = ?";
		//String query = "SELECT fecha_vencimiento, viaje_id, asiento_id, usuario_id FROM tickets WHERE usuario_id = ?";

		Object[] params = new Object[] { ticket_id };

		try {

			List<Ticket> ti = jdbcTemplate.query(query, params, new TicketMapper());
			//
			return ti;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}
//	public Employee validate(String login, String pwd) throws LoginException, DAOException {
//	
//		logger.info("validate(): login: " + login + ", clave: " + pwd);
//	
//		if ("".equals(login) && "".equals(pwd)) {
//			throw new LoginException("Login and password incorrect");
//		}
//	
//		String query = "SELECT login, password, employee_id, first_name, last_name, salary, department_id  "
//				+ " FROM employees WHERE login=? AND password=?";
//	
//		Object[] params = new Object[] { login, pwd };
//	
//		try {
//	
//			Employee emp = (Employee) jdbcTemplate.queryForObject(query, params, new EmployeeMapper());
//			//
//			return emp;
//	
//		} catch (EmptyResultDataAccessException e) {
//			logger.info("Employee y/o clave incorrecto");
//			throw new LoginException();
//		} catch (Exception e) {
//			logger.info("Error: " + e.getMessage());
//			throw new DAOException(e.getMessage());
//		}
//	}
//
}