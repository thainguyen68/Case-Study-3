<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 5/6/2023
  Time: 8:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<table>--%>
<%--    <form action="/posts?action=update&&userId=${userLogging.id}&&postId=${post.id}" method="post">--%>
<%--        <p>Nhập bài post</p>--%>
<%--        Nhập nội dung mới--%>
<%--        <input type="text" name="content">--%>
<%--        Nhập link ảnh mới--%>
<%--        <input type="text" name="imgUrl" value="${post.imgUrl}">--%>
<%--        <button type="submit"> Edit </button>--%>
<%--    </form>--%>
<%--</table>--%>
<%--</body>--%>
<%--</html>--%>

<html>
<head>
    <title>New Post</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f2f5;
            margin: 0;
            padding: 20px;
        }

        .container {
            max-width: 600px;
            background-color: #fff;
            margin: 0 auto;
            padding: 20px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            margin-top: 75px;
        }

        h1 {
            color: #4472aed4;
            font-size: 24px;
            margin-bottom: 20px;
        }

        .form-group {
            margin-bottom: 20px;
        }

        .form-group label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
            color: #262626b3;
        }

        .form-group textarea {
            width: 100%;
            padding: 10px;
            border: 1px solid #dddfe2;
            border-radius: 5px;
            resize: none;
            font-size: 16px;
            line-height: 1.5;
        }


        .form-group button {
            background-color: #4472aed4;
            color: #fff;
            padding: 10px 16px;
            border-radius: 5px;
            border: none;
            cursor: pointer;
            font-size: 16px;
        }

        .form-group button:hover {
            background-color: #1264bf;
        }
        .backHome{
            display: flex;
            justify-content: start;
            position: fixed;
            margin-top: -460px;
        }
        .backHome > a{
            /*background-color: #c3d2e5d4;*/
            font-size: 20px;
            /*border: 1px solid #c3d2e5d4;*/
            text-decoration: none;
            border-radius: 5px;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Add new post</h1>

    <form action="/posts?action=update&userId=${userLogging.id}&postId=${post.id}&id=${userLogging.id}" method="post">
        <div class="form-group">
            <label for="imgUrl">Upload photos here:</label>
            <input type="url" name="imgUrl" id="imgUrl" value="${post.imgUrl}">
        </div>

        <div class="form-group">
            <label for="content">content:</label>
            <textarea type="text" id="content" name="content"  rows="4"></textarea>
<%--            <input type="text" name="content" id="content" value="${post.content}">--%>
        </div>

        <div class="form-group">
            <button type="submit">Submit</button>
        </div>
    </form>
</div>
<div class="backHome"><a href="/home?id=${userLogging.id}">Back to Home</a></div>
</body>
</html>