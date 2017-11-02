<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title><tiles:insertAttribute name="title"/></title>

<link href="${pageContext.request.contextPath}/static/css/main.css"
	rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/script/jquery-3.2.1.min.js"></script>

<tiles:insertAttribute name="includes"/>

</head>
<body>

<div class="header">
<tiles:insertAttribute name="header"/>
</div>

<div class="toolbar">
	<tiles:insertAttribute name="toolbar"/>
</div>

<div class="content">
<tiles:insertAttribute name="content"/>
</div>

<hr/>
<div class="footer">
<tiles:insertAttribute name="footer"/>
</div>


</body>
</html>