<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/22/2025
  Time: 9:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Add a new user</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
<p>Channel name: ${channel}</p>
<h1><spring:message code="userForm.title"/></h1>
<form:form method="post" modelAttribute="newUser" enctype="multipart/form-data">
    <form:errors path="*" cssClass="error"/>
    <p><spring:message code="user.name"/>
        <form:input path="name"/>
        <form:errors path="name" cssClass="error"/>
    </p>
    <p><spring:message code="user.email"/>
        <form:input path="email"/>
        <form:errors path="email" cssClass="error"/>
    </p>
    <p>Birthday:
        <form:input path="birthday"/>
        <form:errors path="birthday" cssClass="error"/>
    </p>
    <p>Age:
        <form:input path="age"/>
        <form:errors path="age" cssClass="error"/>
    </p>
    <p>Role:
        <form:select path="role">
            <form:option value="">Select role</form:option>
            <form:options items="${roles}"/>
        </form:select>
        <form:errors path="role" cssClass="error"/>
    </p>
    <p>Profile image:
        <form:input path="profileImage" type="file"/>
    </p>
    <p>Address info:</p>
    <p>Street:
        <form:input path="address.street"/>
        <form:errors path="address.street" cssClass="error"/>
    </p>
    <p>State:
        <form:input path="address.state"/>
        <form:errors path="address.state" cssClass="error"/>
    </p>
    <p>Zipcode:
        <form:input path="address.zipcode"/>
        <form:errors path="address.zipcode" cssClass="error"/>
    </p>
    <input type="submit" value="Add"/>
</form:form>
</body>
</html>
