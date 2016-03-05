<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
   <meta charset='utf-8'>
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <link type="text/css" rel="stylesheet"  href='<c:url value="resources/assets/cssmenu/styles.css"/>'>
   <link type="text/css" rel="stylesheet"  href='<c:url value="resources/assets/css/estilo.css"/>' >	
   <link rel="stylesheet" href='<c:url  value="resources/assets/bootstrap/css/bootstrap.min.css" />'>
   
   <script type="text/javascript" src="<c:url value='resources/assets/cssmenu/jquery-latest.min.js'/>"></script>
   <script type="text/javascript" src="<c:url value='resources/assets/cssmenu/script.js'/>"></script>

   
<title>INGRESO AL SISTEMA DE EUREKABANK</title>
</head>



<body>

	<!-- Cabecera -->
	<header>
		<table width="100%" >
			<tr>
				<td><img alt=""
					src="<c:url value='resources/assets/img/logo/logo.gif' />" width="250" height="57"/> </td>
				<td><h2>Bienvenido: <small> ${sessionScope.usuario.nombre}
					${sessionScope.usuario.paterno} </small></h2>
				</td>
				<td><a href="http://localhost:8084/eurekabank">Salir del sistema</a></td>
			</tr>
		</table>
	</header>

		<!-- Contenido -->
        <section>
		<div id="_BODY" class="_BODY">
			


		</div>

 
        </section>


        <!-- Contenido relacionado-->
        <aside>



		<div id='cssmenu'>
			<ul>
				<li class='active'><a href='#'><span>INICIO</span></a></li>
				<li class='has-sub'><a href='#'><span>Procesos</span></a>
					<ul>
						<li><a href="javascript:fnCargarPagina('insCliente.htm')"><span>Crear Cuenta</span></a></li>
						<li><a href='#'><span>Depósito<span></a></li>
						<li class='last'><a href='#'><span>Retiro</span></a></li>
					</ul></li>
				<li class='has-sub'><a href='#'><span>Tablas</span></a>
					<ul>
						<li><a href="javascript:fnCargarPagina('clienteconsultar.htm')"><span>Clientes</span></a></li>
						<li class='last'><a href='#'><span>Sucursales</span></a></li>
					</ul></li>
				<li class='has-sub'><a href='#'><span>Consultas</span></a>
					<ul>
						<li><a href="javascript:fnCargarPagina('conEmpleados.html')"><span>Empleados</span></a></li>
						<li class='last'><a href='#'><span>Cuentas</span></a></li>
						<li class='last'><a href='#'><span>Movimientos</span></a></li>
					</ul></li>
				<li class='last'><a href='#'><span>Contacto</span></a></li>
			</ul>
		</div>


	</aside>



        <!-- Pie de pagina -->
        <footer>
		Derechos Reservados ® 2016 <br /> <a style="color: black;"
			href="index.html" target="_BLANK">Home Page</a>
        </footer>

	<script type="text/javascript"
		src="<c:url value='resources/assets/js/jquery-1.11.1.min.js'/>"></script>
	<script type="text/javascript">
		function fnCargarPagina(pagina) {
			$("#_BODY").load(pagina);
		}
	</script>


</body>
</html>