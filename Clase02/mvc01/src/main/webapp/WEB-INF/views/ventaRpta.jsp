<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>VENTA RPTA</title>
</head>
<body>
  <h1>VENTA RPTA</h1>
  <p>Cliente: ${ventaDto.cliente}</p>
  <p>Producto: ${ventaDto.producto}</p>
  <p>Precio: ${ventaDto.precio}</p>
  <p>Cantidad: ${ventaDto.cant}</p>
  <p>Importe: ${ventaDto.importe}</p>
  <p>Impuesto: ${ventaDto.impuesto}</p>
  <p>Total: ${ventaDto.total}</p>
</body>
</html>