package com.job.cartiveweb.dao;

import java.util.List;

import com.job.cartiveweb.exception.DAOException;
import com.job.cartiveweb.exception.EmptyResultException;
import com.job.cartiveweb.model.Viaje;

public interface CartiveDAO {

//	Employee findEmployee(int id) throws DAOException, EmptyResultException;
//
//	void create(String login, String password, String lastname, String firstname, int salary, int dptId) throws DAOException;
//
//	void delete(String login) throws DAOException;
//
//	void update(String login, String password, String lastname, String firstname, int salary, int dptId) throws DAOException;
//
//	Employee findEmployeeByLogin(String login) throws DAOException, EmptyResultException;
//
//	List<Employee> findAllEmployees() throws DAOException, EmptyResultException;

	List<Viaje> findViajeByDestino(String desnom, String fecha) throws DAOException, EmptyResultException;

	Viaje findViaje(int viaje_id) throws DAOException, EmptyResultException;
	
//	Employee validate(String idEmployee, String clave) throws LoginException, DAOException;

}