<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Session Logout</title>
</head>
<body>
<%
session.invalidate();
%>
<b><h3>Your session has terminated.</h3></b><br><br>
<a href="index5.jsp">Login again</a>

</body>
</html>