<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/8/11 0011
  Time: 08:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
    <form action="/user/addUser" method="post">
        姓 名：<input type="text" name="userName"/><br/>
        年 龄：<input type="text" name="userAge"/><br/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
