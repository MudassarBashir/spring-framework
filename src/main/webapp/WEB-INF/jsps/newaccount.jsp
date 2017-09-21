<%--
  Created by IntelliJ IDEA.
  User: Shahnaz
  Date: 11/16/2016
  Time: 10:16 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>

    <head>
        <title>Create New Account</title>
        <link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="${pageContext.request.contextPath}/static/script/jquery-3.2.1.min.js"></script>
        <script>
            function onLoad() {
                $("#password").keyup(checkPasswordsMatch);
                $("#confirmpass").keyup(checkPasswordsMatch);
                $("#details").submit(canSubmit);
            }

            function canSubmit() {
                var password = $("#password").val();
                var confirmpass = $("#confirmpass").val();

                if (password != confirmpass) {
                    alert("<fmt:message key='UnmatchedPasswords.user.password' />")
                    return false;
                }
                if ((password.length == 0 && confirmpass.length == 0) ||
                        password.length <3 || confirmpass.length < 3) {
                    return false;
                }
                else {
                    return true;
                }
            }

            function checkPasswordsMatch() {
                var password = $("#password").val();
                var confirmpass = $("#confirmpass").val();

                if (password.length > 3 || confirmpass.length > 3) {
                    if (password == confirmpass) {
                        $("#matchpass").text("<fmt:message key='MatchedPasswords.user.password' />");
                        $("#matchpass").addClass("valid");
                        $("#matchpass").removeClass("error");
                    } else {
                        $("#matchpass").text("<fmt:message key='UnmatchedPasswords.user.password' />");
                        $("#matchpass").addClass("error");
                        $("#matchpass").removeClass("valid");
                    }
                }
            }

	$(document).ready(onLoad);
        </script>
    </head>

    <body>
        <h2>Create New Account</h2>

        <sf:form id="details" method="post" action="${pageContext.request.contextPath}/createaccount" commandName="user">

            <table class="formtable">
                <tr>
                    <td class="label">Username: </td>
                    <td>
                        <sf:input class="control" path="username" name="username" type="text" /><br/>
                        <div class="error">
                            <sf:errors path="username"></sf:errors>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td class="label">Email: </td>
                    <td><sf:input class="control"  path="email" name="email" type="text" />
                        <div class="error">
                            <sf:errors path="email"></sf:errors>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td class="label">Password: </td>
                    <td><sf:input id="password" class="control"  path="password" name="password" type="password" />
                        <div class="error">
                            <sf:errors path="password"></sf:errors>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td class="label">Confirm Password: </td>
                    <td><input id="confirmpass" class="control"  name="confirmpass" type="password" />
                        <div id="matchpass"></div>
                    </td>
                </tr>
                <tr>
                    <td class="label"> </td>
                    <td><input class="control"  value="Create account" type="submit" /></td>
                </tr>
            </table>

        </sf:form>
    </body>

</html>
