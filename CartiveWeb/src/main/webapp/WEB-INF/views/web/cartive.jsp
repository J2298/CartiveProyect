<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
	<head>
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
       	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"></link>
		<link rel="stylesheet" href="./resources/cartive.css">
		<link rel="shortcut icon" type="image/x-icon" href="./resources/images/logo-c.png" />
             	
        <title>Cartive | Principal</title>
    </head>
    
    <body>
    	<nav class="navbar fixed-top navbar-expand-lg navbar-dark fixed-top" style="background-color: #F44336;">
    		<a class="navbar-brand" href="#"><img src="./resources/images/logo.png" height="42" width="118"></img></a>
    		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    			<span class="navbar-toggler-icon"></span>
  			</button>
  			<div class="collapse navbar-collapse" id="navbarNav" align="left">
  				<ul class="navbar-nav ml-auto">
  					<li class="nav-item">
			        	<a class="nav-link" style="color:white" href="#"><i class="fa fa-file-text-o"></i> Imprimir Pasaje</a>
			      	</li>
			      	<li class="nav-item">
			        	<a class="nav-link" style="color:white" href="<%=request.getContextPath()%>/mistickets"><i class="fa fa-ticket"></i> Mis Tickets</a>
			      	</li>
			      	<li class="nav-item">
			        	<a class="nav-link" style="color:white" href="#"><i class="fa fa-user-o"></i> Bienvenido ${alluser.nombres} ${alluser.apellidos}</a>
			      	</li>
			      	<li class="nav-item">
			        	<a class="nav-link" style="color:white" href="<%=request.getContextPath()%>/register"><i class="fa fa-sign-out"></i> Cerrar Sesion</a>
			      	</li>
    			</ul>
  			</div>
		</nav>
		
		<div class="callout">
			<div class="text-vertical-center">
        		<div align="center" id="titulo" >
        			<h1 class="textstyle">Viajes donde viajes, viaja con <img src="./resources/images/logo.png" height="58" width="130"></img></h1>
					<div align="center" id="buscador">
						<h3 class="textstyle">Buscar pasaje</h3>
						<form:form method="post" align="center" class="form-inline" action="/cartiveweb/viaje">
							<div class="inner-addon left-addon">
								<i class="fa fa-bus"></i>
								<form:input  type="text" class="form-control" path="destino" placeholder="Ingrese Destino"/>
							</div>		
	  						<div class="inner-addon left-addon"> 
	  							<i class="fa fa-calendar"></i>
	  							<form:input type="text" class="form-control" path="fechapartida" placeholder="aaaa-mm-dd"/> 
	  						</div>
	  						<button type="submit" class="btn btn-primary">Buscar</button>
	  					</form:form>
	  				</div>
  				</div>
  			</div>
  		</div>
		<br/>

		<!-- Cuerpo de pagina  -->
		
		<!-- Cupon -->
		<div align="center">
			<div class="form-group" >
				<div class="col-md-6">
					<div class="card card-inverse card-warning  text-center" style="background-color: #F44336;"	>
  						<div class="card-block">
    						<blockquote class="card-blockquote"><br/>
      							<img width="100" src="./resources/images/discount.png">
								<h1>Usa el cupon de descuento</h1>
   	 						</blockquote>
  						</div>
					</div>    
				</div>
			</div>
		</div>
		<br/>
		
		<!-- Promociones Tarjetas -->
		<div class="container">
			<div class="row">
		        <div class="col-lg-4 col-sm-6 portfolio-item">
		        	<div class="card h-100">
		            	<a href="#"><img class="card-img-top" src="./resources/images/pro1.jpg"></a>
		            	<div class="card-body">
		            		<h4 class="card-title">
		                		<a href="#">Pareja de Viaje</a>
		              		</h4>
		              		<p class="card-text">Para esta promocion, necesitas de un compañero, quien te acompañara a todas tus aventuras, sin resticciones</p>
		            	</div>
		          	</div>
		        </div>
		        <div class="col-lg-4 col-sm-6 portfolio-item">
		        	<div class="card h-100">
		            	<a href="#"><img class="card-img-top" src="./resources/images/pro2.jpg" alt=""></a>
		            	<div class="card-body">
		              		<h4 class="card-title">
		                		<a href="#">Promo Familiar</a>
		              		</h4>
		              		<p class="card-text">Esta promocion ofrece los mejores descuentos en todos los viajes que realices, en especial si viajas con tu familia.</p>
		            	</div>
		          	</div>
		        </div>
		        <div class="col-lg-4 col-sm-6 portfolio-item">
		        	<div class="card h-100">
		            	<a href="#"><img class="card-img-top" src="./resources/images/pro3.jpg" alt=""></a>
		            	<div class="card-body">
		              		<h4 class="card-title">
		                		<a href="#">Principiante</a>
		              		</h4>
		              		<p class="card-text">Tus primeros viajes, tendran un descuento impresionante, mientras mas viajes, mejores seran tus promociones</p>
		           		</div>
		          	</div>
		        </div>
		     </div>
		 </div>
		 <br/>

		<!-- Buses Logos -->
		<section class="py-5" style="background-color: #F44336;">
      		<div class="container">
      			<h1 class="title" align="center">Las empresas más confiables</h1><br>
        		<div class="row">
        			<div class="col-md-3 col-sm-6">
        				<a href="#">
       						<img class="img-fluid d-block mx-auto tam" src="./resources/images/b1.jpg" alt="">
           				</a>
       				</div>
      				<div class="col-md-3 col-sm-6">
      					<a href="#">
				           	<img class="img-fluid d-block mx-auto tam" src="./resources/images/b2.jpg" alt="">
				        </a>
          			</div>
			        <div class="col-md-3 col-sm-6">
			           	<a href="#">
			           		<img class="img-fluid d-block mx-auto tam" src="./resources/images/b3.jpg" alt="">
			           	</a>
			        </div>
			        <div class="col-md-3 col-sm-6">
			           	<a href="#">
			           		<img class="img-fluid d-block mx-auto tam" src="./resources/images/b4.jpg" alt="">
			           	</a>
			        </div>
        		</div>
      		</div>
    	</section>
    
    	<!-- Servicios Bus -->
    	<section id="services">
      		<div class="container">
        		<div class="row">
          			<div class="col-lg-12 text-center">
            			<h2 class="section-heading">A su servicio</h2>
            			<hr class="my-4">
          			</div>
        		</div>
      		</div>
      		<div class="container">
        		<div class="row">
          			<div class="col-lg-3 col-md-6 text-center">
            			<div class="service-box mt-5 mx-auto">
              				<i class="fa fa-4x fa-shield text-primary mb-3 sr-icons"></i>
              				<h3 class="mb-3">Seguro</h3>
              				<p class="text-muted mb-0">Cumplimos los requisitos y las normas para que nos confie su seguiridad.</p>
            			</div>
          			</div>
		          	<div class="col-lg-3 col-md-6 text-center">
		            	<div class="service-box mt-5 mx-auto">
		              		<i class="fa fa-4x fa-bed text-primary mb-3 sr-icons"></i>
		              		<h3 class="mb-3">Comodo</h3>
		              		<p class="text-muted mb-0">La comodidad de su hogar, la encuentra en cada uno de nuestros buses.</p>
		            	</div>
          			</div>
		          	<div class="col-lg-3 col-md-6 text-center">
		            	<div class="service-box mt-5 mx-auto">
		              		<i class="fa fa-4x fa-handshake-o text-primary mb-3 sr-icons"></i>
		              		<h3 class="mb-3">Confiable</h3>
		             	 	<p class="text-muted mb-0">La empresa es como su familia.</p>
		            	</div>
		          	</div>
          			<div class="col-lg-3 col-md-6 text-center">
            			<div class="service-box mt-5 mx-auto">
		              		<i class="fa fa-4x fa-credit-card text-primary mb-3 sr-icons"></i>
		              		<h3 class="mb-3">Economico</h3>
		              		<p class="text-muted mb-0">Siempre al precio justo y comodo para los clientes.</p>
            			</div>
          			</div>
        		</div>
      		</div>
    	</section>
    
    	<!-- Reseña -->
    	<section class="contact " id="contact">
      		<div class="container">
        		<h2>Somos los primeros en calidad
          			<i class="fa fa-angellist"></i>
        		</h2>
        	</div>
    	</section>
    
    	<!-- Footer -->
    	<footer class="text-center">
      		<div class="footer-above">
        		<div class="container">
          			<div class="row">
            			<div class="footer-col col-md-4">
              				<h3>Ubiquenos</h3>
              				<p>3481 Huarochiri
                				<br>Santa Anita, Lima 996
                			</p>
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
    </body>
</html>
