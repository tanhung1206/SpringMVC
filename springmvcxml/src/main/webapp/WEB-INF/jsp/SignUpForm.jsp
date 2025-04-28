<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/20/2025
  Time: 3:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign up form</title>
</head>
<body>
<form action="signup" method="post">
    First name: <input type="text" name="firstName"/><br><br>
    Last Name: <input type="text" name="lastName"/><br><br>
    Street: <input type="text" name="address.street"/><br><br>
    Zipcode: <input type="text" name="address.zipcode"/><br><br>
    <input type="submit" value="Sign up"/>
</form>
</body>
</html>
