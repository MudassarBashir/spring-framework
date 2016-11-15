<%@ page isELIgnored="false" %>
<html>
<body>
<h2>Hello Spring World!</h2>
Session attribute from controller: <%= session.getAttribute("name")%><p/>
Request attribute from controller: <%= request.getAttribute("name")%><p/>
Request attribute using Expression Language: ${name}<p/>


</body>
</html>
