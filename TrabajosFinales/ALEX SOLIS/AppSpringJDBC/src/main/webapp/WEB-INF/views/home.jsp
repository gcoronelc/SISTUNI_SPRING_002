<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Home</title>
	<link href="<c:url value="/resources/css/estilos21.css" />" rel="stylesheet">
</head>
<body>
<h1>
	Hello world!  
</h1>

<P class="titulo">  BIENVENIDO: ${usuario}. </P>
<a href="home4.htm">Listar Usuarios</a><br><br>
<a href="home3.htm">Registrar Nuevo Usuario</a><br><br>
<a href="home1.htm">Salir</a>
</body>
</html>
