<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script href="<c:url value='/resources/jquery/jquery.js' />" type="text/javascript"></script>
</head>
<body>
  <h1>CONSULTAR UN CLIENTE</h1>
  <form method="post" id="form1" action="getCliente.htm">
    Código:<br/>
    <input type="text" name="codigo"/>
    <input type="submit" value="Consultar" id="btnConsultar"/>
  </form>

  <p>Código: ${cliente.codigo}</p>
  <p>Paterno: ${cliente.paterno}</p>
  <p>Materno: ${cliente.materno}</p>
  <p>Nombre: ${cliente.nombre}</p>
  
  <div id = "divResultado"></div>
  
  <script type="text/javascript">
  
  $("#btnConsultar").click(function(){
	  	var data = $("#form1").serialize();
	  	$.post("getCliente.htm",data,function(textoJson){
	  		$("#divResultado").text(textoJson);
	  	});
  });
  </script>
  
</body>
</html>