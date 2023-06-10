<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${posts}" var="p">
    <form action="/likes?action=like&&userId=${userLogging.id}&&postId=${p.id}" method="post">
        <p>${p.user.fullName}</p>
        <p>${p.content}</p>
        <c:if test="${userLogging.id==p.user.id}">
            <button onclick="deleteS(${p.id})" type="button">xóa</button>
            <button type="button"><a href="/posts?action=update&&userId=${userLogging.id}&&postId=${p.id}">sửa</a>
            </button>
        </c:if>
        <button type="submit">like</button>
    </form>
    <br>

<%-----------------hiển thị bình luan o day--------------------%>
    <c:forEach items="${comments}" var="c">
        <p>${c.user.username}</p>
        <p>${c.comment}</p>
        <c:if test="${userLogging.id==c.user.id}">
            <button onclick="deleteSS(${c.id})" type="button">xóa bình luận</button>
            <button type="button"><a href="/comments?action=update&&userId=${userLogging.id}&&commentId=${c.id}">
                sửa thằng bình luận
            </a></button>
        </c:if>

    </c:forEach>



<%--------------------đây là phần thêm bình luận -----------------%>
    <form action="/comments?action=create&&userId=${userLogging.id}&&postId=${p.id}" method="post">
        <input type="text" name="comment">
        <button type="submit">add</button>
    </form>
    <%--phần update để sau--%>
    <form action="/comments?action=update&&userId=${userLogging.id}&&postId=${p.id}" method="post">
        <input type="text" name="comments" value="${comments.content}">
        <button type="submit">
            update
        </button>
    </form>



</c:forEach>


</body>
<script>
    function deleteS(id) {
        if (confirm("Are you sure?")) {
            window.location.href = `http://localhost:8080/posts?action=delete&&id=` + id
        }
    }

    function deleteSS(id) {
        if (confirm("Are you sure?")) {
            window.location.href = `http://localhost:8080/comments?action=delete&&id=` + id
        }
    }
</script>
</html>