<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 5/6/2023
  Time: 8:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <c:forEach items="post" var="p">
        <tr>${p.id}</tr>
        <tr>${p.user.getFullName}</tr>
        <tr>${p.content}</tr>
        <tr>${p.img_url}</tr>
        <tr>${p.likecount}</tr>
    </c:forEach>
</table>
</body>
</html>
