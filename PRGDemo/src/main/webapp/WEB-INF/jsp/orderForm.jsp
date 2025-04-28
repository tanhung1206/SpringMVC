<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/21/2025
  Time: 5:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order form</title>
</head>
<body>
<form:form action="saveOrder" method="POST" modelAttribute="order">
    Name: <form:input path="productName"/><br><br>
    Quantity: <form:input path="quantity"/><br><br>
    <input type="submit" value="Place Order">
</form:form>
</body>
</html>
