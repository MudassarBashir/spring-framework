<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jstl/sql" %>

<html>
<body>
<h2>Hello Spring World!</h2>

<c:out value="${name}"/><p/>

<sql:query var="rs" dataSource="jdbc/spring">
    select id, name, email, text from offers
</sql:query>

<c:forEach var="row" items="${rs.rows}">
    ID: ${row.id}<br/>
    Name: ${row.name}<br/>
</c:forEach>
</body>
</html>
