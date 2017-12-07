package com.job.cartiveweb.services;

import java.util.List;

import com.job.cartiveweb.exception.DAOException;
import com.job.cartiveweb.exception.EmptyResultException;
import com.job.cartiveweb.model.Ticket;
import com.job.cartiveweb.model.Viaje;

public interface CartiveService {
	
//	Employee find(int employee_id) throws DAOException, EmptyResultException;
//
//	List<Employee> findAll() 
//			throws DAOException, EmptyResultException;
//
//	void update(String login, String password, String lastname, String firstname, int salary, int dptId)
//			throws DAOException;
//
//	void delete(String login) throws DAOException;
//
//	void create(String login, String password, String lastname, String firstname, int salary, int deptId) throws DAOException;

	List<Viaje> findViajeByDestino(String desnom, String fecha) throws DAOException, EmptyResultException;
	
	Viaje findViaje(int id) throws DAOException, EmptyResultException;
	
	List<Ticket> findTicket(int id) throws DAOException, EmptyResultException;



}