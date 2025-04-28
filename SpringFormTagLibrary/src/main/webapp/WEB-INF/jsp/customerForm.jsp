<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/20/2025
  Time: 5:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add a new customer</title>
</head>
<body>
<h1>Add a new customer</h1>
<form:form action="saveCustomer" method="POST" modelAttribute="customer">
    First name: <form:input type="text" path="first"/><br><br>
    Last name: <form:input type="text" path="last"/><br><br>
    Phone number: <form:input type="text" path="phone"/><br><br>
    Select your country:<br><br>
    <%--    <form:select path="country.id" items="${countryList}" />--%>
    <%--    <form:select path="country.id" items="${countryMap}" />--%>
    <%--    <form:select path="country.id" items="${countryObjList}" itemLabel="name" itemValue="id"/>--%>
    <form:select path="country.id">
        <form:option value="">Please select a country</form:option>
        <form:options items="${countryObjList}" itemLabel="name" itemValue="id"/>
    </form:select><br><br>
    <input type="submit" value="Add customer">
</form:form>
</body>
</html>
