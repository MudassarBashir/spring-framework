<%--
  Created by IntelliJ IDEA.
  User: Shahnaz
  Date: 11/16/2016
  Time: 10:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>

    <head>
        <title>Title</title>
    </head>

    <body>
    <form method="get" action="${pageContext.request.contextPath}/docreate">

        <table>
            <tr><td>Name: </td><td><input name="name" type="text" /></td></tr>
            <tr><td>Email: </td><td><input name="email" type="text" /></td></tr>
            <tr><td>Your offer: </td><td><textarea rows="10" cols="10"></textarea></td></tr>
            <tr><td> </td><td><input value="Create advert" type="submit" /></td></tr>
        </table>

    </form>
    </body>

</html>
