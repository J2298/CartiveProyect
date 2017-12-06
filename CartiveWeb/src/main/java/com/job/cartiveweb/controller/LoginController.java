package com.job.cartiveweb.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.job.cartiveweb.model.User;
import com.job.cartiveweb.services.ApiService;
import com.job.cartiveweb.services.ApiServiceGenerator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Controller
public class LoginController {
	
	
	public String vista = "";


	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@GetMapping("/")
	public String main() {
		
		 logger.info("Devolviendo vista Login");
			
		return "redirect:/login";
	}
	
	@GetMapping("/login")
	public String preLogin() {
		
		 logger.info("Devolviendo vista Login");
			
		return "user/login";
	}


	@PostMapping("/login")
	public String login(final Model model,final HttpSession httpSession,
				  @RequestParam(value = "username") String username,
				  @RequestParam(value = "password") String password) throws InterruptedException 
	{								
	
   
    logger.info("Entrando al flujo de APi");
	//Iniciando el API
	 ApiService service = ApiServiceGenerator.createService(ApiService.class);
     Call<User> call = service.loginUser(username, password);
     logger.info("Culminó la creación del APi");			
	//Mensajes de error o bienvenida     
     
     call.enqueue(new Callback<User>() 
     {    	
    	 public void onResponse(Call<User> call, Response<User> response) 
    	 {    		  
    	     try 
    	     {
    	         int statusCode = response.code();
    	         logger.info("HTTP status code: " + statusCode);    
    	         
    	         if (response.isSuccessful()) 
    	         {
    	             User responseMessage = response.body();
    	             logger.info("responseMessage: " + responseMessage);
    	             logger.info("Login correcto");
    	             httpSession.setAttribute("usuario",responseMessage.getUsername());
    	             httpSession.setAttribute("alluser", responseMessage);
    	             vista= "redirect:/inicio";
    	             
    	         } else 
    	         {
    	        	//progressDialog.dismiss();
    	        	 logger.info("Login incorrecto");
    	        	 logger.info("onError: " + response.errorBody().string());
    	        	 model.addAttribute("message", "Usuario y clave incorrectos");
    	             vista="user/login";
    	         }
    	     }catch (Throwable t) 
    	     {
    	         		try 
    	         		{
    	         			logger.info("Error tipo T");
    	         			logger.info("onThrowable: " + t.toString());
    	         			logger.info("onThrowable: " + t.toString(), t);
    	        	
    	         			model.addAttribute("message", t.getMessage());
    	         			 vista= "user/login";   	        	           	             
    	         		} catch (Throwable x) 
    	         		{}
    	     }
    	     
 		}
         public void onFailure(Call<User> call, Throwable t) 
         {	 
        	 logger.info("Error tipo onFailure, demora en responder");
        	 logger.info("onFailure: " + t.toString());
            
        	 model.addAttribute("message", t.getMessage());
        	 vista= "user/login";
	                  
         } 
         
         
      	
     });
     Thread.sleep(2000);
	logger.info("Retorna la vista");
 	logger.info(vista);
 	return vista;
	}
}
