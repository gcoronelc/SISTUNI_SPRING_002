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
	<h1>CONSULTAR EMPLEADOS</h1>
	<form id="form1" action="conEmpleados.html">
		Apellido Paterno  :
		<input type="text" name="paterno" value="${paterno}" placeholder="Apellido.."/>
		<input type="button" id="btnConsultar" class="btn btn-success" value="Consultar">
	</form>
	<br/>
	
	<c:if test="${lista != null}">
		<table class="table table-condensed">
			<tr>
				<th>CODIGO</th>
				<th>AP. PATERNO</th>
				<th>NOMBRE</th>
				<th>CIUDAD</th>
				<th>DIRECCION</th>
			</tr>
			<c:forEach items="${lista}" var="r">
				<tr>
					<td>${r.codigo}</td>
					<td>${r.paterno}</td>
					<td>${r.nombre}</td>
					<td>${r.ciudad}</td>
					<td>${r.direccion}</td>
				
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
<script type="text/javascript">
	$("#btnConsultar").click(function(){
		var data = $("#form1").serialize();
		$.post("conEmpleados.html",data,function(html){
			$("#_BODY").html(html);	
		});
	});
</script>
</html>