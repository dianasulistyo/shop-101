<%@ page language="java" import="java.util.*" pageEncoding="US-ASCII"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE>
<html>
<head>
<base href="<%=basePath%>">
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.10.0/themes/base/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script src="http://code.jquery.com/ui/1.10.0/jquery-ui.js"></script>
<title>Register Product</title>

	<link rel="stylesheet" type="text/css" href="styles.css">

</head>

<body>
	<form:form modelAttribute="user" action="/add" method="post">
		<form:label path="NAME">Product Name</form:label>
		<form:input path="NAME" />
		<form:label path="PRICE">Price</form:label>
		<form:input path="PRICE" />
		<form:label path="BARCODE">Barcode</form:label>
		<form:input path="BARCODE" />
		<button type="submit" id="add">Add Product</button>
	</form:form>
</body>
</html>
