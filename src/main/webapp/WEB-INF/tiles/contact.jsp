<%@ page language="java" contentType="text/html; charset=US-ASCII"
         pageEncoding="US-ASCII" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>

<h2>Send Message</h2>

<sf:form method="post" commandName="message">

    <!-- The two hidden controls below are necessary to integrate the form with the Spring Webflow system -->

    <!-- This key enables Webflow to know where we are in the Webflow at the moment, the 'value' variable will
    be set by Spring Webflow. -->
    <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}"/>
    <!-- The event id determines what happens when we submit the form. It is a way of specifying what happens when
    the form is submitted. It will tell our Webflow to transition from out first view state to our second view state.-->
    <input type="hidden" name="_eventId" value="send"/>

    <table class="formtable">
        <tr>
            <td class="label">Your name:</td>
            <td><sf:input class="control" path="name" type="text" value="${fromName}"/><br/>
                <div class="error">
                    <sf:errors path="name"/>
                </div>
            </td>
        </tr>
        <tr>
            <td class="label">Your email:</td>
            <td><sf:input class="control" path="email" type="text" value="${fromEmail}"/><br/>
                <div class="error">
                    <sf:errors path="email"/>
                </div>
            </td>
        </tr>
        <tr>
            <td class="label">Subject:</td>
            <td><sf:input class="control" path="subject" type="text"/><br/>
                <div class="error">
                    <sf:errors path="subject"/>
                </div>
            </td>
        </tr>
        <tr>
            <td class="label">Your Message:</td>
            <td><sf:textarea class="control" path="content" name="name"
                             type="text"/><br/>
                <div class="error">
                    <sf:errors path="content"/>
                </div>
            </td>
        </tr>
        <tr>
            <td class="label"></td>
            <td><input class="control" value="Send message" type="submit"/></td>
        </tr>
    </table>

</sf:form>
