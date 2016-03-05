<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/estilos21.css" />" rel="stylesheet">
</head>
<body>
  <h1>NUEVO USUARIO</h1>
  <form method="post" action="home3.htm">
    <table background="<c:url value='/resources/images/fin.gif'/>" style="color:#FFFFFF">
      <tr>
        <td>Ap. Paterno</td>
        <td><input type="text" name="uapaterno"/></td>
      </tr>
      <tr>
        <td>Ap. Materno</td>
        <td><input type="text" name="uamaterno"/></td>
      </tr>
      <tr>
        <td>Ap. Nombres</td>
        <td><input type="text" name="uanombre"/></td>
      </tr>
      <tr>
        <td>Usuario</td>
        <td><input type="text" name="usuario"/></td>
      </tr>
      <tr>
        <td>Clave</td>
        <td><input type="text" name="clave"/></td>
      </tr>
      <tr>
        <td>DNI</td>
        <td><input type="text" name="dni"/></td>
      </tr>
      <tr>
        <td>Correo</td>
        <td><input type="text" name="correo"/></td>
      </tr>
    </table>
    <input type="submit" value="Registrar" />
  </form>
  <p class="subtitulo2">${mensaje}</p>
  <p>Usuario: ${usuario}</p>
  <p>Clave: ${clave}</p>
  <a href="home0.htm">volver</a>
</body>
</html>