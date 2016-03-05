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
  <h1>LISTADO DE USUARIOS</h1>
  <form method="post" action="home4.htm">
   
  </form>

  <table border="1" >
    <tr height="25">
      <th background="<c:url value='/resources/images/fin.gif'/>" style="color:#FFFFFF">CODIGO</th>
      <th background="<c:url value='/resources/images/fin.gif'/>" style="color:#FFFFFF">PATERNO</th>
      <th background="<c:url value='/resources/images/fin.gif'/>" style="color:#FFFFFF">PATERNO</th>
      <th background="<c:url value='/resources/images/fin.gif'/>" style="color:#FFFFFF">NOMBRE</th>
      <th background="<c:url value='/resources/images/fin.gif'/>" style="color:#FFFFFF">USUARIO</th>
      <th background="<c:url value='/resources/images/fin.gif'/>" style="color:#FFFFFF">CLAVE</th>
      <th background="<c:url value='/resources/images/fin.gif'/>" style="color:#FFFFFF">DNI</th>
      <th background="<c:url value='/resources/images/fin.gif'/>" style="color:#FFFFFF">CORREO</th>
      <th background="<c:url value='/resources/images/fin.gif'/>" style="color:#FFFFFF">ELIMINAR</th>
    </tr>

    <c:forEach items="${lista}" var="r">  
    <tr height="23">
      <td>${r.id}</td>
      <td>${r.uapaterno}</td>
      <td>${r.uamaterno}</td>
      <td>${r.uanombres}</td>
      <td>${r.usuario}</td>
      <td>${r.clave}</td>
      <td>${r.dni}</td>
      <td>${r.correo}</td>
      <c:if test="${r.id != 1}">
		   <td align="center"><a href="home5.htm?id=${r.id}"><img src="<c:url value='/resources/images/frontpage.png'/>" width="18" height="18" /></a></td>
		</c:if>
    </tr>
    </c:forEach>

  <a href="home0.htm">volver</a><br><br>
  </table>

</body>
</html>