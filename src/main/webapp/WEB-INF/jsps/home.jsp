<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jstl/sql" %>

<html>
<body>
<h2>home.jsp</h2>
<c:forEach var="offer" items="${offers}">
    ID: ${offer.id}<br/>
    Name: ${offer.name}<br/>
    E-mail: ${offer.email}<br/>
    Text: ${offer.text}<br/>
</c:forEach>
</body>
</html>
