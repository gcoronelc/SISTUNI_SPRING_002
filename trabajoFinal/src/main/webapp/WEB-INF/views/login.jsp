<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximun-scale=1.0, minimum-scale=1.0"/>
    <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet"/>
    <link href="<c:url value="/resources/css/bootstrap-theme.css"/>" rel="stylesheet"/>
    <link href="<c:url value="/resources/css/elegant-icons-style.css"/>" rel="stylesheet" />
    <link href="<c:url value="/resources/css/font-awesome.css"/>" rel="stylesheet" />
    <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/style-responsive.css"/>" rel="stylesheet" />

</head>

  <body class="login-img3-body">

    <div class="container">

      <form class="login-form" action="iniciarSesion.htm" method="post">        
        <div class="login-wrap">
            
            <p class="login-img"><i class="icon_lock_alt"></i></p>
            
            <div class="input-group">
              <span class="input-group-addon"><i class="icon_profile"></i></span>
              <input type="text" name="usuCodigo"class="form-control" placeholder="Usuario" autofocus>
            </div>
            
            <div class="input-group">
                <span class="input-group-addon"><i class="icon_key_alt"></i></span>
                <input type="password" name="usuPassword"class="form-control" placeholder="Password">
            </div>
            
            	<button class="btn btn-primary btn-lg btn-block" type="submit">Iniciar sesi&oacute;n</button>
            	<p class="text-center"><strong>MANCRIS - 2016</strong></p>
            	
            <div class="form-group">
                <c:if test="${requestScope.error != null}">
                	<div  style="margin: 16px;" class="alert alert-danger" role="alert">
                		<p ><span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
                		<strong>${requestScope.error}</strong></p>
                	</div>
                </c:if>
            </div>
            
        </div>
      </form>

    </div>


  </body>
</html>
