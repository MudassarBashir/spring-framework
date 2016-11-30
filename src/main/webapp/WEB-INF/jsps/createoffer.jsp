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
        <title>Create offer</title>
        <link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css">
    </head>

    <body>
    <sf:form method="post" commandName="offer" action="${pageContext.request.contextPath}/docreate">

        <table class="formtable">
            <tr>
                <td class="label">Name: </td>
                <td>
                    <sf:input class="control" path="name" name="name" type="text" /><br/>
                    <sf:errors path="name" cssClass="error"/>
                </td>
            </tr>
            <tr>
                <td class="label">Email: </td>
                <td>
                    <sf:input class="control"  path="email" name="email" type="text" /><br/>
                    <sf:errors path="email" cssClass="error"/>
                </td>
            </tr>
            <tr>
                <td class="label">Your offer: </td>
                <td>
                    <sf:textarea class="control"  path="text" name="text" rows="10" cols="10"></sf:textarea><br/>
                    <sf:errors path="text" cssClass="error"/>
                </td>
            </tr>
            <tr>
                <td class="label"> </td><td><input class="control"  value="Create advert" type="submit" /><br/></td>
            </tr>
        </table>

    </sf:form>
    </body>

</html>
