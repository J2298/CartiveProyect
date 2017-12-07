<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
    <head>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
       	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"></link>
		<link rel="stylesheet" href="./resources/viaje.css">
             	
        <title>Cartive | Viajes</title>
         
    </head>
    <body>
    	<nav class="navbar fixed-top navbar-expand-lg navbar-dark fixed-top" style="background-color: #F44336;">
  			<a class="navbar-brand" href="#">Logo(imagen)</a>
  			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    			<span class="navbar-toggler-icon"></span>
  			</button>
  			<div class="collapse navbar-collapse" id="navbarNav" align="left">
    			<ul class="navbar-nav ml-auto">
    				<li class="nav-item">
			        	<a class="nav-link" href="#">Imprimir Pasaje <span class="sr-only">(current)</span></a>
			      	</li>
			      	<li class="nav-item">
			        	<a class="nav-link" href="#">¿Necesita ayuda?</a>
			      	</li>
			      	<li class="nav-item">
			        	<a class="nav-link" href="userLogin.jsp">Iniciar Sesion</a>
			      	</li>
			      	<li class="nav-item">
			        	<a class="nav-link " href="register.jsp">${via.destino}</a>
			      	</li>
    			</ul>
  			</div>
		</nav>
		<br>
		<br>	<br>	<br>	
		<div class="row" >
			<div class="col-sm-4">
				<a href="#">
				<!-- <img alt="" src=""> -->
            	</a>
          	</div>
          	<div class="col-sm-4">
            	<a href="#">
              		<p>Origen: Lima</p>
            	</a>
          	</div>
          	<div class="col-sm-4">
            	<a href="#">
         		<p>Destino:  ${des}</p>
            	</a>
          	</div>
       </div>
       <br/>
       
       <div class="container">
       	<div class="row">
       		<c:forEach var="via" items="${viajes}">
       			<div class="col-lg-4 col-sm-6 portfolio-item">
		        	<div class="card h-100">
		            	<a href="#"><img class="card-img-top" src="./resources/images/pro2.jpg" alt=""></a>
		            	<div class="card-body">
		              		<h4 class="card-title">
		                		<a href="#">Promo Familiar</a>
		              		</h4>
		              		<p class="card-text">${via.destino}</p>
		              		<p class="card-text">${via.fechapartida}</p>		              	
		              		<p class="card-text">${via.numeroticketsdisponibles}</p>
		              		<p class="card-text">${via.horaviaje}</p>
		              		
		            	</div>
		          	</div>
		        </div>
		    </c:forEach>
		</div>
	   </div>
	<br/>
	
	
		   <!-- Footer -->
    <footer class="text-center">
      <div class="footer-above">
        <div class="container">
          <div class="row">
            <div class="footer-col col-md-4">
              <h3>Location</h3>
              <p>3481 Melrose Place
                <br>Beverly Hills, CA 90210</p>
            </div>
            <div class="footer-col col-md-4">
              <h3>Siganos</h3>
              <ul class="list-inline">
                <li class="list-inline-item">
                  <a class="btn-social btn-outline" href="#">
                    <i class="fa fa-fw fa-facebook"></i>
                  </a>
                </li>
                <li class="list-inline-item">
                  <a class="btn-social btn-outline" href="#">
                    <i class="fa fa-fw fa-google-plus"></i>
                  </a>
                </li>
                <li class="list-inline-item">
                  <a class="btn-social btn-outline" href="#">
                    <i class="fa fa-fw fa-twitter"></i>
                  </a>
                </li>
                <li class="list-inline-item">
                  <a class="btn-social btn-outline" href="#">
                    <i class="fa fa-fw fa-linkedin"></i>
                  </a>
                </li>
                <li class="list-inline-item">
                  <a class="btn-social btn-outline" href="#">
                    <i class="fa fa-fw fa-dribbble"></i>
                  </a>
                </li>
              </ul>
            </div>
            <div class="footer-col col-md-4">
              <h3>Contactenos</h3>
              <p>Cualquier duda o sugerencia enviar un correo a 
                <a href="http://startbootstrap.com">suggestions@cartive.pe</a>.</p>
            </div>
          </div>
        </div>
      </div>
      <div class="footer-below">
        <div class="container">
          <div class="row">
            <div class="col-lg-12">
              Copyright &copy; Cartive 2017
            </div>
          </div>
        </div>
      </div>
    </footer>
		        				
</html>
