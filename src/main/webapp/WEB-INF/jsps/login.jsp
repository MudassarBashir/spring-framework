<%--
  Created by IntelliJ IDEA.
  User: Shahnaz
  Date: 9/6/2017
  Time: 9:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--If the line below isn't added, then the stylesheet doesn't get applied.--%>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Login Page</title>
    <link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css">
</head>
<body onload='document.f.j_username.focus();'>
<h3>Login with Username and Password</h3>
<c:if test="${param.error != null}">
    <p class="error">
Login failed. Check that your username and password are correct.
    </p>
</c:if>
<form name='f' action='${pageContext.request.contextPath}/j_spring_security_check' method='POST'>
    <table class="formtable">
        <tr>
            <td>User:</td>
            <td><input type='text' name='j_username' value=''></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type='password' name='j_password'/></td>
        </tr>
        <tr>
            <td colspan='2'><input name="submit" type="submit" value="Login"/></td>
        </tr>
    </table>
</form>
</body>
</html>