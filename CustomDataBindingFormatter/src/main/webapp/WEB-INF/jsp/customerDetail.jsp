<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/20/2025
  Time: 5:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Detail</title>
</head>
<body>
Name: ${customer.first} ${customer.last}<br><br>
Phone: ${customer.phone.areaCode}-${customer.phone.prefix}-${customer.phone.number}
</body>
</html>
