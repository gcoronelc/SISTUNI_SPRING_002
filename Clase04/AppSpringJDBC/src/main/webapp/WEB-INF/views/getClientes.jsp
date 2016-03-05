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
  <h1>CONSULTAR CLIENTES</h1>
  <form method="post" action="getClientes.htm">
  
    <table>
      <tr>
        <td>PATERNO</td>
        <td>MATERNO</td>
        <td>NOMBRE</td>
        <td rowspan="2">
          <input style="height: 40px; vertical-align: bottom;" 
          type="submit" value="Consultar"/>
        </td>
      </tr>
      <tr>
        <td><input type="text" name="paterno"/></td>
        <td><input type="text" name="materno"/></td>
        <td><input type="text" name="nombre"/></td>
      </tr>
    </table>    
  </form>

  <h2>LISTA DE CLIENTES</h2>
  <table border="1">
    <tr>
      <th>CODIGO</th>
      <th>PATERNO</th>
      <th>PATERNO</th>
      <th>NOMBRE</th>
      <th>EMAIL</th>
    </tr>

    <c:forEach items="${lista}" var="r">  
    <tr>
      <td>${r.codigo}</td>
      <td>${r.paterno}</td>
      <td>${r.materno}</td>
      <td>${r.nombre}</td>
      <td>${r.email}</td>
    </tr>
    </c:forEach>
  
  </table>

</body>
</html>