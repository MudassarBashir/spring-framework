<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jstl/sql" %>

<html>

    <head>
        <title>Title</title>
    </head>

    <body>
        <p><a href="${pageContext.request.contextPath}/offers">Show current offers.</a></p>
        <p><a href="${pageContext.request.contextPath}/createoffer">Add a new offer.</a></p>
    </body>

</html>