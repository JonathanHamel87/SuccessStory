<%--
  Created by IntelliJ IDEA.
  User: Jonathan
  Date: 23/10/2020
  Time: 18:31
  Version: 1.1
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List</title>
</head>
<body>
    <c:forEach items="${stories}" var="story">
        ${story.id}
    </c:forEach>
</body>
</html>
