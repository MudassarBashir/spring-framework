<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
<h2>Hello Spring World!</h2>
Request attribute using Expression Language: ${name}<p/>
<c:out value="${name}"/><p/>
</body>
</html>
