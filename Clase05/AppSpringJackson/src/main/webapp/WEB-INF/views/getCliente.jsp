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
  <h1>CONSULTAR UN CLIENTE</h1>
  <form id="form1">
    Código:<br/>
    <input type="text" name="codigo"/>
    <input type="button" id="btnConsultar" value="Consultar"/>
  </form>

  <div id="divRpta" style="display: none;">
	  <p>Código: <span id="codigo"></span></p>
	  <p>Paterno: <span id="paterno"></span></p>
	  <p>Materno: <span id="materno"></span></p>
	  <p>Nombre: <span id="nombre"></span></p>
  </div>
  
  <script type="text/javascript">
  
    $("#btnConsultar").click(function(){
    	
    	var data = $("#form1").serialize();
    	$.post("getCliente.htm",data,function(objCliente){
    		if(objCliente.codigo == "-1"){
    			$("#divRpta").hide();
    			alert("Código no existe.");
    		} else {
    			$("#codigo").text(objCliente.codigo);
    			$("#paterno").text(objCliente.paterno);
    			$("#materno").text(objCliente.materno);
    			$("#nombre").text(objCliente.nombre);
    			$("#divRpta").show();
    		}
    	});
    	
    });
  
  </script>
  
</body>
</html>