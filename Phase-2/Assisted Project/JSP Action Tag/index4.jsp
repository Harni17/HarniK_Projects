<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index action tag</title>
</head>
<body>
Usage of useBean tag<br>
<jsp:useBean id="productBean" class="HarniK.ecommerce.ProductBean" scope="session"></jsp:useBean>
        <jsp:setProperty property="productId" name="productBean" value="143"/>
        <jsp:setProperty property="productName" name="productBean" value="phone"/>
        <jsp:setProperty property="price" name="productBean" value="15000.00"/>

<a href="showbean4.jsp">Access bean properties from another page</a><br>
<a href="forward4.jsp">Use Forward action to go to Google</a><br>

<hr>

<jsp:text>
        <![CDATA[This is my content.<br/>This will show within a text action tag exactly as it has been entered]]>
</jsp:text>
</body>
</html>