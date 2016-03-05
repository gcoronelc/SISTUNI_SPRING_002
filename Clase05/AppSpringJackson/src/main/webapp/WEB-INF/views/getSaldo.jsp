<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript"
	src="<c:url value='/resources/jquery/jquery.js'></c:url>"></script>
<title>Insert title here</title>
</head>
<body>
	<h1>CONSULTAR SALDO</h1>
	<form id="form1">
		Cuenta:<br /> <input type="text" name="cuenta" /> <input type="button"
			id="btnConsultar" value="Consultar" />
	</form>

	<p>
		Cuenta: <span id="txtCuenta"></span>
	</p>
	<p>
		Saldo : <span id="txtSaldo"></span>
	</p>
	
	<div id="div1"></div>

	<script type="text/javascript">
		$("#btnConsultar").click(function() {
			var data = $("#form1").serialize();
			$.post("getSaldo.htm", data, function(objJson) {
				  $("#txtCuenta").text(objJson.cuenta);
				  $("#txtSaldo").text(objJson.saldo);
			});
		});
	</script>

</body>
</html>