<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="false" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>INGRESO AL SISTEMA DE EUREKA BANK</title>

<!-- CSS -->
<link rel="stylesheet"
	href='<c:url  value="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500" />'>
	
<link rel="stylesheet" 
	href='<c:url  value="resources/assets/bootstrap/css/bootstrap.min.css" />'>
<link rel="stylesheet"
	href='<c:url  value="resources/assets/font-awesome/css/font-awesome.min.css" />'>
<link rel="stylesheet" 
	href='<c:url  value="resources/assets/css/form-elements.css" />'>
<link rel="stylesheet" 
	href='<c:url  value="resources/assets/css/style.css" />'>

<!-- Favicon -->
<link rel="shortcut icon" href="resources/assets/ico/favicon.png">


</head>

<body>

	<!-- Top content -->
	<div class="top-content">
		<div class="inner-bg">
			<div class="container">
				<div class="row">
					<div class="col-sm-8 col-sm-offset-2 text">
						<h1>
							<strong>EUREKABANK</strong>	
						</h1>
							<div class="description">
								<p>
									<c:if test="${mensaje != null}">
										<p class="_error">${mensaje}</p>
									</c:if>
								</p>
							</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-6 col-sm-offset-3 form-box">
						<div class="form-top">
							<div class="form-top-left">
								<img src="resources/assets/img/logo/logo.gif"><br>
								<p>Ingrese su usuario y contraseña :</p>
							</div>
							<div class="form-top-right">
								<i class="fa fa-lock"></i>
							</div>
						</div>
						<div class="form-bottom">
					
							<form  action="login.html" method="post" class="login-form">
								<div class="form-group">
									<label class="sr-only" for="form-username">Username</label> <input
										type="text" name="usuario" placeholder="Usuario..."
										class="form-username form-control" id="form-username">
								</div>
								<div class="form-group">
									<label class="sr-only" for="form-password">Password</label> <input
										type="password" name="clave"
										placeholder="Contraseña..." class="form-password form-control"
										id="form-password">
								</div>
								<button type="submit" class="btn">Ingresar!</button>
							</form>
						</div>
					</div>
				</div>

			</div>
		</div>

	</div>

	<div class="_FOOTER">
		Derechos Reservados ® 2016 <br /> <a style="color: black;"
			href="index.html" target="_BLANK">Home Page</a>
	</div>

	<!-- Javascript -->
	<script src="resources/assets/js/jquery-1.11.1.min.js"></script>
	<script src="resources/assets/bootstrap/js/bootstrap.min.js"></script>
	<script src="resources/assets/js/jquery.backstretch.min.js"></script>
	<script src="resources/assets/js/scripts.js"></script>


</body>

</html>