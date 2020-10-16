<%--
  Created by IntelliJ IDEA.
  User: 寒江醉月
  Date: 2020/5/27
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>参数请求绑定</title>
</head>
<body>
<h3>参数请求绑定</h3>
<h5>封装参数</h5><br>
<form id="" action="request/two" method="post">
    用户名：<input type="text" name="username"><br>
    密 码：<input type="text" name="password"><br>
    <input type="submit" value="提交">
</form>
<br>
<h5>封装参数,含有引用类</h5><br>
<form action="request/three" method="post">
    用户id：<input type="text" name="id"><br>
    用户名：<input type="text" name="user.username"><br>
    密码：<input type="text" name="user.password"><br>
    <input type="submit" value="提交">
</form>
<h5>封装参数,含有集合</h5><br>
<%--map集合和list集合一样  map['one'].username--%>
<form action="request/four" method="post">
    用户id：<input type="text" name="id"><br>
    用户名：<input type="text" name="userList[0].username"><br>
    密码：<input type="text" name="userList[0].password"><br>
    <input type="submit" value="提交">
</form>
<br>
<h5>自定义类型转换器</h5><br>
<%--map集合和list集合一样  map['one'].username--%>
<form action="request/five" method="post">
    日期：<input type="text" name="date"><br>
    <input type="submit" value="提交">
</form>
<br>
<a href="request/six">获取servlet的API</a>
</body>
</html>
