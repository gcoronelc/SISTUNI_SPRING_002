<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>
  <h2>Profesor: ${profesor}</h2>
	<P>The time on the server is ${serverTime}.</P>
	<p><a href="sumar.htm">Sumar</a>
	<p><a href="promediar.htm">Promedio</a>
	<p><a href="venta.htm">Venta</a>
	<p><a href="productos">Catalogo</a>
</body>
</html>
