<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript"
  src="<c:url value='/resources/jquery/jquery.js'></c:url>"></script>
<title>Insert title here</title>
</head>
<body>
  <h1>CONSULTAR CLIENTES</h1>
  <form id="form1">
  
    <table>
      <tr>
        <td>PATERNO</td>
        <td>MATERNO</td>
        <td>NOMBRE</td>
        <td rowspan="2">
          <input style="height: 40px; vertical-align: bottom;" 
          type="button" id="btnConsultar" value="Consultar"/>
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

  <div id="divRpta">ssss</div>
  <script type="text/javascript">
  
    $("#btnConsultar").click(function(){
    	
    	var data = $("#form1").serialize();
    	$.post("getClientes.htm",data,function(arreglo){
    		var texto = "";
    		$.each(arreglo,function(idx,cliente){
    			texto = texto + cliente.codigo + "|" + cliente.paterno + "<br/>";
    		});
    		$("#divRpta").html(texto);
    	});
    	
    });
  
  </script>
</body>
</html>