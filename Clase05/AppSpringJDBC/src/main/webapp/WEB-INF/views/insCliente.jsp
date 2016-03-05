<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>NUEVO CLIENTE</h1>
  <form method="post" action="insCliente.htm">
    <table>
      <tr>
        <td>Paterno</td>
        <td><input type="text" name="paterno"/></td>
      </tr>
      <tr>
        <td>Materno</td>
        <td><input type="text" name="materno"/></td>
      </tr>
      <tr>
        <td>Nombre</td>
        <td><input type="text" name="nombre"/></td>
      </tr>
      <tr>
        <td>DNI</td>
        <td><input type="text" name="dni"/></td>
      </tr>
      <tr>
        <td>Ciudad</td>
        <td><input type="text" name="ciudad"/></td>
      </tr>
      <tr>
        <td>Dirección</td>
        <td><input type="text" name="direccion"/></td>
      </tr>
      <tr>
        <td>Teléfono</td>
        <td><input type="text" name="telefono"/></td>
      </tr>
      <tr>
        <td>Email</td>
        <td><input type="text" name="email"/></td>
      </tr>
    </table>
    <input type="submit" value="Procesar" />
  </form>
  <p>${mensaje}</p>
</body>
</html>