<%@ taglib prefix="srping" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/21/2025
  Time: 5:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Static Resources</title>
</head>
<body>
<img src="resources/images/kid.jpg"/>
<img src="resources/images/user/aoko.jpg"/>
<img src="<srping:url value='resources/images/kid.jpg'/>"/>
<pre>
    <mvc:resources mapping="/abc/**" location="/resources/"/>
</pre>
<img src="abc/images/user/aoko.jpg"/>
</body>
</html>
