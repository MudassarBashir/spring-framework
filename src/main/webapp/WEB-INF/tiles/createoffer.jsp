<%@ page language="java" contentType="text/html; charset=US-ASCII"
         pageEncoding="US-ASCII" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>


<sf:form method="post" action="${pageContext.request.contextPath}/docreate" commandName="offer">

    <sf:input type="hidden" name="id" path="id"/>

    <table class="formtable">
        <tr>
            <td class="label">Your offer:</td>
            <td><sf:textarea class="control" path="text" name="text" rows="10" cols="10"/>
                <br/>
                <sf:errors path="text" cssClass="error"/>
            </td>
        </tr>
        <tr>
            <td class="label"></td>
            <td>
                <input class="control" value="Save" type="submit"/>
                <c:if test="${offer.id != 0}">
                    <input class="control" name="delete" value="Delete" type="submit"/>
                </c:if>
            </td>
        </tr>
    </table>

</sf:form>
