<%--
  Created by IntelliJ IDEA.
  User: PEX
  Date: 2020/8/26
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Document is request.jsp</h1>
<form action="request" method="post">
    用户名：<input name="name" type="text" value=""><br>
    密 码：<input name="pwd" type="text" value=""><br>
    爱好：<input name="fav" type="checkbox" value="java">java
    <input name="fav" type="checkbox" value="C#">C#
    <input name="fav" type="checkbox" value="php">php
    <input type="submit" value="登录">
</form>
</body>
</html>
