<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
	<head>
  		<meta charset="UTF-8">
  		<title>Cartive | Login</title>
  		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=yes">
		<link rel='stylesheet prefetch' href='https://fonts.googleapis.com/css?family=Open+Sans'>
		<link rel="stylesheet" href="./resources/login.css">
		<link rel="shortcut icon" type="image/x-icon" href="./resources/images/logo-c.png" />
		<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
		<script src="./resources/login.js"></script>	
	</head>
		
	<body>
		<div class="cont">
			<div class="demo">
				<div class="login">
					<div><img class="logo" src="./resources/images/logo-c.png"></div>
						<form method='post' action="login">
							<div class="login__form">
	        					<div class="login__row">
	          						<svg class="login__icon name svg-icon" viewBox="0 0 20 20">
	            						<path d="M0,20 a10,8 0 0,1 20,0z M10,0 a4,4 0 0,1 0,8 a4,4 0 0,1 0,-8" />
	          						</svg>
	          						<input type="text" class="login__input name" style="color:white" placeholder="Usuario" name="username" required="true"/>
	        					</div>
	        					<div class="login__row">
	          						<svg class="login__icon pass svg-icon" viewBox="0 0 20 20">
	            						<path d="M0,20 20,20 20,8 0,8z M10,13 10,16z M4,8 a6,8 0 0,1 12,0" />
	          						</svg>
	          						<input type="password" class="login__input pass" style="color:white" placeholder="Contraseņa" name="password" required="true"/>
	        					</div>
	        					<button type="submit" class="login__submit">Iniciar Sesion</button>
	        					<p class="login__signup">Los viajes te esperan... &nbsp;</p>
	      					</div>
      					</form>      
     			</div>
			</div>
		</div>
	</body>
</html>