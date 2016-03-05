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
<h1>Listado de Clientes</h1>
<table border="1" class="table table-condensed">
  <tr>
    <th>C�DIGO</th>
    <th>AP. PATERNO</th>
    <th>AP. MATERNO</th>
    <th>NOMBRES</th>
  </tr>

  <c:forEach items="${lista}" var="r">
  <tr>
    <td>${r.codigo}</td>
    <td>${r.paterno}</td>
    <td>${r.materno}</td>
    <td>${r.nombre}</td>
  </tr>
  </c:forEach>
  
</table>
</body>
</html>