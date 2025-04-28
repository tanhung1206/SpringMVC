<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/20/2025
  Time: 5:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add a new customer</title>
</head>
<body>
<h1>Add a new customer</h1>
<form action="saveCustomer" method="POST">
    First name: <input type="text" name="first"><br><br>
    Last name: <input type="text" name="last"><br><br>
    Phone number: <input type="text" name="phone"><br><br>
    <input type="submit" value="Add customer">
</form>
</body>
</html>
