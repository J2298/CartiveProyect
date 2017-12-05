package com.job.cartiveweb.dao;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.job.cartiveweb.exception.DAOException;
import com.job.cartiveweb.exception.EmptyResultException;
import com.job.cartiveweb.model.Viaje;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
@ContextHierarchy({
    @ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml"),
    @ContextConfiguration("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
})
@WebAppConfiguration
public class CartiveDAOTest {

	private static final Logger logger = LoggerFactory.getLogger(CartiveDAOTest.class);

	@Autowired
	private CartiveDAO cartiveDAO;

	
	@BeforeClass
	public static void beforeClass() {
		logger.info("Antes de todos los metodos");

	}
	
	@Before
	public  void before() {
		logger.info("Antes de cada metodo");
	}
	
	@Test
	public void testFindViaje() {

		try {
			//
			Viaje via = cartiveDAO.findViaje(2);

			Assert.assertNotNull(via);

			Assert.assertEquals("huancayo", via.getDestino());
			Assert.assertEquals("barcelona", via.getEmpresa().getNombre());
			Assert.assertEquals(20, via.getPrecio());
			Assert.assertEquals("08:00 AM", via.getHorapartida());

			logger.info(via.toString());

		} catch (EmptyResultException e) {
			fail(e.getMessage());
		} catch (DAOException e) {
			fail(e.getMessage());
		}

	}

	@Test
	public void testFindViajeByDestino() {

		try {
			//
			List<Viaje> via = cartiveDAO.findViajeByDestino("huancayo","2017/11/11");

//			Assert.assertEquals("123456", emp.getPassword());
//			Assert.assertEquals("Jaime", emp.getFirstname());
//			Assert.assertEquals("Gomez", emp.getLastname());
//			Assert.assertEquals(2505, emp.getSalary());

			logger.info(via.toString());
			
		} catch (EmptyResultException e) {
			fail(e.getMessage());
		} catch (DAOException e) {
			fail(e.getMessage());
		}

	} 
	
	@After
	public void after() {
		logger.info("Despues de cada metodo");
	}
	
	@AfterClass
	public static void afterClass() {
		logger.info("Despues de todos los metodos");
	}
}
