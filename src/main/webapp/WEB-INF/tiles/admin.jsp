<%@ page language="java" contentType="text/html; charset=US-ASCII"
         pageEncoding="US-ASCII" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<h3>Authorised Users Only!</h3>

<table class="formtable">
    <tr>
        <td>Username</td>
        <td>Email</td>
        <td>Role</td>
        <td>Enabled</td>
    </tr>

    <c:forEach var="user" items="${users}">

        <tr>
            <td><c:out value="${user.username}"/></td>
            <td><c:out value="${user.email}"></c:out></td>
            <td><c:out value="${user.authority}"></c:out></td>
            <td><c:out value="${user.enabled}"></c:out></td>

        </tr>

    </c:forEach>

</table>
