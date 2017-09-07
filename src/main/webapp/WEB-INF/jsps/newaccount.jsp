<%--
  Created by IntelliJ IDEA.
  User: Shahnaz
  Date: 11/16/2016
  Time: 10:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<html>

    <head>
        <title>Create New Account</title>
        <link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css">
    </head>

    <body>

    <h2>Create New Account</h2>

    <sf:form method="post" commandName="user" action="${pageContext.request.contextPath}/createaccount">

        <table class="formtable">
            <tr><td class="label">Username: </td><td><sf:input class="control" path="username" name="username" type="text" /><br/><div class="error"><sf:errors path="username"></sf:errors></div></td></tr>
            <tr><td class="label">Email: </td><td><sf:input class="control"  path="email" name="email" type="text" /><div class="error"><sf:errors path="email"></sf:errors></div></td></tr>
            <tr><td class="label">Password: </td><td><sf:input class="control"  path="password" name="password" type="text" /><div class="error"><sf:errors path="password"></sf:errors></div></td></tr>
            <tr><td class="label">Confirm Password: </td><td><input class="control"  name="confirmpass" type="text" /><br/></td></tr>
            <tr><td class="label"> </td><td><input class="control"  value="Create account" type="submit" /></td></tr>
        </table>

    </sf:form>
    </body>

</html>
