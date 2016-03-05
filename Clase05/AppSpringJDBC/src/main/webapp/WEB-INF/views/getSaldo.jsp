<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" 
src="<c:url value='/resources/jquery/jquery.js'/>"></script>
</head>
<body>
  <h1>CONSULTAR SALDO</h1>
  <form id="form1" method="post" action="getSaldo.htm">
    Cuenta:<br/>
    <input type="text" id="cuenta" name="cuenta"/>
    <input type="button" id="btnProcesar" value="Consultar"/>
  </form>

  <p>Cuenta: <span id="txtCuenta"></span></p>
  <p>Saldo : <span id="txtSaldo"></span></p>
  
  <div id="divResultado"></div>
  
  <script type="text/javascript">
  
    $("#btnProcesar").click(function(){
    	var data = $("#form1").serialize();
    	var cuenta = $("#cuenta").val();
    	$.post("getSaldo.htm",data,function(texto){
    		// $("#divResultado").html(htmlPage);
    		$("#txtCuenta").text(cuenta);
    		$("#txtSaldo").text(texto);
    	});
    });
  
  </script>
</body>
</html>