<%@ page language="java" import="java.util.*" pageEncoding="US-ASCII"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>Product </title>
<link type="text/css" href="resources/styles.css" rel="stylesheet" media="all" />
<link href='http://fonts.googleapis.com/css?family=Viga'
	rel='stylesheet' type='text/css'>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="/resources/styles.css">
	-->
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.10.0/themes/base/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script src="http://code.jquery.com/ui/1.10.0/jquery-ui.js"></script>
</head>

<body>
	

	<div id="menu-holder">

		<div class="price_table">
			<c:forEach var="prod" items="${product}">
				<div class="column_1">
				<ul>
					<li class="header_row_1 align_center">
						<div class="pack-title">${prod.name}</div>
					</li>
					<li class="header_row_2 align_center">
						<div class="price">
							<span>${prod.price}</span>
						</div>
						<div class="time">per kg</div>
					</li>
					<li class="row_style_1 align_center"><span>${prod.barcode}</span></li>
				</ul>
			</div>
			</c:forEach>
			
		</div>
	</div>
</body>
</html>
