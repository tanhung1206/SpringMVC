<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/24/2025
  Time: 1:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><spring:message code="userform.title" text="Default title"/></title>
</head>
<body>
<p><a href="?language=en_US">English</a>|<a href="?language=vi_VN">Việt nam</a> </p>
<h1><spring:message code="userform.title" text="Default title"/></h1>
<form>
    <p>
        <label>
            <spring:message code="userform.username" text="Default username"/>
            <input name="username"/>
        </label>
    </p>
    <p>
        <label>
            <spring:message code="userform.password" text="Default password"/>
            <input name="password"/>
        </label>
    </p>
    <input type="submit" value="<spring:message code="userform.signup" text="Default signup"/>"/>
</form>
</body>
</html>
