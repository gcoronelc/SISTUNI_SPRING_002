<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${sessionScope.UsuarioLogon == null }">
	<jsp:forward page="login.jsp"/>
</c:if>

<html>
<head>
    
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet" media="screen">
    <link href="<c:url value="/resources/css/bootstrap-theme.css"/>" rel="stylesheet"> 
    <link href="<c:url value="/resources/css/elegant-icons-style.css"/>" rel="stylesheet" />
    <link href="<c:url value="/resources/css/font-awesome.min.css"/>"rel="stylesheet" /> 	
    <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/style-responsive.css"/>" rel="stylesheet" />
    <!-- link href="<c:url value="/resources/css/estilos.css"/>" type="text/css" rel="stylesheet"-->
    <script src="<c:url value="/resources/js/jquery.js"/>" type="text/javascript"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js"/>" type="text/javascript"></script>
	
    <script type="text/javascript">
    	$(document).on('ready',function() {
    		
           $.fnCargar=function(url){
    		   $("#work").load(url);
           };
           
        });
    </script>
    
	<title>Index</title>
</head>
<body>

  <section id="container" class="">
  
  	<jsp:include page="themes/cabecera.jsp"/>
  
  <section id="main-content">
  <div id="work">
  	
  </div>
   </section>

  </section>
	<script src="<c:url value="/resources/js/jquery.scrollTo.min.js"/>" type="text/javascript"></script>
	<script src="<c:url value="/resources/js/jquery.nicescroll.js"/>" type="text/javascript"></script>
	<script src="<c:url value="/resources/js/scripts.js"/>" type="text/javascript"></script>
</body>
</html>