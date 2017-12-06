package com.job.cartiveweb.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.job.cartiveweb.dao.CartiveDAO;
import com.job.cartiveweb.dao.jdbc.CartiveDAOImpl;
import com.job.cartiveweb.exception.DAOException;
import com.job.cartiveweb.exception.EmptyResultException;
import com.job.cartiveweb.mapper.ViajeMapper;
import com.job.cartiveweb.model.Viaje;

@Service
public class CartiveServiceImpl implements CartiveService {

	@Autowired
	private CartiveDAO cartiveDAO;

	@Override
	public List<Viaje> findViajeByDestino(String desnom, String fecha) throws DAOException, EmptyResultException {
		List<Viaje> viajs = cartiveDAO.findViajeByDestino(desnom, fecha);
		return viajs;
	}

	@Override
	public Viaje findViaje(int viaje_id) throws DAOException, EmptyResultException {
		
		Viaje via = cartiveDAO.findViaje(viaje_id);

		return via;
	}
//	@Override
//	public Employee find(int employee_id) throws DAOException, EmptyResultException {
//		
//		Employee emp = employeeDAO.findEmployee(employee_id);
//
//		return emp;
//	}
//
//	@Override
//	public List<Employee> findAll()
//			throws DAOException, EmptyResultException {
//		
//		List<Employee> emps = employeeDAO.findAllEmployees();
//	
//		return emps;
//	}
//
//	@Override
//	public void update(String login, String password, String lastname, String firstname, int salary, int dptId)
//			throws DAOException {
//	
//		employeeDAO.update(login, password, lastname, firstname, salary, dptId);
//	}
//
//	@Override
//	public void delete(String login) throws DAOException {
//		 
//		employeeDAO.delete(login);
//	
//	}
//
//	@Override
//	public void create(String login, String password, String lastname, String firstname, int salary, int dptId)
//			throws DAOException {
//	
//		employeeDAO.create(login, password, lastname, firstname, salary, dptId);
//
//	}
	
	

}