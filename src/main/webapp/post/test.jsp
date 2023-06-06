<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <button type="button" onclick="deleteS(${p.id})">xóa</button>
        <button type="button"><a href="/posts?action=update&&userId=${userLogging.id}&&postId=${p.id}">sửa</a></button>
    </c:if>
    <button type="submit">like</button></form>
</c:forEach>
</body>
<script>
    function deleteS(id) {
        if (confirm("Are you sure?")) {
            window.location.href = `/posts?action=delete&&id=` + id
        }
    }
</script>
</html>
