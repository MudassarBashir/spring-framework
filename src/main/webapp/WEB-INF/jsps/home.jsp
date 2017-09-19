<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jstl/sql" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<html>

    <head>
        <title>Title</title>
    </head>

    <body>
        <p><a href="${pageContext.request.contextPath}/offers">Show current offers.</a></p>
        <p><a href="${pageContext.request.contextPath}/createoffer">Add a new offer.</a></p>

        <sec:authorize access="!isAuthenticated()">
            <p><a href="<c:url value='/login'/>">Log in</a></p>
        </sec:authorize>

        <sec:authorize access="isAuthenticated()">
            <p><a href="<c:url value='/j_spring_security_logout'/>">Log out</a></p>
        </sec:authorize>

        <sec:authorize access="hasRole('admin')">
            <p><a href="<c:url value='/admin'/>">Admin</a></p>
        </sec:authorize>
    </body>

</html>
