<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

    <head>
        <title>Title</title>
    </head>

    <body>
        <c:forEach var="offer" items="${offers}">
            <c:out value="${offer}"/><p/>
        </c:forEach>
    </body>

</html>
