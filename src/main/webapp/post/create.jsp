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

    <form action="/posts?action=create&&userId=${userLogging.id}" method="post">

        <p>Nhập bài post</p><br>
        <p>Nhập bài viết</p><br>
        <input type="text" name="content"><br>


        <p>Nhập link ảnh</p><br>
        <input type="url" name="imgUrl" id="imgUrl"><br>


        <button type="submit">Submit</button>
    </form>
</table>
</body>
</html>
