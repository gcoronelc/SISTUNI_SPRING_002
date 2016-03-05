<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Manager Home</title>
    </head>
    <body>
        <div align="center">
            <h1>ADMINISTRADOR CLIENTES</h1>
            <h3><a href="javascript: $.fnCargar('newContact.htm')">Nuevo Contacto</a></h3>
            <table border="1">
                <th>Nro.</th>
                <th>Nombre Completo</th>
                <th>Email</th>
                <th>Direccion</th>
                <th>Telefono</th>
                <th>Accion</th>
                <c:forEach var="contact" items="${listContact}" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${contact.nombreCompleto}</td>
                    <td>${contact.email}</td>
                    <td>${contact.address}</td>
                    <td>${contact.telephone}</td>
                    <td>
                        <a href="javascript: $.fnCargar('editContact.htm?id=${contact.id}')">Edit</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="javascript: $.fnCargar('deleteContact.htm?id=${contact.id}')">Delete</a>
                    </td>
                </tr>
                </c:forEach>             
            </table>
        </div>
    </body>
</html>