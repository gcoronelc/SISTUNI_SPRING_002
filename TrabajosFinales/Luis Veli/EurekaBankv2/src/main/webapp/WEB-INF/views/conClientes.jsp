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
<div>
<h1>Consulta de Clientes</h1>
<form id="form1">
  <table class="table table-bordered">
    <tr>
      <td>Código<input type="text" name="codigo" size="10" /></td>
      <td>Ap. Paterno<input type="text" name="paterno"  size="20" /></td>
      <td>Ap. Materno<input type="text" name="materno" size="20"  /></td>
       <td>Nombre<input type="text" name="nombre" size="10"  /></td>
      <td rowspan="3">
        <input type="button" id="btnConsultar"
           class="btn btn-success" value="Consultar"/>
      </td>
    </tr>

  </table>
</form>
</div>
<div id="divClientes">
</div>
</body>
<script type="text/javascript">

  $("#btnConsultar").click(function(){
	  var data = $("#form1").serialize();
	  $.post("clienteconsultar.htm",data,function(response){
		  $("#divClientes").html(response);
	  });
  });


</script>
</html>