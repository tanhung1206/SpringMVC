<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/22/2025
  Time: 9:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
<h1>User saved successfully</h1>
<p>Name: ${savedUser.name}</p>
<p>Email: ${savedUser.email}</p>
<p>Birthday: ${savedUser.birthday}</p>
<p>Age: ${savedUser.age}</p>
<p>Role: ${savedUser.role}</p>
<h2>Address Info</h2>
<p>Street: ${savedUser.address.street}</p>
<p>State: ${savedUser.address.state}</p>
<p>Zipcode: ${savedUser.address.zipcode}</p>
</body>
</html>
