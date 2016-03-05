<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" 
src="<c:url value='/resources/jquery/jquery.js'/>"></script>
<title>Insert title here</title>
</head>
<body>

  <h1>CONSULTAR UN CLIENTE</h1>
  
  <form id="form1">
    C�digo:<br/>
    <input type="text" name="codigo"/>
    <input type="button" id="btnConsultar" value="Consultar"/>
  </form>
  
  <div id="divResultado" style="display: none;">
	  <p>C�digo: <span id="codigo"></span></p>
	  <p>Paterno: <span id="paterno"></span></p>
	  <p>Materno: <span id="materno"></span></p>
	  <p>Nombre: <span id="nombre"></span></p>  
  </div>
  
  <script type="text/javascript">
  
    $("#btnConsultar").click(function(){
    	var data = $("#form1").serialize();
    	$.post("getCliente.htm",data,function(objJson){
    		//$("#divResultado").text(textoJson);
    		if(objJson != null){
	    		$("#codigo").text(objJson.codigo);
	    		$("#paterno").text(objJson.paterno);
	    		$("#materno").text(objJson.materno);
	    		$("#nombre").text(objJson.nombre);
	    		$("#divResultado").show();
    		} else {
          $("#divResultado").hide();
          alert("No existe.");
    		}
    	});
    });
  
  </script>
</body>
</html>