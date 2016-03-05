
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienvenido al Sistema Web de Rafael construido solo con Spring</title>
<script type="text/javascript" language="JavaScript" src="<%= request.getContextPath() %>/js/jquery-1.10.2.js"></script>
<script type="text/javascript" language="JavaScript" src="<%= request.getContextPath() %>/js/jr.js"></script>
</head>
<body onload="loadImagen('<%= request.getContextPath() %>/images/Aporta.jpg');">
<table align="center">
<tr>
<td><img title="Bienvenido al Sistema Web Java Revolutions construido solo con Spring" 
         id="imageWelcome" name="imageWelcome" width="529px" height="409px"></td>
</tr>
</table>
</body>
</html>