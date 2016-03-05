<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Contact</title>
</head>
<body>
    <div align="center">
        <h1>Guardar Contacto</h1>
        <form:form action="saveContact" method="post" modelAttribute="contact">
        <table>
            <form:hidden path="id"/>
            <tr>
                <td>Nombre:&nbsp;</td>
                <td><form:input path="name" /></td>
            </tr>
			<tr>
                <td>Apellido Paterno:&nbsp;</td>
                <td><form:input path="apellidoPaterno" /></td>
            </tr>
			<tr>
                <td>Apellido Materno:&nbsp;</td>
                <td><form:input path="apellidoMaterno" /></td>
            </tr>
            <tr>
                <td>Email:&nbsp;</td>
                <td><form:input path="email" /></td>
            </tr>
            <tr>
                <td>Direccion:&nbsp;</td>
                <td><form:input path="address" /></td>
            </tr>
            <tr>
                <td>Telefono:&nbsp;</td>
                <td><form:input path="telephone" /></td>
            </tr>
			<tr>
                <td colspan="2" align="center">&nbsp;</td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Guardar"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>