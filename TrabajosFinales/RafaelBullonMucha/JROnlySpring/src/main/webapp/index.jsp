<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<%=request.getContextPath()%>/css/jr.css" rel="stylesheet" type="text/css"/>
<title>Proyecto Web Java Revolutions Only Spring</title>
<script type="text/javascript" language="JavaScript" src="<%= request.getContextPath() %>/js/jquery-1.10.2.js"></script>
<script type="text/javascript" language="JavaScript" src="<%= request.getContextPath() %>/js/index.js"></script>
<script type="text/javascript" language="JavaScript">
/**
 * Funci�n que cancela la forma
 * @return
 */
function cancelar() {
	window.location.replace("<%= request.getContextPath() %>");
}
</script>
</head>
<body onload="carga();">
<form action="<%= request.getContextPath() %>/login.jr" method="POST" onsubmit="return validate();">
<table border="0" align="center">
<tr>
 <!--   <td>
        <form action="https://www.paypal.com/cgi-bin/webscr" method="post" target="_top">
        <input type="hidden" name="cmd" value="_s-xclick"/>
        <input type="hidden" name="hosted_button_id" value="BDBWXVDZJULMG"/>
        <input type="image" src="https://www.paypalobjects.com/es_XC/MX/i/btn/btn_donateCC_LG.gif" border="0" name="submit" alt="PayPal, la forma m�s segura y r�pida de pagar en l�nea."/>
        <img alt="" border="0" src="https://www.paypalobjects.com/es_XC/i/scr/pixel.gif" width="1" height="1"/>
        </form>
    </td>
    <td>
        <img alt="Ayudar a Otros es bueno" border="0" src="<%= request.getContextPath() %>/images/izquierda1.gif"/>
    </td>
    <td>
        <div style="border: 0; height: 100px; overflow: hidden; width: 248px;">
        <iframe align="middle" allowtransparency="true" frameborder="0" marginheight="0" marginwidth="0" scrolling="no" src="http://www.youtube.com/subscribe_widget?p=JavaRevolutions" style="left: -1px; position: relative; top: -1px;" width="250px">
        </iframe>
        </div>
    </td>-->
</tr>
</table>
<div id="mainContainer">
<br><br><br><br>
<table align="center">
<tr>
	<td class="FondoTabla">Usuario :</td>
	<td>
	<input type='text' name='j_username' id="j_username" class="TextoCampo2">
	</td>
</tr>
<tr>
	<td class="FondoTabla">Contrase�a :</td>
	<td>
	<input type='password' name='j_password' id="j_password" class="TextoCampo2"/>
	</td>
</tr>
<tr>
	<td><input type="button" value="Cancelar" class="estiloBoton" onclick="cancelar();"/></td>
	<td><input name="submit" type="submit" value="Aceptar" class="estiloBoton" 
	onclick="return validate();"/></td>
</tr>
</table>
<table align="center">
<tr>
<td style="color: red; font-weight: bold; text-align: justify; font-size: 14px;"
align="center"><%= request.getAttribute("error") != null ? request.getAttribute("error") : "" %></td>
</tr>
</table>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</div>
<jsp:include page="/templates/footer.jsp"></jsp:include>
</form>
</body>
</html>
