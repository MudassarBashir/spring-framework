<%@ page language="java" contentType="text/html; charset=US-ASCII"
         pageEncoding="US-ASCII" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>


<sf:form method="post" action="${pageContext.request.contextPath}/docreate" commandName="offer">

    <sf:input type="hidden" name="id" path="id"/>

    <table class="formtable">
        <tr>
            <td class="label">Your offer:</td>
            <td><sf:textarea class="control" path="text" name="text" rows="10" cols="10"></sf:textarea><br/><sf:errors
                    path="text" cssClass="error"></sf:errors></td>
        </tr>
        <tr>
            <td class="label"></td>
            <td><input class="control" value="Save" type="submit"/></td>
        </tr>
    </table>

</sf:form>
