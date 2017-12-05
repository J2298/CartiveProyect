package com.job.cartiveweb.controller;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import javax.servlet.ServletContext;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
@WebAppConfiguration
public class CartiveIntegrationControllerTest {

	@Autowired
	private WebApplicationContext wac;

	private MockMvc mockMvc;
	
	@Before
	public void setup() throws Exception {
	    this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}
	
	@Test
	public void givenWac_whenServletContext_thenItProvidesGreetController() {
	    ServletContext servletContext = wac.getServletContext();
	     
	    Assert.assertNotNull(servletContext);
	    Assert.assertTrue(servletContext instanceof MockServletContext);
	    Assert.assertNotNull(wac.getBean("cartiveController"));
	}

	@Test
    public void showViaje() throws Exception {
		
        mockMvc.perform(get("/viaje/detalle/2"))
                .andExpect(status().isOk())
                .andExpect(view().name("web/detalle"))
                .andExpect(forwardedUrl("/WEB-INF/views/web/detalle.jsp"))
                .andExpect(model().attribute("via", hasProperty("id", is(2))))
                .andExpect(model().attribute("via", hasProperty("destino", is("huancayo"))))
                .andExpect(model().attribute("via", hasProperty("horapartida", is("08:00 AM"))))
                .andExpect(model().attribute("via", hasProperty("numerotickets", is(40))))
                .andExpect(model().attribute("via", hasProperty("precio", is(20))))
            ;
	}

}












