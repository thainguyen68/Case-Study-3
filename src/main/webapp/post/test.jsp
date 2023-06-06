<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 6/5/2023
  Time: 4:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body><c:forEach items="${posts}" var="p">
<form action="/likes?action=like&&userId=${userLogging.id}&&postId=${p.id}" method="post">

    <p>${p.user.fullName}</p>
    <p>${p.content}</p>
    <c:if test="${userLogging.id==p.user.id}">
        <button onclick="deleteS(${p.id})">xóa</button>
        <button><a href="/posts?action=update&&userId=${userLogging.id}&&postId=${p.id}">sửa</a></button>
    </c:if>
    <button type="submit">like</button></form>
</c:forEach>
</body>
<script>
    function deleteS(id) {
        if (confirm("Are you sure?")) {
            window.location.href = `http://localhost:8080/posts?action=delete&&id=` + id
        }
    }
</script>
</html>
