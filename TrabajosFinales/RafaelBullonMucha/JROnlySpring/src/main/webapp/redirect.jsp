<%
session.setAttribute("userInSession", null);
session.invalidate();
System.out.println("Sesión cerrada . . .");
%>
<jsp:forward page="index.jsp"></jsp:forward>
