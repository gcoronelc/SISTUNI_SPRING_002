<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/css/estilos21.css" />" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>

<table width="80%" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td align="right" width="20%"><img src="<c:url value='/resources/images/frontpage.png'/>" width="48" height="48"/> &nbsp;&nbsp;&nbsp;</td>
    <td align="center" bgcolor="#FFFFFF" width="60%"><table width="578" border="1" cellpadding="1" cellspacing="0" bordercolor="#c70000" style="border-width:1px; border-collapse:collapse">
      <tr>
        <td height="74" bgcolor="#a60e0b" background="<c:url value='/resources/images/sedapar.png'/>"><div align="center"><span class="titulo" style="color:#FFFFFF">Sistema de Administracion de Usuarios</span><br>
          <span class="subtitulo Estilo4">MANTENIMIENTO - 2016</span></div></td>
      </tr>
    </table></td>
    <td align="right" width="20%" >&nbsp;&nbsp;&nbsp;<img src="<c:url value='/resources/images/frontpage.png'/>" width="48" height="48" /></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>

<form method="post" action="home1.htm">
<table width="757" height="245" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
      <td width="201">&nbsp;</td>
      <td width="355" align="center"><table width="380" height="251" border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#c32409" style="border-width:1px; border-collapse:collapse">
          <tr>
            <td width="380" height="249" background="<c:url value='/resources/images/fin.gif'/>" bgcolor="#FFFFFF"><table width="335" border="0" 
		align="center" cellpadding="0" cellspacing="0">
                <tr>
                  <td height="15">&nbsp;</td>
                  <td height="15">&nbsp;</td>
                  <td height="15" colspan="2">&nbsp;</td>
                </tr>
                <tr>
                  <td width="90">&nbsp;&nbsp;&nbsp;</td>
                  <td colspan="2"><div align="center" style="font-size:10pt; color:#FFFFFF"><b>Acceso al Sistema</b></div></td>
                  <td width="24" rowspan="5"><div align="center"></div></td>
                </tr>
                <tr>
                  <td width="90" rowspan="4"><img src="<c:url value='/resources/images/llave_amarilla.png'/>" width="80" height="98"/></td>
                  <td height="24" style="font-size:6px">&nbsp;</td>
                  <td style="font-size:6px">&nbsp;</td>
                </tr>
                <tr>
                  <td width="95" height="25" valign="middle" style="font-size:8pt">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <span class="Estilo2">Usuario</span></td>
                  <td width="126"><label>
                    <input type="text" name="usuario" class="textos" maxlength="15" onChange="this.value=this.value.toUpperCase();" 
		  			 onKeyPress="if(event.keyCode==13) document.getElementById('txtcontrasena').focus();return alfanumerico2(event);" 
					 style="font-size:8pt" value=""
		  			 onFocus="focotext(this);" onBlur="nofocotext(this);" >
                  </label></td>
                </tr>
                <tr valign="middle">
                  <td height="25" valign="middle" style="font-size:8pt">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span class="Estilo2">Contrase&ntilde;a</span></td>
                  <td><label>
                    <input type="password" name="clave" class="textos" maxlength="15" onChange="this.value=this.value.toUpperCase();" 
		  			onKeyPress="if(event.keyCode==13) document.getElementById('cmdaceptar').click();return alfanumerico2(event);" 
					style="font-size:8pt" value=""
		  			onFocus="focotext(this);" onBlur="nofocotext(this);" >
                  </label></td>
                </tr>
                <tr>
                  <td height="19" style="font-size:3px">&nbsp;</td>
                  <td style="font-size:3px">&nbsp;</td>
                </tr>
                <tr align="center">
                  <td height="35" colspan="3"><label>
                    <input  type="submit" value=" Aceptar ">
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <input name="cmdsalir" type="submit" id="cmdsalir" value="    Salir    " style="border:solid; border-width:2px">
                  </label></td>
                  <td height="35" style="font-size:13px"></td>
                </tr>
                <tr>
                  <td colspan="3">&nbsp;</td>
                  <td style="font-size:8px">&nbsp;</td>
                </tr>
            </table></td>
          </tr>
      </table></td>
      <td width="201"><table width="200" height="110" border="0" cellpadding="0" cellspacing="0">
          <tr>
            <td><div align="center"></div></td>
          </tr>
          <tr>
            <td>&nbsp;</td>
          </tr>
      </table></td>
    </tr>
  </table>
</form>

</body>
</html>