<!-- Autor: Gustavo Coronel -->
<!-- Blog: gcoronelc.blogspot.com -->

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<link href="<c:url value="/resources/css/estilos.css"/>" rel="stylesheet">
<title>DATOS DEL ESTUDIANTE</title>
</head>
<body>

	<h1>DATOS DEL ESTUDIANTE</h1>

	<c:if test="${mensaje != null}">
		<p class="errorMessage">${mensaje}</p>
	</c:if>

	<form:form commandName="estudianteBean" method="post"
		action="doProcesarEstudiante.htm">

		<fieldset style="width: 300px; margin: 10px;">
			<legend>Ingrese los datos</legend>

			<form:label cssClass="etiqueta" path="nombre">Nombre:</form:label>
			<form:input path="nombre" />
			<br />

			<form:label cssClass="etiqueta" path="nota1">Nota 1:</form:label>
			<form:input path="nota1" />
			<br />

			<form:label cssClass="etiqueta" path="nota2">Nota 2:</form:label>
			<form:input path="nota2" />
			<br />
			
		</fieldset>

		<input style="width: 150px; height: 50px; margin: 10px;" 
		  type="submit" value="Procesar" />

	</form:form>

</body>
</html>
