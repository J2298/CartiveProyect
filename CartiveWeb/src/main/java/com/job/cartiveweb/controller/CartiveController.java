package com.job.cartiveweb.controller;

import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.job.cartiveweb.exception.DAOException;
import com.job.cartiveweb.model.Ticket;
import com.job.cartiveweb.model.User;
import com.job.cartiveweb.model.Viaje;
import com.job.cartiveweb.services.CartiveService;

@Controller
public class CartiveController {

	private static final Logger logger = LoggerFactory.getLogger(CartiveController.class);

	@Autowired
	private CartiveService cartiveService;

	
	
	@GetMapping("/inicio")	
	public ModelAndView index(@ModelAttribute("SpringWeb") Viaje viaje, ModelMap model) {
		User user = new User();
		ModelAndView modelandview = new ModelAndView("web/cartive", "command", viaje);
		logger.info("as+"+ user.getId());

		return modelandview;
	}
	
	@PostMapping("/viaje")
	public ModelAndView find(@ModelAttribute("SpringWeb") Viaje viaje, ModelMap model) {

		logger.info("viaje = " + viaje.getDestino());
		
		SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
		String fecha = dt1.format(viaje.getFechapartida());
		logger.info("fecha = " + fecha);
		ModelAndView modelAndView = null;

		try {
			model.addAttribute("viajes", cartiveService.findViajeByDestino(viaje.getDestino(), fecha));
			model.addAttribute("des", viaje.getDestino());
			modelAndView = new ModelAndView("web/viaje");
		} catch (Exception e) {
			model.addAttribute("message", e.getMessage());
			modelAndView = new ModelAndView("redirect:web/viaje");
		}

		return modelAndView;
	}

	
	
	
	@GetMapping("/viaje")
	public String list(@ModelAttribute("viaje") Viaje viaje, ModelMap model) {
		
		System.out.println(viaje.getDestino());

		try {
		//	model.addAttribute("employees", cartiveService.findViajeByDestino(viaje.getDestino()));
		} catch (Exception e) {
			logger.info(e.getMessage());
			model.addAttribute("message", e.getMessage());
		}

		return "web/viaje";
	}


	@GetMapping("/viaje/detalle/{viaje_id}")
	public ModelAndView detalle(@PathVariable int viaje_id, ModelMap model) {

		ModelAndView modelAndView = null;
		Viaje via = new Viaje();
		
		try {
			via = cartiveService.findViaje(viaje_id);
			model.addAttribute("via", via);
			logger.info(via.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

		modelAndView = new ModelAndView("web/detalle", "command", via);

		return modelAndView;
	}
	
	@GetMapping("/mistickets/{uid}")
	public String list(@PathVariable int uid, @ModelAttribute("tickets") User user, ModelMap model)  {

		
//		User user = new User();
//		Ticket ti = new Ticket();

		try {
		 model.addAttribute("ti", cartiveService.findTicket(uid));
			logger.info("as" + uid);
		} catch (Exception e) {
			logger.info(e.getMessage());
			model.addAttribute("message", e.getMessage());

			e.printStackTrace();

		}

		return "web/tickets";
	
}
}