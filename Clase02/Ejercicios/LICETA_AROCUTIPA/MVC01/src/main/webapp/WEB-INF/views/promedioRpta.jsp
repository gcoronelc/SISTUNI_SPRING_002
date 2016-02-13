<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	PROMEDIO
</h1>

<P>  Datos:
	<c:forEach items="${datos}" var="r">${r}</c:forEach>
</P>
<P>  Menor: ${menor}. </P>
<P>  Promedio: ${promedio}. </P>
</body>
</html>
