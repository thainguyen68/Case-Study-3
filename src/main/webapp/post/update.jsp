<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 5/6/2023
  Time: 8:25 AM
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
    <form action="/posts?action=update&&userId=${userLogging.id}&&postId=${post.id}" method="post">
        <p>Nhập bài post</p>
        Nhập nội dung mới
        <input type="text" name="content">
        Nhập link ảnh mới
        <input type="text" name="imgUrl">
        <button type="submit">Chỉnh sửa</button>
    </form>
</table>
</body>
</html>
